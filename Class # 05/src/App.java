public class App {
    public static void main(String[] args) {



        
//        ============================================================
//           9 Best Patterns Questions In Java (for Beginners)
//        ============================================================




//           ===========================================================
//                              Nested Loop
//           ===========================================================





//       QUESTION # 01 :-      Solid Rectangle

//        int n = 4;
//        int m = 5;
//
//
////        outer loop
//        for (int i=1 ; i<=n; i++) {
////            inner loop
//            for (int j=1; j<=m ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }





//           ===========================================================




//       QUESTION # 02 :-    Print the pattern Hollow Rectangle !!!
//
//        int n = 4;
//        int m = 5;
//
////        outer loop
//        for (int i=1 ; i<=n ; i++){
////            inner loop
//            for (int j=1 ; j<=m ; j++){
////                cell -> (i,j)
//                if (i == 1 || j == 1 || i == n || j == m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//    }




//        ===========================================================




//                QUESTION # 03 :-     Half Pyramid


//        int n = 4;
//
////        outer loop
//        for (int i=1; i<=n ; i++){
////            inner loop
//            for (int j=1; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        ===========================================================




//                QUESTION # 04 :-    Inverted Half Pyramid

//        int n = 4 ;
//
////        outer loop
//        for (int i=n ; i>=1 ; i--){
////           inner loop
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }





//        ===========================================================




//                QUESTION # 05 :-   Inverted & Rotated Half Pyramid


//        int n = 4;
//
////        outer loop
//        for (int i=1 ; i<=n ; i++) {
////            inner loop -> space print
//            for (int j=1 ; j<=n-i ; j++){
//                System.out.print(" ");
//            }
//
////            inner loop -> star print
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        ===========================================================




//                QUESTION # 06 :-   Half Pyramid with Numbers

//        int n = 5;
//
////        outer loop
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=i ; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }





//        ===========================================================


//                QUESTION # 07 :-  Inverted Half Pyramid with Numbers

//
//        int n = 5 ;
//
////        outer loop
//        for (int i=1 ; i<=n ; i++){
////            inner loop
//            for (int j=1 ; j<=n-i+1 ; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }





//        ===========================================================





//                QUESTION # 08 :-   Floyd's Triangle

//        int n = 5 ;
//        int number = 1 ;
//
////        outer loop
//        for (int i=1 ; i<=n ; i++){
////            inner loop
//            for (int j=1 ; j<=i ; j++){
//                System.out.print(number+" ");
//                number++;//number = number + 1
//            }
//            System.out.println();
//        }




//        =================================================================================




//                          QUESTION # 09 :-     0-1 Triangle

        int n = 5;

//        outer loop
        for (int i = 1; i <= n; i++) {
//            inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { //even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
}



//  ===============================================================================================