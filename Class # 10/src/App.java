import java.util.Scanner;

public class App {
    public static void main(String[] args) {



//        =============================================================
//                        Arrays Introduction
//        =============================================================






//        QUESTION # 01 :-



//        int[] marks = new int[3];
//        marks[0] = 97; //phy
//        marks[1] = 98; //chem
//        marks[2] = 95; //eng
//
////        System.out.println(marks); // wrong ... use square brackets
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);




//        ========================================================================================================




        //        QUESTION # 02 :-



//        int[] marks = new int[3];

//        or

//        int marks[] = new int[3];
//        marks[0] = 97;
//        marks[1] = 25;
//        marks[2] = 95;
//
//        for( int i=0 ; i<3 ; i++){
//            System.out.println(marks[i]);
//        }




//        ========================================================================================================





        //        QUESTION # 03 :-




//        int marks[] = {97 ,39 , 54} ;
//
//        for (int i=0 ; i<3 ; i++){
//            System.out.println(marks[i]);
//        }





//   =========================================================================================================================



        //        QUESTION # 03 :-

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        int numbers[] = new int[size];
//
//        for (int i=0 ; i<size ; i++){
//            System.out.println(numbers[i]);
//        }





//   =========================================================================================================================



        //        QUESTION # 04 :-



//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int number[] = new int[size];
//
//        //input
//        for (int i=0 ; i<size ; i++){
//            number[i] = sc.nextInt();
//        }
//
//        //output
//        for (int i=0 ; i<size ; i++){
//            System.out.println(number[i]);
//        }



//   ======================================================================================================================================



        //QUESTION # 05 : Take an array as input from the user. Search for a given number x and print the index at which it occurs .



        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for (int i=0 ; i<size ; i++){
            number[i] = sc.nextInt();
        }


        int x = sc.nextInt();

        //output
        for (int i=0 ; i<size ; i++) {
            if (number[i] == x) {
                System.out.println(" x found at index : " + i);

            }
        }
        
    }
}


//   ======================================================================================================================================

