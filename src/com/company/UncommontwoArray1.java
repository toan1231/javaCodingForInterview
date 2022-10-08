package com.company;

import java.util.ArrayList;
import java.util.List;

public class UncommontwoArray1 {
    public static void main(String[] args) {
        int[] a = {13, 25, 6, 5, 21, 61, 55, 88};
        int[] b = {13, 25, 6, 5, 21, 61, 55, 88,111};
        System.out.println(method(a,b));

    }
    public static List<Integer>method(int[] a, int[] b){
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int each: a){
            list1.add(each);
        }
        for (int each: b){
            list2.add(each);
        }
        for (int each:list1){
            if(!list2.contains(each)){
                list.add(each);
            }
        }
        for(int each:list2){
            if(!list1.contains(each)){
                list.add(each);
            }
        }

        return list;
    }
/*
To take out the uncommon elements in two arrays
int[]a={1,2,3};
int[]a={1,2,3,4,5};
first you need to convert the two arrays into Lists using for each loop(name it as list1, list2 respectedly)
then use the logic: start from list1 [for]. Then think of list2 right away for if(  ) phrase;
very easy : think of list1 right away: for(each: list1) then off course if(list2.contains(EACH)). you use one EACH
is OK
remember put 3 list in the front line before the first for each loop.














 */



}
