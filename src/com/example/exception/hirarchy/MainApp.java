package com.example.exception.hirarchy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainApp {
    public static void main(String args[]){
        int a = 5;
        int b = 0;
        try{
            int result = a/b;
            FileReader fr = new FileReader("Test.txt");
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("No matter what - it always perform");
        }
    }
}