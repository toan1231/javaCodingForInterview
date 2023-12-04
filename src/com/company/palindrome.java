package com.company;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class palindrome {

	public static void main(String[] args) {

	String name="abcdcba";
	System.out.println("the first way :"+method(name));
	System.out.println("the second way :"+method2(name));
	
	
	
 
	
		}

		public static String method(String str) {
			String statement="";
			StringBuilder builder=new StringBuilder(str);
			String name=builder.reverse().toString();
			if(name.equals(str)) {
				 statement="this is palindrome";
			}else {
				statement="this is not a palindrome";
			}
			
			return statement;

		
		
		
	}
		public static String method2(String str) {
			String reverse="";
			String statement="";
			for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);	
			if(str.equals(reverse)) {
				statement="this is palindrome";
			}else {
				statement="this is not palindrome";
			}
			}
			return statement;
			
		}
}
	

