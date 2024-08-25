package com.company;

public class Add_total_of_a_odd_or_even {

	public static void main(String[] args) {
		
		String name="12345678";
		String[]name2=name.split("");
		int total1=0;
		int total2=0;
		for(int i=0;i<name2.length;i++) {
			int c=Integer.valueOf(name2[i]);
			if(c%2==0) {
				total1+=c;
			}else {
				total2+=c;
			}
		}
		

		System.out.println("total even is: "+total1);
		System.out.println("total odd is: "+total2);
		
		

}
}
