package org.example;

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
        String str="MALAYALAM";
        String reverseStr = "";
        for (int i = ((str).length() - 1); i >= 0; --i) {
            char ch = str.charAt(i);
            reverseStr = reverseStr + ch;
        }
        System.out.println("Reversed String is:"+reverseStr);

 if (str.equalsIgnoreCase(reverseStr)) {
      System.out.println("Given string "+str + " is a Palindrome String.");
  } else {
      System.out.println(str + " is not a Palindrome String.");


   }
    }
}
