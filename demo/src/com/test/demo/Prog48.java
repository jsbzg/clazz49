package com.test.demo;

public class Prog48{
    public static void main(String[] args){
        int n = 1234;
        int[] a = new int[4];
        for(int i=3;i>=0;i--){
          a[i] = n%10;
          n /= 10;
        }
        for(int i=0;i<4;i++)
          System.out.print(a[i]);
        System.out.println();
        for(int i=0;i<a.length;i++){
          a[i] += 5;
          a[i] %= 10;
        }
        int temp1 = a[0];
        a[0] = a[3];
        a[3] = temp1;
        int temp2 = a[1];
        a[1] = a[2];
        a[2] = temp2;
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]);
    }
}