package com.LinerasearchDSA.day2;
import java.lang.*;

public class StringSearch {
    public static void main(String[] args) {
        String name="Ashwini";
        char target= 'w';
        System.out.println(Searchstr(name,target));
    }
    static boolean Searchstr(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }

        }
        return false;

    }
}
