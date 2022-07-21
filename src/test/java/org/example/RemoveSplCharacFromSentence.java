package org.example;

public class RemoveSplCharacFromSentence {
    public static void main(String[] args) {
        String str = "Hello*&^%$ World!@#$%^";
        System.out.println("Sentence with special character:"+str);
        String removesplchar=str.replaceAll("[[^a-zA-Z0-9]]"," ");
        System.out.println("After Removing Spl Charac:"+removesplchar);
    }
}
