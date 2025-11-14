package class6;

class math{
    String a="adddition";
    void show(){
        System.out.println(a);                   // yaha ham alag class bana rahe  hai 
    }
    void sum(int a,int b){
        int c = a+b;
        System.out.println(c);

    }
}

class goo{
    void soo(){
        System.out.println("hii java");
    }
}
public class class1 {
    public static void main(String[] args) {
        math obj = new math();                   // math class ke liaa alg object 
        goo obj1 = new goo();

        obj.show();
        obj.sum(10,40);
        obj1.soo();
        
    }
    
}
