package org.example;

public class Palandrome {
    public static void main(String[] args) {


                String str = "1234321", reverseStr = "";
                for (int i = ((str).length() - 1); i >=0; --i) {
                    char ch = str.charAt(i);
                    reverseStr = reverseStr + ch;
                }


        if (str .equalsIgnoreCase(reverseStr)) {
                    System.out.println(str + " is a Palindrome String.");
                }
                else {
                    System.out.println(str + " is not a Palindrome String.");


        }
    }
}
