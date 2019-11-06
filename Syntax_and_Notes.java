package com.example.ReviewProjects.Static_And_Instance;



public class Syntax_and_Notes {
    /*
    Static means that we can access the members through the class name
        - these can be variables, methods, initializer blocks, inner classes
        - when static, it is shared by the class and all other objects

    Static methods belongs to the class and not its instances
        - static methods can only access static variables of the class and
        invoke static methods of the class
        - these are usually utility methods to be used with other static methods
        without the need of creating an instance

    Static blocks
        - used for initializing static variables
        - executed as soon as the class is loaded, before main method
        - can call constructors within

    Instance variables and methods are called through an obj
        - create an obj first then use it to manipulate the instance variables

    Instance blocks
        - executes after the static block
        - used to initialize instance variables

     */
    //static variables
     static String str;
     static int num;
     static boolean boo;
     static double doo;
    //static block
     static{
        System.out.println("static block");
        //constructors can be called within by obj creation
        Syntax_and_Notes obj = new Syntax_and_Notes();
     }
     //static method
    static void staticMethod(){
        System.out.println("static method");
    }

    //instance variables
     String strNon;
     int numNon;
     boolean booNon;
     double dooNon;
    //instance block
    {
        System.out.println("instance block");
        //constructors can be called within by obj creation
        Syntax_and_Notes obj = new Syntax_and_Notes();
    }
    //nonstatic method
    void instanceMethod(){
        System.out.println("instance method");
    }

    //constructor
    Syntax_and_Notes(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        //to call static variables through classname
        Syntax_and_Notes.boo = true;
        Syntax_and_Notes.doo = 10.0;
        Syntax_and_Notes.num = 2;
        Syntax_and_Notes.str = "Jon";
        //to call static method
        staticMethod();

        //to call instance variables
        //need to create object first
        Syntax_and_Notes obj = new Syntax_and_Notes();
        obj.booNon = true;
        obj.dooNon = 10.0;
        obj.numNon = 1;
        obj.strNon = "instance";

        //to call instance methods
        //need to call through obj
        obj.instanceMethod();



    }

}
