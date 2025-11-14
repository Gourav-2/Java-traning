package class4;
import java.util.*;
public class string1 {
    public static void main(String[] args) {
        // String str="hello";
        // String str1="";
        // for(char ch :str.toCharArray()){
        //     if(str1.indexOf(ch)==-1){
        //         str1+=ch;

        //     }
        // }
        // System.out.println(str1);
        



        // ***************************frequancy********************
        // int freq[]= new int[256];


        // String str="banana";
        // for(char ch :str.toCharArray()){
        //     freq[ch]++;
        // }
        // for(int i=0;i<256;i++){
        //     if(freq[i]>0){
        //         System.out.println((char)i+"->"+freq[i]);
        //     }
        // }

        //****************************largest word****************************** */

        // String str="java is powerful ";
        // String a[]=str.split(" ");
        // String largest ="";
        // for(String val:a){
        //     if(val.length()>largest.length()){
        //         largest=val;

        //     }
        // } 
        // System.out.println(largest);

        //******************* */

        String a="hello";
        String b ="lloeh";
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
            String str1=new String(ch1);
            String str2=new String(ch2);
        if(str1.equals(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        



    }
    
}
