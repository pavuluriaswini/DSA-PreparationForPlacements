package com.javapracticeday1;

import java.util.Scanner;
import java.util.*;

public class ConditionalExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float Salary = sc.nextFloat();

        if (Salary >= 10000) {
            System.out.println("The bonus is 2000 ");
        } else {
            System.out.println("The bonus is 1000");
        }
    }
}
