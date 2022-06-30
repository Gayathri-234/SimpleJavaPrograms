package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class RemoveDuplicateString {

public static void main(String args[]){

        String[] name = {"aim","rajesh","raju","aim"};
        Set<String> myset  = new HashSet<String>();
        Collections.addAll(myset,name);
        System.out.println(myset);
        } }

