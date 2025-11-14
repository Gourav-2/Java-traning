package class9;
class book{
    void read(){
        System.out.println("book is read by me ");
    }
}
class novel extends book{
    void storyline(){
        System.out.println("story line ");
    }
}

public class Q5 {
    public static void main(String[] args) {
        novel s1 = new novel();
        s1.read();
        s1.storyline();
    }

    
}
