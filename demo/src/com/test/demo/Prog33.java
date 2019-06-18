package com.test.demo;

public class Prog33{
    public static void main(String[] args){
        int[][] n = new int[10][21];
        n[0][10] = 1;
        for(int i=1;i<10;i++)
          for(int j=10-i;j<10+i+1;j++)
            n[i][j] = n[i-1][j-1]+n[i-1][j+1];
        for(int i=0;i<10;i++){
            for(int j=0;j<21;j++){
                if(n[i][j]==0)
                  System.out.print("   ");
                else{
                if(n[i][j]<10)
                  System.out.print("  "+n[i][j]);//空格为了美观需要
                else if(n[i][j]<100)
                  System.out.print(" "+n[i][j]);
                  else
                    System.out.print(n[i][j]);
              }
            }
            System.out.println();
        }
    }
}