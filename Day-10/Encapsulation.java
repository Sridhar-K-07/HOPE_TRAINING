class Bankaccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public  double  getBalance(){
       return balance;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Bankaccount b=new Bankaccount();
        b.setBalance(1000.00);
        System.out.println(b.getBalance());
    }
}