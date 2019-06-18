package com.test.demo;

import java.util.Scanner;
public class Prog39{
    public static void main(String[] args){
        System.out.print("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2==0)
          System.out.println("结果："+even(n));
        else
          System.out.println("结果："+odd(n));
    }
    //奇数
    static double odd(int n){
        double sum = 0;
        for(int i=1;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
    //偶数
    static double even(int n){
        double sum = 0;
        for(int i=2;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
}