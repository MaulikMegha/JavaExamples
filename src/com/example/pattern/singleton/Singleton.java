package com.example.pattern.singleton;

public class Singleton {

    private static Singleton obj;

    private Singleton() {}

   // simple way
   /*
   public static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
    */

    // stander - no lazy loading, using inner class
    private static class InnerSingleton {
        private static final Singleton  _singleton = new Singleton();
    }

    public static Singleton getInstance(){
       return InnerSingleton._singleton;
    }


    // below method represent how to make thread-safe
   /*
   public static synchronized Singleton getInstance() {
          if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
    */

    // block level synchronized
    /*
     public static Singleton getInstance() {
      if(obj == null){
        synchronized(Singleton.class){
            if(obj == null){
               obj = new Singleton();
            }
        }
      }
      return obj;
    }
    */

    public void displayMessage(){
        System.out.println("Hello World !");
    }
}