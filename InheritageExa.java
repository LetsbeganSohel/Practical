package com.company;

class Student{
	String n1="Sohel";
	 int Marks=89;
	 int roll=12;
	void Name() {

	}
}
class Student2 extends Student{
	void marks(int a, int r) {
		System.out.println(n1+" "+Marks+" "+roll+"");
		System.out.println((a+r)/2);
	}
	
}
class ClassV extends Student2{
	void  marks(int a,int b,int c) {
		System.out.println(n1+" "+Marks+" "+roll+"");
	System.out.println((a+b+c)/3);
	}
}
public class InheritageExa {

	public static void main(String[] args) {
		 ClassV V1= new  ClassV();
		 V1.Name();
		 V1.marks(98,75);
		 V1.marks(56,86,90);

	}

}
