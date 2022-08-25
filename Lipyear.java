package com.company;
import java.util.Scanner;

public class Lipyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise");
		int a=sc.nextInt();
		if(a%400==0) {
			System.out.println("Yes, it is a Lipyear");
		}
		else {
			System.out.println("No, it is not  a Lipyear");
		}
		

	}

}
