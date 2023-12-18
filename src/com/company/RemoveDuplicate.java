package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String name="mooot";
		
		System.out.println(newName(name));


		}
	public static String newName(String str) {
		List<Character>list=new ArrayList<Character>();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(!list.contains(c)) {
				list.add(c);
				builder.append(c);
			}
		}
		
		
		
		
		return builder.toString();
	

		


		
			
		
			
		}
		
		
	}
	
		
