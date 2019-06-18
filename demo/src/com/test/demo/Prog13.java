package com.test.demo;

public class Prog13{
    public static void main(String[] args){
        int n=0;
        for(int i=0;i<100001;i++){
            if(isCompSqrt(i+100) && isCompSqrt(i+268)){
                n = i;
                break;
            }
        }
        System.out.println("所求的数是："+n);
    }
    //判断完全平方数
    private static boolean isCompSqrt(int n){
        boolean isComp = false;
        for(int i=1;i<Math.sqrt(n)+1;i++){
            if(n==Math.pow(i,2)){
                isComp = true;
                break;
            }
        }
        return isComp;
    }
}