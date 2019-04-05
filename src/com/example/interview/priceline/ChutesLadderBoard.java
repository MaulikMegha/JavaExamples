package com.example.interview.priceline;

import java.util.HashMap;
import java.util.Map;

public class ChutesLadderBoard {
        final static int winingScore = 100;
        static Map<Integer, Integer> chutesMap = new HashMap<>();
        static Map<Integer, Integer> ladderMap = new HashMap<>();
        static {
                chutesMap.put(16, 6);
                chutesMap.put(47, 26);
                chutesMap.put(49, 11);
                chutesMap.put(56, 53);
                chutesMap.put(62, 19);
                chutesMap.put(64, 60);
                chutesMap.put(87, 24);
                chutesMap.put(93, 73);
                chutesMap.put(95, 75);
                chutesMap.put(98, 78);

                ladderMap.put(1, 38);
                ladderMap.put(4, 14);
                ladderMap.put(9, 31);
                ladderMap.put(28, 84);
                ladderMap.put(21, 42);
                ladderMap.put(36, 44);
                ladderMap.put(51, 67);
                ladderMap.put(71, 91);
                ladderMap.put(80, 100);
        }



}