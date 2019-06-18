package com.test.demo;

public class Prog9 {
    //求完数
    private static void compNumber(int num) {
        int count = 0;
        System.out.println(num + "以内的完数：");
        for (int i = 1; i <= num; i++) {
            int temp = 0;// 定义因子之和变量
            for (int n = 1; n < i / 2 + 1; n++) {
                if (i % n == 0) {
                    temp += n;// 能被整除的除数则被加到temp中
                }
            }
            if (temp == i) {// 如果因子之和与原数相等的话，说明是完数
                System.out.println(i + " ");// 输出完数
            }
        }
    }
}