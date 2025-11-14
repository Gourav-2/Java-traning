package practies;


class rectangle {

    int l;
    int b;
    void area(){
        int ar=(l*b);
        System.out.println("area"+ ar);
    }
    void peri(){
        int pr=(2*(l*b));
        System.out.println("perimeter"+ pr);
    }

}
public class qq {
    public static void main(String[] args) {

        rectangle s1 = new rectangle();
        s1.l=10;
        s1.b=20;
        s1.area();
        s1.peri();
        
    }
    
}
