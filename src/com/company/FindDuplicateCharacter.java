package com.company;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
String name="abacab";
    
		method(name);
	}
	public static void method(String str) {
    String[]array=str.split("");
    for(int i=0;i<str.length();i++) {
    	int count=1;
    	for(int j=i+1;j<str.length();j++) {
    		if(array[i].equals(array[j])){//cannot use == here (I don't know why
    			count++;
    			array[j]=("0");//cannot use equals here I don't know why
    			
    		}
    	}
    	if(array[i]!=("0")){
    		System.out.println(str.charAt(i)+" "+count);
    	}
    }
	
	
}
	
}
	
		
		
	
	

