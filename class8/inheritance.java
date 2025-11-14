package class8;

//*************single level inheritance *********** */
// class animal{
//     void eat(){
//         System.out.println("roti");
//     }
// }
// class dog extends animal{
//     void bite(){
//         System.out.println("katk..");
//     }
// }

//***********************multilevel inheritance************ */
// class animal{
//     void eat(){
//         System.out.println("roti");
//     }
// }
// class dog extends animal{
//     void bite(){
//         System.out.println("katk..");
//     }
// }
// class puppy extends dog{
//     void sleep(){
//         System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
//     }
// }
//********************************hererical inheritance ****** */
class animal{
    void eat(){
        System.out.println("roti");
    }
}
class dog extends animal{
    void bite(){
        System.out.println("katk..");
    }
}
class puppy extends animal{
    void sleep(){
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }
}


public class inheritance {
    public static void main(String[] args) {
        dog s1=new dog();
        s1.eat();
        s1.bite();

        // puppy s2=new puppy();
        // s2.eat();
        // s2.bite();
        // s2.eat();
        // s2.sleep();








    }
    
}
