


//                ==========================
//                       EXAMPLE # 01
//                ==========================






//class Pen{
//    String color;
//    String type;  //ballpoint ; gel
//
//
//    public void write(){
//        System.out.println("writing something");
//    }
//}
//
//
//public class App {  //OOPS
//    public static void main (String args[]){
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        pen1.write();
//    }
//
//
//
//}





//===========================================================================================


//                   =======================
//                          EXAMPLE # 02
//                   =======================


//
//class Pen{
//    String color;
//    String type;  //ballpoint ; gel
//
//
//    public void write(){
//        System.out.println("writing something");
//    }
//
//    public void printColor(){
//        System.out.println(this.color);
//    }
//}
//
//
//public class App {    //OOPS
//    public static void main (String args[]){
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();
//    }
//
//
//
//   }






//===========================================================================================





//                     =======================
//                            EXAMPLE # 03
//                     =======================



//
//class Student {
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//}
//
//
//
//public class App {    //OOPS
//    public static void main (String args[]){
//
//        Student s1 = new Student();
//        s1.name = "Umer";
//        s1.age = 21;
//
//        s1.printInfo();
//
//    }
//   }




//   ===========================================================================================




//                   =======================
//                         CONSTRUCTOR   ===>>> Type#01 ===>>>  NON-Parameterised Constructor
//                   =======================


//
//
//class Student {
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    Student(){
//        System.out.println("Constructor called !!!");
//    }
//}
//
//
//
//public class App {    //OOPS
//    public static void main (String args[]){
//
//        Student s1 = new Student();
//        s1.name = "Umer";
//        s1.age = 21;
//
//        s1.printInfo();
//
//    }
//  }






//   ===========================================================================================


//                   =======================
//                         CONSTRUCTOR   ===>>> Type#02 ===>>>  Parameterised Constructor
//                   =======================




//    class Student {
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    Student(String name , int age){
//    this.name = name;
//    this.age = age;
//    }
//   }
//
//
//
//    public class App {    //OOPS
//    public static void main (String args[]){
//
//        Student s1 = new Student("Umer" , 21);
//
//
//        s1.printInfo();
//
//    }
//  }
//
//



//   ===========================================================================================


//                   =======================
//                         CONSTRUCTOR   ===>>> Type#03 ===>>>  Copy Constructors
//                   =======================



    class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
    }

    Student(){
        
    }
   }



    public class App {    //OOPS
    public static void main (String args[]){

        Student s1 = new Student();
        s1.name = "Umer";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();



    }
  }




//   =========================================================================
//   =========================================================================
//   =========================================================================
//   =========================================================================
//   =========================================================================