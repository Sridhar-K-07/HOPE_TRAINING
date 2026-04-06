class InvalidAgeException extends Exception{

    public InvalidAgeException(String message) {
            super(message);
    }
    
}
public class Age {
    public static void checkage(int age) throws InvalidAgeException{
         {
            if(age<18){
               throw new InvalidAgeException("Not Eligible to Vote");
            }
        } 
        else {
            System.out.println("Eligible to vote");
            
        }
    }
    public static void main(String[] args) {
        try {
            checkage(10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
