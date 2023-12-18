package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseCoupleWord {
	
	   public static void main(String[] args) {
		   String name="my name is chau he het thoi";
	   System.out.println(method(name));
		   
		  }
	   public static String method(String array){
		 String newString=""; 
		  String[]stringArray=array.split(" ");
		  for(int i=stringArray.length-1;i>=0;i--) {
			  newString+=stringArray[i]+" ";
		  }


		  


		   
		return newString;
		   
		
	
		   
	}
	   }
