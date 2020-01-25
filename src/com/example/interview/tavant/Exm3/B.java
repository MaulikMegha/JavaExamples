package com.example.interview.tavant.Exm3;

public class B extends A {

    // this can be protected or public, but not private
    public void test(){
        System.out.println("hello test from B");
    }


    // this can be private or protected or public
    protected void test2(){
        System.out.println("hello test2 from B");
    }


    // only public allow
    public void test3(){
        System.out.println("hello test3 from B");
    }

}
