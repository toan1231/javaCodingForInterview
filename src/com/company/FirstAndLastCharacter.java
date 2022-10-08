package com.company;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        String a="abcd";
        System.out.println(method(a));


    }
    public static String method(String a){

// String a="abcd";
        String firstAndLastCha="";
        firstAndLastCha=a.charAt(0)+""+a.charAt(a.length()-1);

        return firstAndLastCha;

    }

}
