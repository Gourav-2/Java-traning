package class9;
class animal{
    void eat(){
        System.out.println("pizza");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("roti");
    }
}
public class overwriting {
    public static void main(String[] args) {
        dog s1= new dog();
        s1.eat();
        
    }
    
}
