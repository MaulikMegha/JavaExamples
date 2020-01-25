package com.example.interview.tavant.Exm3;

public class MainApp {

    public static void main(String args[]) {
        A a = new A(); // can access all method from A
        B b = new B(); // can access all method from B
        A ab = new B();
        // B ba = new A(); // not possible

        a.test();
        // a.test2(); // can't access private method
        a.test3();


        b.test();
        b.test2();
        b.test3();


        ab.test3();
        ab.test();

    }
}
