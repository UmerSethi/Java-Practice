import java.util.*;



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



//     class Student {
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(Student s2){
//     this.name = s2.name;
//     this.age = s2.age;
//     }

//     Student(){
        
//     }
//    }



//     public class App {    //OOPS
//     public static void main (String args[]){

//         Student s1 = new Student();
//         s1.name = "Umer";
//         s1.age = 21;

//         Student s2 = new Student(s1);
//         s2.printInfo();



//     }
//   }



//             =========================================================================
//             =========================================================================





      //=======================================================================================
      //        Polymorphism   ========>>>   Poly means "many"  & morphism means "forms"
      //=======================================================================================





  // Example # 01 :



//
//    class Student {
//        String name ;
//        int age ;
//
//        public void printInfo(String name){
//            System.out.println(name);
//        }
//
//        public void printInfo(int age){
//            System.out.println(age);
//        }
//
//              public void printInfo(String name , int age){
//            System.out.println(name + " " + age);
//        }
//    }
//
//public class App {
//    public static void main(String args[]){
//        Student s1 = new Student();
//        s1.name = "Umer";
//        s1.age = 21;
//
//        s1.printInfo(s1.age);
//    }
//}


//             =========================================================================




        // Example # 02 :


//
//class Student {
//    String name ;
//    int age ;
//
//    public void printInfo(String name){
//        System.out.println(name);
//    }
//
//    public void printInfo(int age){
//        System.out.println(age);
//    }
//
//    public void printInfo(String name , int age){
//        System.out.println(name + " " + age);
//    }
//}
//
//public class App {
//    public static void main(String args[]){
//        Student s1 = new Student();
//        s1.name = "Umer";
//        s1.age = 21;
//
//        s1.printInfo(s1.name , s1.age);
//    }
//}




//             =========================================================================
//             =========================================================================






         //=============================================================================================================================================================================
         //       Inheritance   ========>>>  "Ek generation sy dosri generation tk pass krna !!!"
//                                             ...... In Java Ek class ki property jb dosri class lena chahti h ...es process ko kehty h inheritance !

         //=============================================================================================================================================================================






//
//        class Shape {
//            String color;
//        }
//
//        class Triangle extends Shape {   /// ==========>>>>>>>>    "extends" means Shape ki property inherit hogeyi idhr !!!
//
//        }
//
//        public class App {
//            public static void main(String args[]){
//                Triangle t1 = new Triangle();
//                t1.color = "red";
//            }
//        }





//        ==================================================================================================================





                   //============================================================================
                         // Inheritance   ========>>>  Type#01 => "Single Level Inheritance"
                   //============================================================================


    //Example # 01 :
//
//    class Shape{
//        public void area(){
//            System.out.println("Display area");
//        }
//    }
//
//    class Triangle extends Shape{
//        public void area(int l , int h){
//            System.out.println(1/2*l*h);
//        }
//    }
//
//
//    public class App {
//        public static void main(String args[]){
//
//        }
//    }






//        ==================================================================================================================






                //============================================================================
                // Inheritance   ========>>>  Type#02 => "Multi Level Inheritance"
                //============================================================================



//
//        class Shape{
//            public void area(){
//                System.out.println("Display area");
//            }
//        }
//
//
//        class Triangle extends Shape{
//            public void area(int l , int h){
//                System.out.println(1/2*l*h);
//            }
//        }
//
//
//        class EquilateralTriangle extends Triangle {
//        public void area(int l , int h){
//            System.out.println(l/2*l*h);
//        }
//        }
//
//
//        public class App {
//            public static void main(String args[]){
//
//            }
//        }




//        ==================================================================================================================






                    //============================================================================
                    // Inheritance   ========>>>  Type#03 => "Hierarchial Level Inheritance"
                    //============================================================================








//   class Shape{
//       public void area(){
//           System.out.println("Display area");
//       }
//   }
            
            
//   class Triangle extends Shape{
//       public void area(int l , int h){
//           System.out.println(1/2*l*h);
//       }
//   }
            
            
//   class Circle extends Shape {
//       public void area(int r){
//           System.out.println((3.14)*r*r);
//       }
//   }
            
            
//   public class App {
//       public static void main(String args[]){
       
            
//       }
//   }
            
            
            




//        ==================================================================================================================
//        ==================================================================================================================
//        ==================================================================================================================







                                         //======================
                                         //    Import & Export   
                                         //======================


            //  =================   ERROR   =================

//     class Shape {
//         public void area(){
//             System.out.println("display area");
//         }
//     }

//     class Triangle extends Shape {
//         public void area (int l , int h){
//             System.out.println(1/2*l*h);
//         }
//     }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }


// public class OOPS {
//     public static void main(String args[]){
//         bank.Account accout1 = new bank.Accout();
//         accout1.name = "customer1"
//     }
// }





//               X     ============================================================================   X



                                     // ==========================
                                      //    Encapsulation 
                                     // ==========================

     //DEFINITION :-

// "Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java)". 



//               X     ============================================================================   X






                   // ============================================================================
                    //   ABSTRACTION   ====>>>>  "Important cheezyn user ko dekha dena ... 
                  //                               OR ...  non-important cheezyn user sy chupa lena !!!
                   // ============================================================================



          

                //    EXAMPLE # 01 :




//    abstract class Animal {   /// abstract meaning ====>>> bs ek khayal h ..ek concept h ...or ek blue print ////h ...                        bs exist krta h .. Animal hota hoga kch 
//         public void walk(){ 

//         }
//     }

//     class Horse extends Animal {
//         public void walk(){
//             System.out.println("Walks on 4 legs");
//         }
//     }

//     class Chicken extends Animal {
//         public void walk(){
//             System.out.println("walks on 2 legs");
//         }
//     }


// public class OOPS{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//         horse.walk();
     

//     }
// }






// -------------------------------------------------------------------------------------------





                //    EXAMPLE # 02 :




                

//    abstract class Animal {   /// abstract meaning ====>>> bs ek khayal h ..ek concept h ...or ek blue print ////h ...                        bs exist krta h .. Animal hota hoga kch 
//         public void walk(){ 

//         }
//     }

//     class Horse extends Animal {
//         public void walk(){
//             System.out.println("Walks on 4 legs");
//         }
//     }

//     class Chicken extends Animal {
//         public void walk(){
//             System.out.println("walks on 2 legs");
//         }
//     }


// public class OOPS{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//         horse.walk();



        // Animal animal = new Animail();   /// error aye ga !!! ... "Animal" type k object ko bana hi nhi skty ..
                                           // esko actually nhi create kiya ja skta !
        // animal.walk();





//     }
// }






//      -------------------------------------------------------------------------------------------






                //    EXAMPLE # 03 :   It can have abstract and non-abstract methods.











//    abstract class Animal {   /// abstract meaning ====>>> bs ek khayal h ..ek concept h ...or ek blue print ////h ...                        bs exist krta h .. Animal hota hoga kch 

//      abstract void walk();


//      public void eat(){ 
//        System.out.println("Animal eats");
//         }
//     }

//     class Horse extends Animal {
//         public void walk(){
//             System.out.println("Walks on 4 legs");
//         }
//     }

//     class Chicken extends Animal {
//         public void walk(){
//             System.out.println("walks on 2 legs");
//         }
//     }


// public class OOPS{
//     public static void main(String args[]){
//         Horse horse = new Horse();

//         horse.walk();
  
//         horse.eat();

        

//     }
// }





//      -------------------------------------------------------------------------------------------





                //    EXAMPLE # 04 :  Constructor Channing ===>>>  It can have constructors and static methods also.





                

//    abstract class Animal {          


//      abstract void walk();
//      Animal(){                                                       /// Constructor
//         System.out.println("You are creating a new Animal");
//      }

//      public void eat(){ 
//        System.out.println("Animal eats");
//         }
//     }


//     class Horse extends Animal {
//         Horse(){                                                     /// Constructor
//             System.out.println("Created a horse");
//         }
//         public void walk(){
//             System.out.println("Walks on 4 legs");
//         }
//     }


//     class Chicken extends Animal {
//         public void walk(){
//             System.out.println("walks on 2 legs");
//         }
//     }



// public class OOPS{
//     public static void main(String args[]){
//         Horse horse = new Horse();

       

        

//     }
// }





//             X     ============================================================================   X






                   // ==================================================
                   //                    Interfaces
                   // ==================================================





//EXAMPLE # 01 :-







// interface Animal {                 /// interfaces k constructor nhi hoskty !!! + non abstract function bhi nhi hona chiye
//           public void walk(); 
// }

// class Horse implements Animal {     // Interfaces ko Java m "extend" nhi krty  ... hmesha "implements" krty h !
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//      }
// }


// public class OOPS {
//     public static void main(String args[]){
//     Horse horse = new Horse();
//     horse.walk();
//     }
// }




// ------------------------------------------------------------------------------





//        EXAMPLE # 02 :-   Multiple Inheritance ....===>>> Java k andr classes sy nhi hota ...sirf or sirf
                                                      //   Inheritance sy hota h !



// interface Animal {                 
//     int eyes =2 ;
//     void walk();
// }

// interface Herbivore{

// }

// class Horse implements Animal , Herbivore {          // idhr 
// public void walk(){
//   System.out.println("Walks on 4 legs");
// }
// }


// public class OOPS {
// public static void main(String args[]){
// Horse horse = new Horse();
// horse.walk();
// }
// }



//             X     ============================================================================   X






                   // ==================================================
                   //                "static" Keyword
                   // ==================================================



                   //EXAMPLE # 01 :-


    // class Student {
    //     String name ;
    //     static String school;              
    // }


    // public class OOPS {

    //     public static void main(String args[]){
    //         Student.school = "JMV";
    //         Student student1 = new Student();
    //         student1.name = "tony";
    //         System.out.println(student1.school);
    //     }

    // }






    //    --------------------------------------------------------------------------------------





    //EXAMPLE # 02 :-



    

    class Student {
        String name ;
        static String school;       
        
        
        public static void changeSchool(){
            school = "newshool";
        }
    }


    public class OOPS {

        public static void main(String args[]){
            Student.school = "JMV";
            Student student1 = new Student();
            student1.name = "tony";
            System.out.println(student1.school);
        }

    }
