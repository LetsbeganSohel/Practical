package com.company;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="Golabari Barasat";
		if(address.endsWith("Barasat")) {
			if(address.contains("Kadamgacchi")) {
				System.out.println("No you not in correct address");
			}
			else if (address.contains("Pirgaccha")) {
			System.out.println("you are not in proper address");
			}
			else {
			System.out.println(address.split(",") [0] );
		}
	}
}
}
