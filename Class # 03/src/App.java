import java.util.*;

public class App {
    public static void main(String[] args) {

//        QUESTION # 01 :-
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age > 18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }



//     ========================================

//            QUESTION # 02 :-

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        if(x%2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


//     ========================================



//            QUESTION # 03 :-    if , else !!!

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b=sc.nextInt();
//
//        if(a == b){
//            System.out.println("Equal");
//        }else {
//            if (a > b){
//                System.out.println("a is greater");
//            }else {
//                System.out.println("a is lesser");
//            }
//        }



//      ======
//        OR    ====>>>>  if, else if , else
//      ======

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a == b){
//            System.out.println("Equal");
//        } else if (a > b) {
//            System.out.println("a is greater");
//
//        }else {
//            System.out.println("a is lesser");
//        }


//     =======================================================================================

//        EXAMPLE :-

//        Scanner sc = new Scanner(System.in);
//        int button = sc.nextInt();
//
//        if(button ==1 ){
//            System.out.println("Hello");
//        } else if (button==2) {
//            System.out.println("Good Morning");
//
//        }else if (button==3){
//            System.out.println("Good Evening");
//        }else{
//            System.out.println("Invalid Button");
//        }



//        X   ====================================   X   ======================================   X



//                            ====================================
//                                       Switch Break
//                            ====================================


       Scanner sc = new Scanner(System.in);
       int button = sc.nextInt();

       switch (button){
           case 1 : System.out.println("Hello");
           break;
           case 2 : System.out.println("Good Morning");
           break;
           case 3 : System.out.println("Good Evening");
           break;
           default: System.out.println("Invalid");
       }



//        X   ====================================   X   ======================================   X



     

    }
}