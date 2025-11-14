package class6;

public class main {
    // String b= "hii java ";
    // int data =20;
    // static int a=5;
    //************creation of function***** */
    void sum(){
        System.out.println("hii java ");           //ye unstatic fun hai jisko object banakar call karte hai 
    }

    static void hii(){
        System.out.println("this is statics fun");        //ye static fun hai jisko object banakar call nahi  karte hai sidhe call ho jata hai 
    }

    public static void main(String[] args) {
        // System.out.println(data);
        // main obj =new main();
        main obj = new main();
        obj.sum();
        hii();
        
        // System.out.println(obj.b);
        // System.out.println(obj.data);
        // System.out.println(a);

    }
    
}
