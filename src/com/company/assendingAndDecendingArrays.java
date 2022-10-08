package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assendingAndDecendingArrays {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5, 4};

        System.out.println("This is getting bigger"+Arrays.toString(method1(a)));
        System.out.println("This is getting smaller"+method2(a));
    }

    public static int[] method1(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public static List<Integer> method2(int[] a) {
        Arrays.sort(a);
        List<Integer>list=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
            list.add(i);
        }
        return list;
    }
}