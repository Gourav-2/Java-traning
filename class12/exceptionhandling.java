package class12;

public class exceptionhandling {
    public static void main(String[] args) {
        
        try {
            voteage(2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    static void voteage(int age) throws IllegalAccessException{
        System.out.println("check vote ");
        if(age<18){
            // System.out.println("you cant vote");
            throw new IllegalAccessException("aap vote nahi de sakye hai");
        }
        else{
            System.out.println("you vote");
        }

    }
    
}
