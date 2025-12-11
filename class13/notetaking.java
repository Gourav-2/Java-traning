package class13;

import java.io.*;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class notetaking {
    static void writedata(String data){//thid funtion use write data ki file
        try {
            FileWriter writer=new FileWriter("try.txt",true);
            writer.write(data);
            writer.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    static void Fileread(){//this function use to read data inside file
        try {
            FileReader reader = new FileReader("try.txt");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    static void filedelete(){
        try {
            File file = new File("try.txt");
            if(file.delete()){
                System.out.println("file is deleted ");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE CHOIEC YOUR OPTION-->");
        System.out.println("1. CREATE  A FILE ");
        System.out.println("2. READ A FILE  ");
        System.out.println("3. DELETE A FILE  ");
        System.out.print("Please enter your option -->");
        int a=sc.nextInt();
        
        if(a==1){
            System.out.print("Enetr your meassge write in new file->");
            String s = sc.next();
            
            writedata(s);
            System.out.println("your file is created ");
        }else if(a==2){
            Fileread();

        }else if (a==3){
            
            filedelete();
        

        }
        
       
        
    }
    
}
