package com.test.demo;

public class Prog21{
    public static void main(String[] args){
        long sum = 0;
        for(int i=0;i<20;i++)
          sum += factorial(i+1);
        System.out.println(sum);
    }
    //阶乘
    private static long factorial(int n){
        int mult = 1;
        for(int i=1;i<n+1;i++)
          mult *= i;
        return mult;
    }
}