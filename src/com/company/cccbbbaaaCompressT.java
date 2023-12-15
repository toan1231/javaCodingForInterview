package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class cccbbbaaaCompressT {
	
	   public static void main(String[] args) {

	         String a = "aabbbccmmmmn";
       
	 
		   StringBuilder builder=new StringBuilder();
		   int count=1;
		   char variant=a.charAt(0);
		   for(int i=1;i<a.length();i++) {
			   if(a.charAt(i)==variant) {
				   count++;
			   }
			   if(a.charAt(i)!=variant) {
				   builder.append(variant).append(count)  ;
					  count=1;
					  variant=a.charAt(i);
				   } 
			   }
		   
		   builder.append(variant).append(count);
		   System.out.println(builder.toString());
		
		  
	}
	   }
