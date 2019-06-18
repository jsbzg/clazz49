package com.test.demo;

public class Prog29{
    public static void main(String[] args){
        int[][] a = new int[][] {{100,2,3,},{4,5,6},{17,8,9}};
        matrSum(a);
    }
    private static void matrSum(int[][] a){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length;i++)
          for(int j=0;j<a[i].length;j++){
            if(i==j) sum1 += a[i][j];
            if(j==a.length-i-1) sum2 += a[i][j];
          }
        System.out.println("矩阵对角线之和分别是："+sum1+"和"+sum2);
    }
}