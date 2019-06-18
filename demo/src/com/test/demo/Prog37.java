package com.test.demo;

import java.util.Scanner;
public class Prog37{
    public static void main(String[] args){
        System.out.print("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        //定义数组变量标识某人是否还在圈内
        boolean[] isIn = new boolean[n];
        for(int i=0;i<isIn.length;i++)
          isIn[i] = true;
        //定义圈内人数、报数、索引
        int inCount = n;
        int countNum = 0;
        int index = 0;
        while(inCount>1){
            if(isIn[index]){
                countNum++;
                if(countNum==3){
                    countNum = 0;
                    isIn[index] = false;
                    inCount--;
                }
            }
            index++;
            if(index==n)
              index = 0;
        }
        for(int i=0;i<n;i++)
          if(isIn[i])
            System.out.println("留下的是："+(i+1));
    }
}