
package two;

public class Main {
    public static void main(String[] args) {
        Error error = new Error();
        
        try{
            error.error();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(" final error");
        
    }
}
