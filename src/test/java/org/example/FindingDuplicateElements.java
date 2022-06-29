package org.example;

public class FindingDuplicateElements {
    public static void main(String[] args) {
        String arr[]={"Java","Python","C++","C"};
        boolean flag=false;
        for (int i =0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate values is:"+arr[i]);
                    flag = true;
                }

                }
        }
        if(flag==false){
            System.out.println("Duplicate Element NOT FOUND");
        }
    }
}
