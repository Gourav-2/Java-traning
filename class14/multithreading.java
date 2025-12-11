package class14;
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 0;i<5;i++){
            System.out.println(i+"t1");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        MyThread T1=new MyThread();
        T1.start();
        for(int i =0;i<5;i++){
            System.out.println(i+"main");
        }
        
    }
    
}
