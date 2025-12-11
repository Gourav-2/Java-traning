package class14;
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 1;i<=5;i++){
            System.out.println("dowloading......"+(i*20)+"%");
            try {
                Thread.sleep(2000);//ye funtion time ke liaa thraed ko block kar deta hai
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();

        //  try {
        //     t1.join();//join method se jab uppaa ka code nahi chlta jab tak neeche ka nahi chalta 
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        
        for(int i = 1;i<=5;i++){
            System.out.println("timer"+i);
        }
       
        
        
        // for(int i =0;i<5;i++){
        //     System.out.println(i+"main");
        // }
        
        
       
        

        
    }
    
}
