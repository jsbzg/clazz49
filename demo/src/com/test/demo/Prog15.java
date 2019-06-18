package com.test.demo;

import java.util.Scanner;
public class Prog15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");
        System.out.print("请输入三个数：");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        System.out.println("排序结果："+sort(x,y,z));
    }
    //比较两个数的大小
    private static String sort(int x,int y,int z){
        String s = null;
        if(x>y){
            int t = x;
            x = y;
            y = t;
        }
        if(x>z){
            int t = x;
            x = z;
            z = t;
        }
        if(y>z){
            int t = z;
            z = y;
            y = t;
        }
        s = x+" "+y+" "+z;
        return s;
    }
}