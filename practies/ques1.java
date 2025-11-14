package practies;

class student{
    String Name ="Gourav Chouhan";
    String RollNo ="0246CS241125";
    double mark= 7.94;
    void display(){
        System.out.println(Name);
        System.out.println(RollNo);
        System.out.println(mark);

    }
}

public class ques1 {
    public static void main(String[] args) {

        
        student obj = new student();
        obj.display();
    }

    
}
