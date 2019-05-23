package com.example.interview;

class Parent {

    public static void foo(){
        System.out.println("foo in Parent");
    }

    public void bar(){
        System.out.println("bar in Parent");
    }
}

public class Child extends Parent {
    // @Override : we can not override static method
    public static void foo(){
        System.out.println("foo in Child");
    }

    @Override
    public void bar(){
        System.out.println("bar in Child");
    }

    public static void main(String args[]){

        Parent parent = new Child();
        parent.foo();
        parent.bar();

        Child child = new Child();
        child.foo();
        child.bar();
    }
}