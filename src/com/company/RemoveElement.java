package com.company;

public class Testing2 {

	public static void main(String[] args) {
		int[]a= {1,3,4,9,7};
		int elememntToRemove=7;
		int newArray[]=someArray(a);
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}

	}
    static int[] someArray(int[]a) {
		int newArray[]=new int[a.length-1];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!= 9 ){
				newArray[index]=a[i];
				index++;
			}
		}
		return newArray;
		
	}
	

}
