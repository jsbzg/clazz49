package com.test.demo;

public class Prog22{
    public static void main(String[] args){
        System.out.println(fact(10));
    }
    //递归求阶乘
    private static long fact(int n){
        if(n==1)
          return 1;
        else
          return fact(n-1)*n;
    }
}