package org.example;

public class LargestElementInArrayList {
    public static void main(String[] args){
        int[] a ={1,2,3,5,63,4};
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        System.out.println(max);


    }

}
