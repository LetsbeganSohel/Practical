package com.company;
public class AmstrongNumber {
	public static void main(String[] args) {
		int a=153;
		int i=3;
		int b = 1;
		int c,x;
		while(i<=3) {
		 c=a%10;
		 b+=Math.pow(c, i);
		 a/=10;
			
		}
		System.out.println(b);
		if(b==Math.pow(153, 3)) {
			System.out.println("it is a amstrong Number");
		}
		else {
			System.out.println("It is not a Amstrong Number")
		}
	}

}
