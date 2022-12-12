package com.example.interview.tavant.Exm4;

public class MainApp implements AI, BI{

    @Override
    public void test() {
        System.out.println("main class method");
    }

    public static void main(String args[]){
        MainApp mainApp = new MainApp();
       // mainApp.testa();
        mainApp.test();
    }
}
