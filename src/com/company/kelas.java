package com.company;

public class kelas {
    public static String[] BubleSorting(String[] list){
        String temp;
        for (int i = 0;i<list.length-1;i++){
            for (int j = 0 ; j<list.length-i-1;j++){
                if (list[j].compareTo(list[j+1])>0){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }
}
