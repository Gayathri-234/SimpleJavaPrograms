package org.example;

public class RemoveSplCharAndSepString {
    public static void main(String[] args) {
        String myString = "Jane,21,Employed,Software Engineer";
        System.out.println("Original String:"+myString);
        String [] removSplChar = myString.split(",");
       for(String str:removSplChar){
           System.out.println("Without special character:"+str);
       }

    }
}
