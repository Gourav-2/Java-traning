package class10;
class animal{
    void eat(){
        System.out.println("roti");
    }
    void data(){
        System.out.println("hii");
    }
};
class dog extends animal{
    void eat(){
        System.out.println("pizza");
    }
    void sleep(){
        System.out.println("zzzzzzzzzzzzz");
    }

};

public class overwriting {
    public static void main(String[] args) {
    animal s1 = new dog();          //yaha ovrewriting lagegi 
    // s1.eat();             // yaha par jo function animal or dog me common hai vahi chalega
    // s1.data();            // this is called uppercasting 
    dog s2=(dog)s1;      //this is called lowercasting 
    s2.sleep();


       
    }
    
}
