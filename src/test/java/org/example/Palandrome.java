package org.example;

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        String str = sc.next();
        String reverseStr = "";
        for (int i = ((str).length() - 1); i >= 0; --i) {
            char ch = str.charAt(i);
            reverseStr = reverseStr + ch;
        }

        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");


        }
    }
}
