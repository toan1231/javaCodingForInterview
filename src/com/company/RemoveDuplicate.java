package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String name="Heep";
		
		System.out.println(newName(name));


		}
	public static String newName(String str) {
		Set<Character>set=new HashSet<Character>();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				builder.append(str.charAt(i));
			}
		}
		
		
		
		
		return builder.toString();
	

		


		
			
		
			
		}
		
		
	}
	

