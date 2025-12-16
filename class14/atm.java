package class14;


public class atm {
    class bank{
        int balance=100;
        synchronized void withdraw(int amt){
            System.out.println(Thread.currentThread().getName());
            if (balance >=amt){
                
            }
        }
    }
    public static void main(String[] args) {
       System.out.println("hello");
        
    }

    
}
