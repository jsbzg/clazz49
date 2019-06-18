package com.test.demo;

import java.util.Scanner;
public class Prog44{
    public static void main(String[] args){
        System.out.print("请输入一个偶数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2!=0){
          System.out.println("您输入的不是偶数！");
          return;
        }
        twoAdd(n);
    }
    //偶数分解为素数之和
    private static void twoAdd(int n){
        for(int i=2;i<n/2+1;i++){
            if(isPrime(i)&&isPrime(n-i)){
                System.out.println(n+"="+(i)+"+"+(n-i));
                break;
            }
        }
    }
    //判断素数
    private static boolean isPrime(int m){
        boolean flag = true;
        for(int i=2;i<Math.sqrt(m)+1;i++){
            if(m%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}