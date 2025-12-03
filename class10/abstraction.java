package class10;
abstract class animal{
    abstract void eat();
}
class cat extends animal{
    void eat(){
        System.out.println("kitkat");
    }

}

public class abstraction {
    public static void main(String[] args) {
        cat s1= new cat();
        s1.eat();
        
    }
    
}
