package com.test.demo;

import java.util.Scanner;
public class Prog35{
    public static void main(String[] args){
        System.out.print("请输入一组数：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[] a = new int[50];
        int m = 0;
        while(scan.hasNextInt()){
            a[m++] = scan.nextInt();
        }
        scan.close();
int[] b = new int[m];
        for(int i=0;i<m;i++)
          b[i] = a[i];
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b.length-i-1;j++)
                if(b[j]<b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
        for(int i=0;i<b.length;i++)
          System.out.print(b[i]+" ");

    }
}