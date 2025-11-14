package class7;

import class2.string;

class car{
    int a;
    String b;
    car(int a,String b){
        this.b=b;
        this.a=a;
        System.out.println("hello gyan " + b);
    }
    
    
    // void sum(){
    //     System.out.println("jai gyan bhai");
    // }
}

public class constracter {
    public static void main(String[] args) {
        car  obj = new car(4,"hello");
        
        // car  obj1 = new car(5);
        
        // obj.sum();


        
    }
    
}
