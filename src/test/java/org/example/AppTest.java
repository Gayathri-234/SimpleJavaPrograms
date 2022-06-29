package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class AppTest {

    public static void main(String[] args) {
        String str = "Manjula", revStr = "";
        System.out.println("original: "+str);
        for (int i = ((str).length()- 1); i >= 0; --i) {
                char ch = str.charAt(i);
                revStr = revStr + ch;
            }
            System.out.println("reversed:"+revStr);
        }
    }

