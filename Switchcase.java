package com.company;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int  a=sc.nextInt();
		switch(a){
		case 16:
			System.out.println("You are "+a );
			break;
		case 21:
			System.out.println("your age" +a);
			break;
		case 13:
			System.out.println("Yor age" +a);
			break;
			default:
				System.out.println(" Your age is not match" + a);
				
		}
		

	}

}
