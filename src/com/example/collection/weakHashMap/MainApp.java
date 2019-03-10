package com.example.collection.weakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class MainApp {
    public static void main(String args[]) {
        Map<Orders, Integer> orders = new WeakHashMap<>();

        orders.put(new Orders(11, "iphone"), 750); // weak reference
        orders.put(new Orders(12, "galaxy"), 600); // weak reference

        Orders order = new Orders(13, "Nokia");
        orders.put(order, 300); // strong reference

        System.out.println("before GC, size of map " +orders.size());

        System.gc();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("after GC, size of map " +orders.size());
    }
}

class Orders{
    int OrderId;
    String details;

    public Orders(int orderId, String details){
        this.details = details;
        this.OrderId = orderId;
    }
}