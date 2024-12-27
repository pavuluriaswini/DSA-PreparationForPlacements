package com.javapracticeday1;

public class RectangleInOops {
    int length;
    int breadth;

    public RectangleInOops(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int CalculateArea() {
        int area = length * breadth;
        return area;

    }



    public static void main(String[] args) {
            RectangleInOops re = new RectangleInOops(8,19);
            System.out.println("The area of the rectangle is:"+ re.CalculateArea());

        }
    }

