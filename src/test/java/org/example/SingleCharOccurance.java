package org.example;

public class SingleCharOccurance {
    public static void main(String[] args) {
        String s= "I like coding java and automation alot";
        int count = s.length();
        int replace = s.replace("i","").length();
        int total_Occurance=(count - replace);
        System.out.println(total_Occurance);
    }
}
