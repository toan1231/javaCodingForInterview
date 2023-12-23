package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class findTheSmallestSubstring {

	public static void main(String[] args) {
		String[]str= {"x","y","z"}; 

		String string="zzyxxyxyz";


	
		
		method(str,string);
		
 
	}
	public static void method(String[]a,String str) {
		String b="";
		String stringAdd="";
		for(int i=0;i<a.length;i++) {
			stringAdd+=a[i];
			
		//	why i<str.length()-2 below i don't understand but remember
			
		}
		for(int i=0;i<str.length()-2;i++) {
			
		 String c=str.substring(i, i+a.length);
		 if(stringAdd.equals(c)) {
			 System.out.println(c);
		 }
			
			
			}

			
			  
		   }
		
			
		}
		
		
		
	
