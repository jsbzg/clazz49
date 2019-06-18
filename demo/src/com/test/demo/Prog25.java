package com.test.demo;

import java.io.*;
public class Prog25{
    public static void main(String[] args){
        int n = 0;
        System.out.print("请输入一个5位数：");
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
        try{
          n = Integer.parseInt(bufin.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
              bufin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        palin(n);
    }
    private static void palin(int n){
        int m = n;
        int[] a = new int[5];
        if(n<10000 || n>99999){
            System.out.println("输入的不是5位数！");
            return;
        }else{
          for(int i=0;i<5;i++){
              a[i] = n%10;
              n /= 10;
          }
          if(a[0]==a[4] && a[1]==a[3])
            System.out.println(m+"是一个回文数");
          else
            System.out.println(m+"不是回文数");
        }
   }
}