package org.example;

import javax.swing.*;
import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();

        System.out.println("Enter B:");
        int b = sc.nextInt();

        System.out.println("Enter C:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the largest Value");
        }
            else if (b > a && b > c) {
                System.out.println(b + " is the largest Value");
            } else {
                System.out.println(c + " is the largest Value");

        }
    }
}
