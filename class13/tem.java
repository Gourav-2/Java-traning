package class13;

import java.io.*;


public class tem {
    // static void enterdata(){//enter data in file
    //     try {
    //         FileWriter writer=new FileWriter("hello.txt",true);
    //         writer.write("hello om ");
    //         writer.close();
    //     } catch (Exception e) {
    //         System.out.println(e);
    //         // TODO: handle exception
    //     }

    // }
    // static void readdata(){
    //     try {
    //         FileReader reader = new FileReader("hello.txt");
    //         int ch;
    //         while((ch=reader.read())!=-1){
    //             System.out.println((char)ch);
    //         }
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }
    static void datadelete(){
        try {
            File file=new File("hello.txt");
            if(file.delete()){
                System.out.println("file deleted");

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }



    public static void main(String[] args) {
        // enterdata();
        //file creation 
        // readdata();
        datadelete();
        // try {   //file variable
        //     File file= new File("hello.txt");
        //     if(file.createNewFile()){
        //         System.out.println("file created ");
        //     }else{
        //         System.out.println("file already created ");
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
    }
    
}
