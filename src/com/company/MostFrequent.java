package com.company;

public class MostFrequent {

    public static void main(String[] args) {
        int[]a={1,2,3,3};
        System.out.println(method(a));

}

   public static int method(int[] a){
        int theMostFrequentElement=0;
        int maxCount=1;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                  count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                theMostFrequentElement=a[i];
            }
        }

        return theMostFrequentElement;
   }

}










