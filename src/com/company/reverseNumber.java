package com.company;

public class reverseNumber {
    public static void main(String[] args) {
        int a=123456;
        System.out.println(method(a));

    }

    public static int method(int a) {
      String reverse="";
      int b=1;
        String string=String.valueOf(a);
        for(int i=string.length()-1;i>=0;i--){
            reverse+=string.charAt(i);
             b=Integer.valueOf(reverse);

        }
        return b;
    }
}

