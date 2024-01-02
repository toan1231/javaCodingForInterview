package com.company;
import java.security.KeyStore.Entry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Puss222toTheEnd {

	public static void main (String[] args) {
         
		int []a= {2,2,2,3,3,3,2};
		
		List<Integer>list=new ArrayList<Integer>();
		 
		 
		for(int each:a) {
			if(each!=2) {
				list.add(each);
			}
			
		}
		int differentLength=a.length-list.size();
	     for(int i=0;i<differentLength;i++){
	    	 list.add(2);
	     }
	System.out.println(list);


	}
	
}
	

	
		
		
	
	

