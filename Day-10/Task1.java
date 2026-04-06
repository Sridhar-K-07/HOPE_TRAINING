class Locker{
    private String locker_id;
    private int pin;
    //String item;
    private String storedItem;
    private boolean islocked=true;
    Locker(int pin,String locker_id){
        this.pin=pin;
        this.locker_id=locker_id;
        islocked=true;
    
    }
    public void storeItem(int inp,String item){
        if(inp == pin){
           if(!islocked){
            storedItem=item;
            System.out.println("Stored Successfully");
           }
           else{
            System.out.println("locker is locked");
           }
        }
        else{
            System.out.println("pin is invalid");
        }
        
    }
    public void retriveItem(int inp){
        if(inp == pin){
        if(!islocked && storedItem!=null){
            
            System.out.println(storedItem+"retreived");
        }

        
        else{
            System.out.println("Item not found");
        }
    
}
else{
    System.out.println("pin is invalid");
}
}
public void lock(){
    islocked=true;
    System.out.println("locked");
}
public void unlock(int inp){
    if(this.pin==inp){
        islocked=false;
        System.out.println("Unlocked");
    }
    else{
        System.out.println("Invalid pin");
    }
}
}
public class Task1 {
    public static void main(String[] args) {
        Locker l=new Locker(1234,"Sridhar");
        l.unlock(1234);
        l.storeItem(1234, "Gold ");
        l.retriveItem(1234);
        l.lock();
    }
}

/*
Design Document editor where user create different types of docuument like textdoc,image doc,spreadsheet doc.

Requirent:
1.each document should open ,save,close
2.diff document types behaves differently 
text -> shows text contents 
image -> renders image
Spreadsheet -> calculate cells.
rules:
user shuld not know interva logic
documment must be protected
System should allow adding new document type.


rules1: abstracction
rules2: encapsulation
rules3: inheritance
*/
