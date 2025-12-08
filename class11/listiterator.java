package class11;
import java.util.*;
public class listiterator {
    public static void main(String[] args) {
        ArrayList<Integer> gou = new ArrayList<>();
        gou.add(2);
        gou.add(4);
        gou.add(6);
        gou.add(8);
        gou.add(10);
        ListIterator<Integer> yo=gou.listIterator();
        while (yo.hasNext()) {
            Integer r=yo.next();
            // System.out.println(r);
            if(r==6){
                // yo.add(7);
                yo.set(7);
                
            }
            System.out.println(gou);
            
        }
        // while (yo.hasPrevious()) {
        //     Integer r=yo.previous();
        //     System.out.println(r);
        // }
    }

    
}
