package com.test.demo;

import java.io.*;
public class Prog50{
    //定义学生模型
    String[] number = new String[5];
    String[] name = new String[5];
    float[][] grade = new float[5][3];
    float[] sum = new float[5];
    public static void main(String[] args) throws Exception{
        Prog50 stud = new Prog50();
        stud.input();
        stud.output();
    }
    //输入学号、姓名、成绩
    void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //录入状态标识
        boolean isRecord = true;
        while(isRecord){
            try{
              for(int i=0;i<5;i++){
                  System.out.print("请输入学号：");
                  number[i] = br.readLine();
                  System.out.print("请输入姓名：");
                  name[i] = br.readLine();
                  for(int j=0;j<3;j++){
                      System.out.print("请输入第"+(j+1)+"门课成绩：");
                      grade[i][j] = Integer.parseInt(br.readLine());
                  }
                  System.out.println();
                  sum[i] = grade[i][0]+grade[i][1]+grade[i][2];
              }
                isRecord = false;
            }catch(NumberFormatException e){
                 System.out.println("请输入一个数字！");
          }
        }
    }
    //输出文件
    void output() throws IOException{
        FileWriter fw = new FileWriter("E://java50//stud.txt");
        BufferedWriter bw = new BufferedWriter(fw); 
        bw.write("No.  "+"Name  "+"grade1  "+"grade2  "+"grade3  "+"average");
        bw.newLine();
        for(int i=0;i<5;i++){
          bw.write(number[i]);
          bw.write("  "+name[i]);
          for(int j=0;j<3;j++)
            bw.write("  "+grade[i][j]);
          bw.write("  "+(sum[i]/5)); 
          bw.newLine();
        }
        bw.close();
    }
}