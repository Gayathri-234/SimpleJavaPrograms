package org.example;

public class PrintingNumWithoutLoop {
    public static void main(String[] args) {
        PrintNumber(1,100);
    }
    public static void PrintNumber(int first,int last){
        if(first<=last){
            System.out.println(first +  " " );
            PrintNumber(first+1,last);
        }
    }
}
