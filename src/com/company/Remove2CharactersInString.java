package com.company;

public class Testing2 {

	public static void main(String[] args) {

		String name="Hibmybname";
		
		System.out.println(newName(name));

		}
	public static String newName(String name) {
		String name2="";
		String newName[]=name.split("");
		for(int i=0;i<name.length();i++) {
			if(!newName[i].equals("a")&!newName[i].equals("b")) {
				name2+=newName[i];
			}
			
		}
		return name2;
		
	}
	
}
