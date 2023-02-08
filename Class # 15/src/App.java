import java.util.*;
public class App {
    public static void main(String[] args) {


//        ============================================
//                  Bit Manipulation
//        ============================================




        // QUESTION # 01 :




//        int n = 5 ;
//        int pos = 2 ;
//        int bitMask = 1<<pos;
//
//        if ((bitMask & n) == 0){
//            System.out.println("bit was zero");
//        }else {
//            System.out.println("bit was one");
//        }




//        ====================================================================



        // QUESTION # 02 :
//        -----------------



//        int n = 5 ;
//        int pos = 2 ;
//        int bitMask = 1<<pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);



//        ====================================================================




        // QUESTION # 03 :
//        -----------------




//        int n = 5 ;
//        int pos = 2 ;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n ;
//        System.out.println(newNumber);





//        ====================================================================




        // QUESTION # 04 :
//        -----------------


        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
         // oper=1 : set oper=0 : clear
        int n = 5 ; //0101 -> 0111 -> decimal 7
        int pos =1 ;


        int bitMask = 1<<pos;
       if (oper == 1 ){
           //set

           int newNumber = bitMask | n;
           System.out.println(newNumber);
       }else {
           //clear
           int newBitMask = ~(bitMask);
           int newNumber = newBitMask & n;
           System.out.println(newNumber);
       }




    }
}