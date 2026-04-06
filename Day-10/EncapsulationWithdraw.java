class Bankaccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.print("amount Debited "+amount);
        }
        else{
            System.out.println("Invalid input");
        }
    }
      public void deposit(int amount){
          if(amount>0){
            balance+=amount;
            System.out.println("Amount credited:"+amount);
          }
          else{
            System.out.println("invalid amount entered");
          }
    }
     public double getBalance(){
        return balance;
    }

}
public class EncapsulationWithdraw {
    public static void main(String[] args) {
        Bankaccount b=new Bankaccount();
 b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(200);
        b.deposit(100);
        b.withdraw(-2000);
    }
}
