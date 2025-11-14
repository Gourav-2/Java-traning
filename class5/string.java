package class5;

public class string {
    public static void main(String[] args) {
        // this string ko change kar sakte hai 
        // StringBuilder str=new StringBuilder("hello");
        // str.append(" bye");
        // str.insert(2, "qq");
        // str.reverse();
        // str.delete(2, 4);
        // str.replace(2, 4, "yy");
        // System.out.println(str.length());
        // System.out.println(str.capacity());
        // System.out.println(str);

        //*********************solve******************** */
          //****************reveres *********************** */
          
        // String str = "i love java";
        // String a[]=str.split(" ");
        // StringBuilder str2=new StringBuilder();

        // for(String i :a){
        //     StringBuilder str1=new StringBuilder(i);
        //     str2.append(str1.reverse()).append(" ");

        // }
        // System.out.println(str2);

        //*******************************************next**** */
        String str ="aabbbbbcc";
        StringBuilder result = new StringBuilder();
        int count =1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;

            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);





        
    }
    
}
