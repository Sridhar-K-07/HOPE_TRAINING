class Game{
    String name;
    String strength;
    Game(String name,String strength){
        this.name=name;
        this.strength=strength;
    }
    void Attack(){
        System.out.print(" ");
    }
}
class Warrior extends Game{
    Warrior(String name,String strength){
        // this.name=name;
        // this.strength=strength;
        super(name,strength);
    }
    void Attack(){
        System.out.println(name+  "  Attack with Sword");
        System.out.println(strength+" Strength ");
        System.out.println("");
    }
}
class Archer extends Game{
    Archer(String name,String strength){
        super(name,strength);
    }
    void Attack(){
        System.out.println(name+" Attack with Arrow");
        System.out.println(strength+"  Strength");
        System.out.println("");
    }
}
class Mage extends Game{
    Mage(String name,String strength){
        super(name,strength);
    }
    void Attack(){
        System.out.println(name+ " Attack with Magic");
        System.out.println(strength+" Strength");
        System.out.println("");
    }
}
public class minigame{
    public static void main(String[] args) {
        Game[] g={new Warrior("barbarion","combat"),new Archer("archery", "support"),new Mage("Wizrd","fireball")};
        for(Game gg:g){
            gg.Attack();
        }
    }
}