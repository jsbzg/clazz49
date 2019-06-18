package com.test.demo;

public class Prog42{
    public static void main(String[] args){
        int n = 0;
        boolean flag = false;
        for(int i=10;i<100;i++)
          if(809*i==800*i+9*i+1){
            flag = true;
            n = i;
            break;
          }
        if(flag)
          System.out.println(n);
        else
          System.out.println("无符合要求的数！");
    }
}