package com.test.demo;

public class Prog20{
    public static void main(String[] args){
        double n1 = 1;
        double n2 = 1;
        double fraction = n1/n2;
        double Sn = 0;
        for(int i=0;i<20;i++){
          double t1 = n1;
          double t2 = n2;
          n1 = t1+t2;
          n2 = t1;
          fraction = n1/n2;
          Sn += fraction; 
        }
        System.out.print(Sn);
    }
}