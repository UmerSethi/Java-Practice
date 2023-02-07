
import java.sql.SQLOutput;
import java.util.*;



//public class App {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name); // call kiya function ko !!!
//    }
//}




//      =========================================================



//  QUESTION # 02 :-     Make a function to add 2 numbers and return the sum .



//public class App {
//
//    public static int calculateSum(int a , int b) {
//        int sum = a + b;
//       return sum;
//    }
//
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a,b);
//        System.out.println("Sum of 2 numbers is : " + sum);
//    }
//}




//         =========================================================



//  QUESTION # 03 :-     Make a function to multiply 2 numbers and return the product .



//public class App {
//    public static int calculateProduct(int a , int b){
//        return a * b;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//
//        System.out.println("Product of 2 numbers is : " + calculateProduct(a,b));
//    }
//}





//         =========================================================




//  QUESTION # 04 :-     Find the factorial of a number .



public class App {

    public static void printFactorial(int n){

        //loop
        if (n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1 ;
        for (int i=n ; i>=1 ; i--){
                factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);


    }
}



//         =========================================================


//             DIFFERENCE BETWEEN "METHODS"  &  "FUNCIONS" :


//        " Function "                      |          "   Method"
//                                          |
//  ===>>>    Call Directly                 |   ===>>> Call krty h ...Class k objects k through
//                                          |
                                     


