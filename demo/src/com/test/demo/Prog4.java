package com.test.demo;

public class Prog4{
    public static void main(String[] args){
        int n = 13;
        decompose(n);
    }
    private static void decompose(int n){
        System.out.print(n+"=");
        for(int i=2;i<n+1;i++){
            while(n%i==0 && n!=i){
                n/=i;
                System.out.print(i+"*");
            }
            if(n==i){
                System.out.println(i);
                break;
            }
        }
    }
}