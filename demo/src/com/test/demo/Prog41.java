package com.test.demo;

public class Prog41{
    public static void main(String[] args){
        int n;
        n = fun(0);
        System.out.println("原来有"+n+"个桃子");
    }
    private static int fun(int i){
        if(i==5)
          return 1;
        else
          return fun(i+1)*5+1;
    }
}