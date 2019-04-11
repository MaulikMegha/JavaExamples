package com.example.interview.priceline.stackQueue;

import java.util.Stack;

public class MainApp {

    // using two stack, build one queue.
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public static void main(String args[]){
        MainApp main = new MainApp();
        main.myAdd(1);
        main.myAdd(2);
        System.out.println(main.myPoll());
        main.myAdd(3);
        System.out.println(main.myPoll());
        System.out.println(main.myPoll());
    }

    public void myAdd(Integer number){
        stack1.push(number);
    }

    public Integer myPoll(){
        if(!stack2.isEmpty()){
            return (Integer)stack2.pop();
        }

        int length = stack1.size();
        for(int i = 0;i < length; i++){
            stack2.push(stack1.pop());
        }

        return (Integer) stack2.pop();
    }

}