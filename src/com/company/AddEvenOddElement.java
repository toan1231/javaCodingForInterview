package com.company;

public class AddEvenOddElement {
    public static void main(String[] args) {
        int[] a = {6,2,2,3,1};
        System.out.println("the total of even # is "+method1(a));
        System.out.println("the total of odd # is "+method2(a));

    }
    public static int method1(int[]a){
      int total=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                 total=total+a[i];
            }

        }

        return total;
    }
    public static int method2(int[]a) {
        int total=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                total+=a[i];
            }
        }
        return total;
    }
}



