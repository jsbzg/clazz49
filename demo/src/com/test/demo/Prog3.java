package com.test.demo;

public class Prog3{
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            if(isLotus(i))
               System.out.print(i+" ");
        }
        System.out.println();
    }
    //判断水仙花数
    private static boolean isLotus(int lotus){
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n/100;
        n  -= m*100;
        sum = m*m*m;
        m = n/10;
        n -= m*10;
        sum += m*m*m + n*n*n;
        if(sum==lotus)
            return true;
        else
            return false;
        }
}