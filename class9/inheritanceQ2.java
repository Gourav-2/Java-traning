package class9;
class person{
    void disname(String a){
        System.out.println("your name is :"+" "+a);
    }
}
class student extends person{
    void  disclasss(int b){
        System.out.println("your class is "+" "+b);

    }

}
class monitor extends student{
    void checkdis(){
        System.out.println("checking dicipline");
    }
}

public class inheritanceQ2 {
    public static void main(String[] args) {
        monitor s1= new monitor();
        s1.disname("gourav chouhan");
        s1.disclasss(12);
        s1.checkdis();
        
    }
    
}
