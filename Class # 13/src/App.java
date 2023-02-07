public class App {
    public static void main(String[] args) {



//             ==============================================
//                             String Builder
//             ==============================================




//        ====== >>>>>        Strings in Java Immutable




//        ===================
//          QUESTION # : 01
//        ===================


//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);





//    ==============================================================================






//                           QUESTION # : 02    ========>>>>>>>>>     .charAt(0)


//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//
//        //char at index 0
//        System.out.println(sb.charAt(0));
//





//   ================================================================================





//                     QUESTION # : 03   =====>>>>     .setCharAt(Index number,"changing alphabet");




//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);

            //set char at index 0
//        sb.setCharAt(0,'P');
//        System.out.println(sb);



//   ====================================================================================================




//                           QUESTION # : 04 ===== >>>>>>>        .insert(index number, 'alphabet')



//        EXAMPLE # 01 :


//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//
//        sb.insert(0, 'S');
//        System.out.println(sb);



//-------------------------------------------------------




//        EXAMPLE # 02 :

//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//        sb.insert(2, 'n');
//        System.out.println(sb);





//   ====================================================================================================





//                           QUESTION # : 05 =====>>>>>>>    .delete(starting index , end index); ...here ending index is non-enclusive



//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//
//        // delete the extra 'n'
//
//        sb.delete(2,3);    ////  ending index is non-enclusive !!!
//        System.out.println(sb);






//   ====================================================================================================




//                           QUESTION # : 06  =====>>>>>>>    .append("alphabet");


//        StringBuilder sb = new StringBuilder("h");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//
//        System.out.println(sb);


//   ====================================================================================================




//                           QUESTION # : 07  =====>>>>>>>     .length()


//        StringBuilder sb = new StringBuilder("h");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//
//        System.out.println(sb);
//        System.out.println(sb.length());





//   ====================================================================================================





//        ==============================================
//                  Logical Question !!!
//        ==============================================


        StringBuilder sb = new StringBuilder("UMER");


        for (int i=0 ; i<sb.length()/2 ; i++){
            int front = i ;
            int back = sb.length() -1 -i; // 5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);






    }
}