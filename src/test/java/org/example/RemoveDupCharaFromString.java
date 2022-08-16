package org.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharaFromString {
    public static void main(String[] args) {
        String str = "elephant";
        System.out.println("Original String is:"+str);
        Set<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();

        for(int i =0;i<str.length();i++){
            Character c = str.charAt(i);
            if(!set.contains(str.charAt(i))){
                set.add(c);
                sf.append(c);

            }
        }
        System.out.println("String after removing dup:"+sf.toString());

    }
}
