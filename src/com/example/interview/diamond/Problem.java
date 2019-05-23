package com.example.interview.diamond;

public class Problem {
    public static void main(String args[]){

       // In main class, we can not create class D obj.
       // compile time error
    }
}


// below classes create a diamond problem
class A {
    public void disaply(){
        System.out.println("Display A class");
    }
}

class B  extends A{
    public void disaply(){
        System.out.println("Display B class");
    }
}

class C extends A{
    public void disaply(){
        System.out.println("Display c class");
    }
}

// Class cannot extend multiple classes
/*
class D extends B,C {

    // you are getting both display B and C ..
}
*/
