package com.company;

public class Foreachloop {

	public static void main(String[] args) {
		int s=0;
		int arr[]= {1,8,7,5,9};
		for(int a :arr) {
			System.out.println(a);	
			 s=s+a;
			}
		System.out.println(s);

	}

}
