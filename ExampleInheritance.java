package com.company;

class Area{
    double rad;
    double d;
    Area(double r){
    	this.rad=r;
    	double sq=rad*rad;
    	System.out.print("   "  + sq);
    }
    Area(double l, double d){
    	this.rad=l;
    	this.d=d;
    	System.out.print(" " +rad *d);
    }
}
class Rectangle extends Area{

	Rectangle(double l, double d) {
		super(l, d);
		System.out.println(" "  + "This is a Rectangle");
		
	}
	Rectangle(double l) {
		super(l);
		System.out.println(" "  + "This is a Square");
	}
	
}

public class ExampleInheritance {

	public static void main(String[] args) {
		Area Rc = new Rectangle(8.5,5.5);
		Area Ar= new Rectangle(4.5);
	}

}
