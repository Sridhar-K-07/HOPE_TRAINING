import java.util.*;
class Product{
    
    int identity;
    String name;
    double price;
    int quantity;
    
    Product(int id,String n,double p,int q){
        this.identity=id;
        this.name=n;
        this.price=p;
        this.quantity=q;
    }
    double gettotalprice(){
        return this.quantity*this.price;
    }
    void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Price:"+this.price);
        System.out.println("quantity:"+this.quantity);
        System.out.println("id:"+this.identity);
        
    }
}

public class Oopbasic {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double granttotal=0.00;
        Product[] P=new Product[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            String name=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            P[i]=new Product(id,name,price,quantity);
            granttotal+=P[i].gettotalprice();
        }
        for(int i=0;i<n;i++){
            P[i].display();
        }
        System.out.print(granttotal);

sc.close();
   }
        
       
}

