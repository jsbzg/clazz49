package com.test.demo;

public class Prog2{
    public static void main(String[] args){
        int m = 1;
        int n = 1000;
        int count = 0;
        //统计素数个数
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                count++;
                System.out.print(i+" ");
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
    }
    //判断素数
    private static boolean isPrime(int n){
        boolean flag = true;
        if(n==1)
          flag = false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i)==0 || n==1){
                flag = false;
                break;
            }
             else
               flag = true;
          }
        }
        return flag;
    }
}