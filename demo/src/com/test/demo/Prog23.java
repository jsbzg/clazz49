package com.test.demo;

public class Prog23{
    public static void main(String[] args){
        System.out.println(getAge(5,2));
    }
    //求第m位同志的年龄
    private static int getAge(int m,int n){
        if(m==1)
          return 10;
        else
          return getAge(m-1,n)+n;       
    }
}