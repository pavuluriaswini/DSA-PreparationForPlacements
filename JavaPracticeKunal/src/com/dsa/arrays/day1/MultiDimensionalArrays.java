package com.dsa.arrays.day1;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int [][] arr= new int[3][3];
//          int[][] arr={
//                  {1,2,3},//oth index
//                  {4,5},//1st index
//                  {6,7,8,9}//2nd index
//
//          };
        int arr[][]=new int[3][2];
        // Passing input to the array
        //For Rows
        for(int row=0; row<arr.length;row++){
            //for columns
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();

            }
        }
        //output
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println(" ");
//        }
        // The output can be replaced with this blocxkof code
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // Using Enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }





    }
}
