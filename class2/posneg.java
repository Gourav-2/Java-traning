package class2;
import java.util.*;
public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer :");
        int a = sc.nextInt();


        if(a<0){
            System.out.println("Negative");
        }
        else if (a>0) {
            System.out.println("Positive");
            
        }
        else if (a==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Invalid Enter-");
        }
    }
    
}
