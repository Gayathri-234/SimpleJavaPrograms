package org.example;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=50;
        int b=20;
        System.out.println("Before Swap:"+a+" "+b);
        int c;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap:"+a+" "+b);
    }
}
