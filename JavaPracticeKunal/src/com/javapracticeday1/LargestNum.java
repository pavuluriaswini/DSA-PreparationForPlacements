package com.javapracticeday1;

import java.util.Scanner;
import java.lang.*;


public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

//        if (a>b ) {
//            if (a > c) {
//                System.out.println("a is largest");
//            }
//            else{
//                System.out.println("c is largest");
//            }
//        }
//        else{
//            System.out.println("b is largest");
//        }
        
        int large=Math.max(c,Math.max(a,b));
        System.out.println("The largest number is:"+large);

    }
}
