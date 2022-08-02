package org.example;

public class DuplicateCharacInString {
    public static void main(String[] args) {
        String str ="Apple beach";
        char[] cArray = str.toCharArray();
        System.out.println("The String is: "+str);
        System.out.println("The duplicate characters are: ");
        for(int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if(cArray[i]==cArray[j]){
                    System.out.println(cArray[j]+" ");
                    break;
                }
            }
        }
    }
}
