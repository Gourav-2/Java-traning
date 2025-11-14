package class8;

class parent{
    int x= 10;
    parent(){
        System.out.println(x);
    }
}
class child extends parent{
    int x=20;
    child(){
        System.out.println(this.x);
        System.out.println(super.x);
    }
    void show(){
        int x =30;
        System.out.println("local x="+" "+x);
        System.out.println("this. x="+" "+this.x);
        System.out.println(" super.x="+" "+super.x);
    }

}

public class this_super {
    public static void main(String[] args) {
        child s1=new child();
        s1.show();


        
    }
    
}
