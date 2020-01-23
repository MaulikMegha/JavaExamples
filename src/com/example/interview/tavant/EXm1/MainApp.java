package com.example.interview.tavant.EXm1;

public class MainApp {

    public static void main(String args[]){
        System.out.println(" **a *************");
        A a = new A();
        // a.? available methods
        a.m1();
        a.m2();

        System.out.println(" **ab *************");
        A ab = new B();
        // ab.? available methods
        ab.m1();
        ab.m2();

        // B ba = new A(); compile error incompatible

        System.out.println(" **ac *************");
        A ac = new C();
        // ac.? available methods
        ac.m1();
        ac.m2();

        System.out.println(" **b *************");
        B b = new B();
        // b.? available methods
        b.m1();
        b.m2();
        b.m3();
        b.m4();

        System.out.println(" **bc *************");
        B bc = new C();
        // bc.? available methods
        bc.m1();
        bc.m2();
        bc.m3();
        bc.m4();

        C c = new C();
        // c.? available methods
        // everything available m1,2,3,4,5


       // C cb = new B(); // not possible, compile error incompatible


    }
}