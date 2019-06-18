package com.test.demo;

import java.util.Scanner;
public class Prog30{
    public static void main(String[] args){
        int[] A = new int[]{0,8,7,5,9,1,2,4,3,12};
        int[] B = sort(A);
        print(B);
        System.out.println();
        System.out.print("请输入10个数的数组：");
        Scanner scan = new Scanner(System.in);      
int a = scan.nextInt();
scan.close();
        int[] C = insert(a,B);
        print(C);
    }
    //选择排序
    private static int[] sort(int[] A){
        int[] B = new int[A.length];
        for(int i=0;i<A.length-1;i++){
            int min = A[i];
            for(int j=i+1;j<A.length;j++){
                if(min>A[j]){
                    int temp = min;
                    min = A[j];
                    A[j] = temp;
                }
                B[i] = min;
            }
        }
        B[A.length-1] = A[A.length-1];
        return B;
    }
    //打印
    private static void print(int[] A){
        for(int i=0;i<A.length;i++)
          System.out.print(A[i]+" ");
    }
    //插入数字
    private static int[] insert(int a,int[] A){
        int[] B = new int[A.length+1];
        for(int i=A.length-1;i>0;i--)
          if(a>A[i]){
            B[i+1] = a;
            for(int j=0;j<=i;j++)
              B[j] = A[j];
              for(int k=i+2;k<B.length;k++)
                B[k] = A[k-1];
              break;
          }
        return B;
    }
}