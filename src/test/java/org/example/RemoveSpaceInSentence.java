package org.example;

public class RemoveSpaceInSentence {
    public static void main(String[] args) {
        String str="Have a Great Day";
        String removespace = str.replaceAll("\\s","");
        System.out.println(removespace);
    }
}
