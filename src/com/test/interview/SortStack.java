package com.test.interview;

import java.util.*;

public class SortStack {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        // Stack before sorting
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }

        // sorted stack result >>
        SortStack obj = new SortStack();
        System.out.println(stack.isEmpty());
        Iterator<Integer> it2 = obj.sortStack(stack).iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }

    private Stack<Integer> sortStack(Stack<Integer> st){
        Stack<Integer> sortS = new Stack<>();
        while(!st.isEmpty()){
            if(sortS.isEmpty()){
                sortS.push(st.pop());
            } else {
                int current = st.pop();
                if(current <= sortS.peek()){
                    sortS.push(current);
                } else {
                    int n = sortS.size();
                    for(int k = 0; k < n; k++){
                        st.push(sortS.pop());
                    }
                    if(sortS.isEmpty()){
                        sortS.push(current);
                    }
                }
            }
        }
        return sortS;
    }
}