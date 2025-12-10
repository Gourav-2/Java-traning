package class13;
import java.io.*;

public class filecreation {
    // static void writedata(String data){//thid funtion use write data ki file
    //     try {
    //         FileWriter writer=new FileWriter("try.py",true);
    //         writer.write(data);
    //         writer.close();

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }
    static void Fileread(){
        try {
            FileReader reader = new FileReader("try.py");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.println((char)ch);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        // File file = new File("try.py");//code file banane ke liaa is code ka use hota hai
        // try {
        //     if(file.createNewFile()){//createnewfile() se hi file create hoti hai
        //         System.out.println("file crreated ");
        //     }else{
        //         System.out.println("file already created ");
        //         System.out.println(file.getPath());
        //     }
        // } catch (Exception e) {
            
        //     System.out.println(e);
        // }
        // writedata("print('hello')");
        Fileread();
    }


    
}
