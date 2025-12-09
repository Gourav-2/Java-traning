package class12;

public class errorhandling {
    public static void main(String[] args) {
        System.out.println("hello");
        //try catch ki help se jab error to vo error ko ignore karta hai code ko chalne se rokta hai 
        try {
            int a =10;
            int b=0;
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);

        }
        finally{
            System.out.println("yoyoyoy");//ye hamesha chalta hi hai 
        }
        // try {
        //     int arr[]={1,2,3};
        //     System.out.println(arr[5]);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
        System.out.println("byee");
    }
    
}
