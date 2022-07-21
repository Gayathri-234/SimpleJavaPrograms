package org.example;
import java.util.*;

public class ReverseTheSentence {
    public static void main(String[] args) {

       String str="I am Gayathri";
        System.out.println("Given Sentence:"+str);
        String rev = "";
        String s[] = str.split(" ");// Breaking the sentence into words
        for (int i = 0; i < s.length; i++) {
            rev = s[i] + " " + rev;
        }
        System.out.println("Reversed Sentence:"+rev);
    }
}



