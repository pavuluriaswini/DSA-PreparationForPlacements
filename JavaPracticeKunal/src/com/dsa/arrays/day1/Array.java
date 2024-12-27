package com.dsa.arrays.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int arr[]=new int[4];
//        for (int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//            //passing elements into array in runtime
//        }
//        for(int num: arr){
//            System.out.print(num+2+" ");
//            // Enhanced For loop
//        }

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        // Here this toString method is used to print the content in array into a list or an array format [Ashpp, Pavuluri, Puji, JAVaDSA]
    }
}
