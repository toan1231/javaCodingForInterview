package com.company;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramDemo {

	public static void main(String[] args) {

	String name1="java";
	String name2="jaav";
	System.out.println(method(name1, name2));
 
	
		}

		public static String method(String str1,String str2) {
			String statement="";
			String[]name1=str1.split("");
			String[]name2=str2.split("");
			Arrays.sort(name1);
			Arrays.sort(name2);
			if(Arrays.equals(name1, name2)==true) {
			
			statement="this is anagram";
			
			
			
		}else {
			statement="no, this is not a angagram";
		}
			return statement;
		
	}
}
	

