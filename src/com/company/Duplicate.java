package com.company;

import java.util.HashSet;
import java.util.Set;

public class DuplicateOrNot {
    public static void main(String[] args) {
        int[]a={1,2,3,3};
        System.out.println(method(a));
    }
    public static String method(int[] a){
        String statement="";
        Set<Integer> set= new HashSet<>();
        for (int each:a){
            set.add(each);
        }
        if(set.size()<a.length){
            statement="This array has a duplicate";
        }else {
            statement="no, it doen't have a duplicate";
        }

        return statement;
    }
}
