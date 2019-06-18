package com.test.demo;

public class Prog24{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]); 
        int i = 0;
        int[] a = new int[5];
        do{
            a[i] = n%10;
          n /= 10;
          ++i;
        }while(n!=0);
        System.out.print("这是一个"+i+"位数，从个位起，各位数字依次为：");
        for(int j=0;j<i;j++)
          System.out.print(a[j]+" ");
    }
}