package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String a="abcd";
        System.out.println(method(a));
    }
    public static String method(String a){
        String reverse="";
        for(int i=a.length()-1;i>=0;i--){
            reverse=reverse+a.charAt(i);
        }
        return reverse;
    }
}
