import java.util.*;



enum Permission {
    READ, WRITE, DELETE
}

enum Status {
    ACTIVE, BLOCKED
}


class Role {
    private String name;
    private Set<Permission> permissions;

    public Role(String name) {
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    public String getName() {
        return name;
    }
}


abstract class User {
    private String username;
    private Status status;
    private List<Role> roles;

    public User(String username) {
        this.username = username;
        this.status = Status.ACTIVE;
        this.roles = new ArrayList<>();
    }

    public void assignRole(Role role) {
        roles.add(role);
    }

    public boolean hasPermission(Permission permission) {
        if (status == Status.BLOCKED) return false;

        for (Role role : roles) {
            if (role.hasPermission(permission)) {
                return true;
            }
        }
        return false;
    }

    public void blockUser() {
        status = Status.BLOCKED;
    }

    public String getUsername() {
        return username;
    }

    public abstract void display();
}



class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    @Override
    public void display() {
        System.out.println("Admin: " + getUsername());
    }
}



class NormalUser extends User {
    public NormalUser(String username) {
        super(username);
    }

    @Override
    public void display() {
        System.out.println("User: " + getUsername());
    }
}


class PermissionService {

    public boolean checkAccess(User user, Permission permission) {
        boolean result = user.hasPermission(permission);

        System.out.println(
            "User: " + user.getUsername() +
            " | Permission: " + permission +
            " | Access: " + result
        );

        return result;
    }
}



public class project {
    public static void main(String[] args) {


        Role adminRole = new Role("ADMIN");
        adminRole.addPermission(Permission.READ);
        adminRole.addPermission(Permission.WRITE);
        adminRole.addPermission(Permission.DELETE);

        Role userRole = new Role("USER");
        userRole.addPermission(Permission.READ);

        User admin = new Admin("Alice");
        admin.assignRole(adminRole);
        User user = new NormalUser("Bob");
        user.assignRole(userRole);

        PermissionService service = new PermissionService();
        admin.display();
        user.display();
        service.checkAccess(admin, Permission.DELETE);
        service.checkAccess(user, Permission.DELETE);
        user.blockUser();
        service.checkAccess(user, Permission.READ);
    }
}
