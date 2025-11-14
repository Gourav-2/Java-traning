package class9;
class shape{
    void draw(){
        System.out.println("drawing");
    }
}
class circle extends shape
{
    void calculate(int r){
        double a = 3.14*r;
        System.out.println("circle area is "+"  "+a);
    }
}
public class Q3 {
    public static void main(String args[]){
        circle s1= new circle();
        s1.draw();
        s1.calculate(10);

    }
    
}
