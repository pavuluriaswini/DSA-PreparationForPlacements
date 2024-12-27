package com.LinerasearchDSA.day2;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9};
        int target=9;
        System.out.println(linearsearch( arr, target));

    }

    //search Array method to return index if item found else return -2
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
