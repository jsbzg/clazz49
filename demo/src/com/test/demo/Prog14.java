package com.test.demo;

import java.util.Scanner;
public class Prog14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");//匹配非数字
        System.out.print("请输入当前日期（年-月-日）:");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();
        scan.close();
        System.out.println("今天是"+year+"年的第"+analysis(year,month,date)+"天");
    }
    //判断天数
    private static int analysis(int year, int month, int date){
        int n = 0;
        int[] month_date = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
        if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
          month_date[2] = 29;
        for(int i=0;i<month;i++)
          n += month_date[i];
        return n+date;
    }
}