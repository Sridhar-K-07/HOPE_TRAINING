class Product{
    String name;
    int Stock;
    double price;

    Product(String name,int stock,double price) {
        this.name=name;
        this.stock=stock;
        this.price=price;
    }

    
}
class User{
    String user_name;
    String add;
    User(String user_name,String add){
        this.user_name=user_name;
        this.add=add;
    }
}
class Order{
    String user;
    String ordered_product;
    int quantity;
    Order(String ordered_product,String user,int quantity){
        this.ordered_product=ordered_product;
        this.user=user;
        this.quantity=quantity;
    }
}
public class E_Commerce {
    public static void main(String[] args) {
        
    }
}
