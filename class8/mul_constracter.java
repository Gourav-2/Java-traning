package class8;

//**********************multiconstracter************* */
// class car{

//     int a;
//     int b;


//     public car(){
//         System.out.println("hii java");
//     }
//     public car(int a){
//         System.out.println(a);
//     }
//     public car(int a,int b){
//         this.a=a;
//         this.b=b;
//         System.out.println(a+" "+b);

//     }
// }


//********************chainconstracter************* */
class car{

    


    public car(){
        this(5);
        System.out.println("hii java");
    }
    public car(int a){
        this(5,9);
        System.out.println(a);
    }
    public car(int a,int b){
        
        
        System.out.println(a+" "+b);

    }


///**************ulta chain constracter************ */

// public car(){
        
//         System.out.println("hii java");
//     }
//     public car(int a){
//         this();
//         System.out.println(a);
//     }
//     public car(int a,int b){
//         this(5);
        
//         System.out.println(a+" "+b);

//     }
}

public class mul_constracter {
    public static void main(String[] args) {
        car s1 = new car();
        // car s2 = new car(5);
        // car s3 = new car(6,10);



        // int d=s3.a+s3.b;
        // System.out.println(d);
        
        
    }
    
}
