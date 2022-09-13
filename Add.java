package com.company;

public class Add {
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b,int c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		System.out.println(Add.add(2, 3));
		System.out.println(Add.add(2, 3,6));
	}

}
