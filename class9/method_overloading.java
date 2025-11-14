package class9;
class maths{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class method_overloading {
    public static void main(String[] args) {
        maths s1=new maths();
        s1.sum(6);
        s1.sum(8,10);
        s1.sum(9,12,10);
        
    }
    
}
