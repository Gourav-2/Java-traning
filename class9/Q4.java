package class9;
class device{
    void poweron(){
        System.out.println("pc is starting ");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("device is booting ");
    }
}
class gaminglaptop extends laptop{
    void startgame(){
        System.out.println("game is starting");
    }
}







public class Q4 {
    public static void main(String [] args){
        gaminglaptop s1 = new gaminglaptop();
        s1.poweron();
        s1.boot();
        s1.startgame();

    }
    
}
