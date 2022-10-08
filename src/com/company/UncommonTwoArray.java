package com.company;

import java.util.*;

public class UncommonTwoArray {
    public static void main(String[] args) {
        int[] a = {13, 25, 6, 5, 21, 61, 55, 88};
        int[] b = {13, 25, 6, 5, 21, 17};

        // output>> print out the uncommon elements in 2 arrays 19,7

        List<Integer> list1 = new ArrayList<>();
        for (int each : a) {
            if (!list1.contains(each)) {
                list1.add(each);
            }

        }
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        for (int each : b) {
            if (!list2.contains(each)) {
                list2.add(each);
            }
        }


        List<Integer> list = new ArrayList<>();
        for (int each : list1) {
            if (!list2.contains(each)) {
                list.add(each);
            }

        }
        for (int each : list2) {
            if (!list1.contains(each)) {
                list.add(each);
            }

        }
        System.out.println(list);
    }
}


















