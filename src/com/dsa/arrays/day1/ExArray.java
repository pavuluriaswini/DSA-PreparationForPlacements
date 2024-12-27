package com.dsa.arrays.day1;
import java.util.*;

public class ExArray {
    public static void main(String[] args) {
//        int arr[] ={1,2,3,4};
//        System.out.println(arr[1]);
        // the above is static array, stored in Stack memory

        int[] ar = new int[5];
        // when we declare array befpre given the integers the the default values are zero [0,0,0,0,0]
        // int shouldn't be null

        ar[0]=0;
        ar[1]=1;
        ar[3]=2;
        ar[4]=3;
        //ar[5]=4; if size is 5 the data passed is n-1=4
        System.out.println(ar[4]);

        //Dynamic Array it is stored in heap the instances stored in heap are not continuous because instances stored in heap memory, because it depends on JVM
        // Arrays are accessed using its indices
        //Arrays are mutable
        //new keyword is used to create an object
        // primitive datatypes that can't broke down


    }
}
