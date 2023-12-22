package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class printUpperCaseAndPrintLowercase_of_a_word {

	public static void main(String[] args) {
  String name="abcCDmIxTmmnn";
  System.out.print("the upper case is: ");
  for(int i=0;i<name.length();i++) {
	  char charr=name.charAt(i);
	  Character charrr1=charr;
	  
	 
	 
	  if(charrr1.isUpperCase(charr)==true) {
		  
		  System.out.print(charr);
		   
	  }
	
	 
  }
  System.out.println();//Must be out of the loop
  System.out.print("the lower case is: ");
  for(int i=0;i<name.length();i++) {
	  char charr=name.charAt(i);
	  Character charrr1=charr;
	 
	 
	  if(charrr1.isLowerCase(charr)==true) {
		  System.out.print(charr);
		   
	  }
	
	 
  }
  
		
	}
}