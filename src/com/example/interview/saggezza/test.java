package com.example.interview.saggezza;


public class test{
    public static void main(String args[]) {
        int []a={5,4,0,3,1,6,2};
        int r=0;
        int l=a.length;
        int c=0;
        for(int i=0,j=0; i<l;){
            int n=a[i];
            if(n<=l){
                i=n;
                c++;
                if(j==n){
                    j++;
                    i=j;
                    r=r<c?c:r;
                    c=0;
                }
            }
        }
        System.out.print(r);
    }

}