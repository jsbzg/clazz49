package com.test.demo;

public class Prog27{
    public static void main(String[] args){
        int n = 100;
        System.out.print(n+"以内的素数：");
        for(int i=2;i<n+1;i++){
            if(isPrime(i))
              System.out.print(i+" ");
        }
    }
    //求素数
    private static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2;i<Math.sqrt(n)+1;i++)
            if(n%i==0){
              flag = false;
              break;
            }
        return flag;
    }
}