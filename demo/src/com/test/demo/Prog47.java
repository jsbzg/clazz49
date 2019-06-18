package com.test.demo;

import java.util.Scanner;
public class Prog47{
    public static void main(String[] args){
        System.out.print("请输入7个整数(1-50)：");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        int n7 = scan.nextInt();
        scan.close();
        printStar(n1);
        printStar(n2);
        printStar(n3);
        printStar(n4);
        printStar(n5);
        printStar(n6);
        printStar(n7);
    }
    static void printStar(int m){
        System.out.println(m);
        for(int i=0;i<m;i++)
          System.out.print("*");
        System.out.println();
    }
}