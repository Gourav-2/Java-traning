package class9;
class employee {
    void work(){
        System.out.println("working ");
    }
}
class manager extends employee{
     void attendmeeting(){
        System.out.println("meeting meeting ");

    }
}

public class inheritanceq {
    public static void main(String[] args) {
        manager s1 = new manager();
        s1.work();
        s1.attendmeeting();
        
    }
    
}
