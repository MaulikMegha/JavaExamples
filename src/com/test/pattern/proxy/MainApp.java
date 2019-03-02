package com.test.pattern.proxy;

public class MainApp {

    public static void main(String args[]){
        Image image = new ProxyImage("test_file.jpg");
        image.displayImg();

        System.out.println("");
        image.displayImg();
    }
}