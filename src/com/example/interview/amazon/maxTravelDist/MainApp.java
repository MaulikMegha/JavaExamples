package com.example.interview.amazon.maxTravelDist;

import java.awt.*;
import java.util.*;
import java.util.List;

import static java.util.Map.Entry.comparingByValue;

public class MainApp {

    public static void main(String args[]) {

       int maxTravelDist;
       List<List<Integer>> forwardRouteList = new ArrayList<>();
       List<List<Integer>> returnRouteList = new ArrayList<>();

     /*  maxTravelDist = 7000;

       List<Integer> fList = new ArrayList<>();
       fList.add(1);
       fList.add(2000);
       forwardRouteList.add(fList);

       fList = new ArrayList<>();
       fList.add(2);
       fList.add(4000);
       forwardRouteList.add(fList);

       fList = new ArrayList<>();
       fList.add(3);
       fList.add(6000);
       forwardRouteList.add(fList);


       List<Integer> rList = new ArrayList<>();
       rList.add(1);
       rList.add(2000);
       returnRouteList.add(rList);*/


        maxTravelDist = 10000;

        List<Integer> fList = new ArrayList<>();
        fList.add(1);
        fList.add(3000);
        forwardRouteList.add(fList);

        fList = new ArrayList<>();
        fList.add(2);
        fList.add(5000);
        forwardRouteList.add(fList);

        fList = new ArrayList<>();
        fList.add(3);
        fList.add(7000);
        forwardRouteList.add(fList);

        fList = new ArrayList<>();
        fList.add(4);
        fList.add(10000);
        forwardRouteList.add(fList);

        List<Integer> rList = new ArrayList<>();
        rList.add(1);
        rList.add(2000);
        returnRouteList.add(rList);

        rList = new ArrayList<>();
        rList.add(2);
        rList.add(3000);
        returnRouteList.add(rList);

        rList = new ArrayList<>();
        rList.add(3);
        rList.add(4000);
        returnRouteList.add(rList);

        rList = new ArrayList<>();
        rList.add(4);
        rList.add(5000);
        returnRouteList.add(rList);

        Map<Integer, List<List<Integer>>> computeMap = new TreeMap<>(Collections.reverseOrder());

       int fLength = forwardRouteList.size();
       int rLength = returnRouteList.size();

       for(int i = 0 ; i < fLength; i++) {
           List<Integer> listF = forwardRouteList.get(i);
           for(int j = 0 ; j < rLength; j++){
               List<Integer> listR = returnRouteList.get(j);
               int sum = listF.get(1) +listR.get(1);
               if(sum <= maxTravelDist){
                     List<List<Integer>> lList = computeMap.get(sum) != null ? computeMap.get(sum) : new ArrayList<>();
                     List<Integer> tempList = new ArrayList<>();
                     tempList.add(listF.get(0));
                     tempList.add(listR.get(0));
                     lList.add(tempList);
                     computeMap.put(sum, lList);
               }
           }
       }

       // System.out.println(computeMap);
       System.out.println(computeMap.values().stream().findFirst().get());

    }

}