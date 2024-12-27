package com.javapracticeday1;

public class Fibanacciseries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int temp;
        int n=0;
        while (n<=5){
            temp=n1+n2;
            System.out.print(n1 + " ");
            n1=n2;
            n2=temp;

            n+=1;

        }
    }
}
