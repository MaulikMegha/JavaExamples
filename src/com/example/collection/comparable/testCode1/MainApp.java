package com.example.collection.comparable.testCode1;

import java.util.*;

public class MainApp {
    public static void main(String args[]){

        List<Student> list = new ArrayList<>();

        list.add(new Student(104, "rucha", "megha"));
        list.add(new Student(105, "tarun", "patel"));
        list.add(new Student(101, "maulik", "megha"));
        list.add(new Student(102, "kamini", "patel"));
        list.add(new Student(103, "bhavin", "megha"));

        System.out.println("** before sorting .....");
        list.stream().forEach(System.out::println);


        System.out.println("** after sorting .....");
        Collections.sort(list);
        list.stream().forEach(System.out::println);


        System.out.println("** after sorting reverse .....");
        Collections.sort(list, Collections.reverseOrder());
        list.stream().forEach(System.out::println);


        // Now java 8 has come to rescue, with the streams concept we can achieve the result.
        list.stream().sorted(Comparator.comparing(Student::getRollNumber).thenComparing(Student::getfName));
    }
}