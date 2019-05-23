package com.example.interview.tavant.EXm1;

public class MainApp {

    public static void main(String args[]){
        A a = new A();
        // a.? available methods
        a.m1();
        a.m2();

        A ab = new B();
        // ab.? available methods
        ab.m1();
        ab.m2();

        A ac = new C();
        // ac.? available methods
        ac.m1();
        ac.m2();

        B b = new B();
        // b.? available methods
        b.m1();
        b.m2();
        b.m3();
        b.m4();

        C c = new C();
        // c.? available methods

        // C c = new A(); // not possible


    }
}