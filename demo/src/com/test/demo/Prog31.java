package com.test.demo;

public class Prog31{
    public static void main(String[] args){
        int[] A = new int[]{1,2,3,4,5,6,7,8,9,};
        print(A);
        System.out.println();
        int[] B = reverse(A);
        print(B);
    }
    private static int[] reverse(int[] A){
        for(int i=0;i<A.length/2;i++){
            int temp = A[A.length-i-1];
            A[A.length-i-1] = A[i];
            A[i] = temp;
        }
        return A;
    }
    private static void print(int[] A){
        for(int i=0;i<A.length;i++)
          System.out.print(A[i]+" ");
    }
}