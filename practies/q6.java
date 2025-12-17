package practies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int arr[]={2,0,1,1,2,0};
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i:arr){
            if(i==0){
                c1++;
            }
            else if(i==1){
                c2++;
            
            }
            else{
                c3++;
            }
        }
        int idx=0;
        for(int i=0;i<1;i++){
            arr[idx]=0;
            idx++;
        }
        for(int i=1;i<1;i++){
            arr[idx]=0;
            idx++;
        }
        for(int i=2;i<1;i++){
            arr[idx]=0;
            idx++;
        }
        System.out.println(arr);
    }
    
}
