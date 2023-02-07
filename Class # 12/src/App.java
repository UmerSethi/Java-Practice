import java.util.*;
public class App {
    public static void main(String[] args) {




//       =================================================
//                         Strings
//       =================================================



//                       EXAMPLE : String Decalartion

//        String name = "Tony";
//        String fullName = "Tony Stark";
//        String sentence = "My name is Tony Stark";




//     ==============================================================




//        QUESTIONS :-

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();      /// for single word !!!
//        String name = sc.nextLine();   // for full line !!!
//        System.out.println("Your name is : "+ name);




//     ==============================================================






//        QUESTIONS :-     concatenation



//        String firstName = "Hello";
//        String lastName = "World";
//        String fullName = firstName + " " + lastName;
//
//        System.out.println(fullName);




//     ==============================================================




//        QUESTIONS :-     length function


//
//        String firstName = "tony";
//        String lastName = "stark";
//        String fullName = firstName + "@" + lastName;
//
//        //tony@stark
//        System.out.println(fullName.length());  /// ===>>>    lenght function
//






//     ==============================================================

//        QUESTIONS :-     charAt




//        String firstName = "tony";
//        String lastName = "stark";
//        String fullName = firstName + "@" + lastName;
//
//        //tony@stark
//        System.out.println(fullName.length());  /// ===>>>    lenght function
//
//
//        //charAt
//        for (int i=0 ; i<fullName.length() ; i++){
//            System.out.println(fullName.charAt(i));
//        }





//          ==============================================================



//        QUESTIONS :-     compare




//        String name1 = "tony";
//        String name2 = "tony";



//        // 1) ====>>> s1 > s2 : +ve value
//        // 2) ====>>> s1 == s2 : 0
//        // 3) ====>>> s1 < s2 : -ve value




//        if (name1.compareTo(name2)==0){
//            System.out.println("String are equal");
//        }else {
//            System.out.println("String are not equal");
//        }




//          ==============================================================



//                   QUESTIONS :-            substring()




//        String sentence = "My name is Tony";
//
//        //substring(beginning index , end index)
//
//        String name = sentence.substring(11,sentence.length());
//
//        System.out.println(name);




//---------------------------------------------------------------------------------




        //EXAMPLE # 02



//        String sentence = "TonyStark";
//
//        //substring(beginning index , end index)
//
//        String name = sentence.substring(0,4);
//
//        System.out.println(name);


//---------------------------------------------------------------------------------



        //EXAMPLE # 03



       String sentence = "TonyStark";

       //substring(beginning index , end index)

       String name = sentence.substring(5);   // ab idhr dekho hm ny ending index pass nhi kiya... to y by default hi full value ko access kr ly ga !!!

       System.out.println(name);




//          ==============================================================




//        CONCEPT =====>>>>  String are Immutable




    }
}