package com.company;

public class Palindrome {
    public static void main(String[] args) {
        boolean bobo=true;
        String A="malaalam";//abcdMdcba   abcddcba

        String AA="";
        String BB="";
        String xx="";
            if(A.length()/2%2==0) {//
                for (int i = 0; i < A.length() / 2; i++) {
                    AA = AA + A.charAt(i);
                }
               for(int j=A.length()-1;j>=A.length()/2;j--){
                   BB=BB+A.charAt(j);
               }
                    if(BB.equals(AA)){
                         bobo=true;
                    }else {
                         bobo=false;                   }

            }

        System.out.println(bobo);
            if(A.length()%2!=0){

                for(int i=0;i<=A.length()-1;i++){
                    AA=AA+A.charAt(i);
                }
                for (int j=A.length()-1;j>=0;j--){
                    BB=BB+A.charAt(j);
                }
               if(BB.equals(AA)){
                   bobo=true;
               }else {
                   bobo=false;
               }
            }
        System.out.println(bobo);
         }


    }


