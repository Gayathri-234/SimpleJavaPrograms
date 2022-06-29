package org.example;

public class StringReverse {
    public static void main(String[] args) {
                String str= "1234", nstr="";
                System.out.print("Original word:  "+str);
                for (int i=0; i<str.length(); i++)
                {
                    char ch = str.charAt(i); //extracts each character
                    nstr=ch+ nstr; //adds each character in front of the existing string
                }
                System.out.println("Reversed word: "+ nstr);
            }
        }

