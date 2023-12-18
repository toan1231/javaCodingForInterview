package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ReverseEachWordOfcentence {

	public static void main(String[] args) {
      String str="I love you very much";
      StringBuilder builder=new StringBuilder();
      String[]array=str.split(" ");
      for(int i=0;i<array.length;i++){
    	 String word= array[i];
    	  StringBuilder builder2=new StringBuilder(word);
    	 String reverse= builder2.reverse().toString();
    	 builder.append(reverse+" ");
      }
      {
    	  
      }
      builder.toString();
      System.out.println(builder.toString());
		
	}
	
	}


