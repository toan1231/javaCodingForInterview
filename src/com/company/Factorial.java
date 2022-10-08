package com.company;

public class Factorial {
    public static void main(String[] args) {
        int number=5;
        System.out.println(method(number));
    }
    public static int method(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
