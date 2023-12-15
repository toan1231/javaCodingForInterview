package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
	
	   public static void main(String[] args) {
		   String name="my name is chau he het thoi";
	   System.out.println(method(name));
		   
		  }
	   public static String method(String array){
		 String newString=""; 
		  String[]stringArray=array.split(" ");
		 int index=0; 
		 String[]stringNewArray=new String[stringArray.length];
		  for(int i=stringArray.length-1;i>=0;i--) {
			  stringNewArray[index]=stringArray[i];
			  newString+= stringNewArray[index]+" ";
			index++;  
			//newString+= stringNewArray[index-1]+" ";
		  }
		   
		return newString;
		   
		
	
		   
	}
	   }
