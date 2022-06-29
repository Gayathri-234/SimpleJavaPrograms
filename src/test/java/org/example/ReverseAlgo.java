package org.example;

import java.util.Scanner;

public class ReverseAlgo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value:");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0){
            rev=rev*10 + num%10;
            num=num/10;

        }
        System.out.println("Reversed Value:"+rev);

    }
}
