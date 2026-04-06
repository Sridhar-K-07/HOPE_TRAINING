
class Notification{
    String name;
    String message;
    String contact;
    
    Notification(String name,String message,String contact){
        this.name=name;
        this.message=message;
        this.contact=contact;
    }
     
     void send(){
        System.out.print("EMail");
     }
}
class Email extends Notification{

    Email(String name,String message,String contact){
        super(name,message,contact);
    }

    @Override
    void send(){
        System.out.println("Email sended to "+name);
        System.out.println("Email received is  "+message);
        System.out.println("Emailid is  "+contact);
    }


    void ChangeEmail(){
        System.out.print("Email changed");
    }
}

class SMS extends Notification{
    SMS(String name,String message,String contact){
         super(name,message,contact);
    }
    @Override
    void send(){
        System.out.println("SMS sended to "+name);
        System.out.println("SMS received is  "+message);

        System.out.println("Phoneno is  "+contact);
    }
}

public class notifyarr {
    public static void main(String[] args){
        Notification[] n={new Email("abc","aaaa","0009090"),new SMS("aaannsn","akdjhk","909009009")};
        for (Notification nn : n) {
            nn.send();
        }
        
    }
}