package com.test.demo;

import java.util.Scanner;
public class Prog38{
    public static void main(String[] args){
        System.out.print("请输入一串字符：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        String strIn = scan.next();
        scan.close();
        char[] ch = strIn.toCharArray();
        System.out.println(strIn+"共"+(ch.length-1)+"个字符");
    }
}