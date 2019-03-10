package com.example.hackerrank;

import java.util.*;

public class CaesarCipher {
    /*
    Input :
        10
        www.abc.xy
        87
    Output:
        fff.jkl.gh

    Input :
        16
        Pz-/aI/J`EvfthGH
        66
    Output :
        Dn-/oW/X`SjthvUV
    */

    public static void main(String args[]) {
        String s = "www.abc.xy";
        int k = 87;

        Character[] alphabet = {'a','b','c','d','e','f', 'g', 'h', 'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> lAlphabet = new ArrayList<>();
        Map<Character,Character> cipherMap = new HashMap<>();

        int tempRotatedIndex = k / alphabet.length;
        for(int i = 0; i <= tempRotatedIndex; i++){
            lAlphabet.addAll(Arrays.asList(alphabet));
        }

        int listLength = lAlphabet.size();
        for(int i = k, j = 0; i < listLength; i++,j++ ){
            cipherMap.put(lAlphabet.get(j), lAlphabet.get(i));
            cipherMap.put(Character.toUpperCase(lAlphabet.get(j)), Character.toUpperCase(lAlphabet.get(i)));
        }
        for(int m = listLength-k, n = 0; m < listLength; m++, n++){
            cipherMap.put(lAlphabet.get(m), lAlphabet.get(n));
            cipherMap.put(Character.toUpperCase(lAlphabet.get(m)), Character.toUpperCase(lAlphabet.get(n)));
        }
        // cipherMap.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));

        StringBuffer resultStringBuffer = new StringBuffer("");
        for(Character c : s.toCharArray() ){
            if(cipherMap.containsKey(c)) {
                resultStringBuffer.append(cipherMap.get(c));
            } else {
                resultStringBuffer.append(c);
            }
        }

        System.out.println(resultStringBuffer.toString());

    }
}