package com.company;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[]a={1,2,99,55,3,4,5};

        System.out.println(method(a));
    }
    public static List<Integer> method(int[]a){
        List<Integer>list=new ArrayList<>();
       for(int i=a.length-1;i>=0;i--){
           list.add(a[i]);
       }
       return list;
    }
}
