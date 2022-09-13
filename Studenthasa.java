package com.company;

class Addressaas{
	String area,city, country;
	Addressaas(String area,String city,String country){
		this.city=city;
		this.area= area;
		this.country= country;	
	}
}
public class Studenthasa {
	int id;
	String name;
	Addressaas address;
	Studenthasa(int id, String name,Addressaas address){
		this.id=id;
		this.address=address;
		this.name=name;
	}
	void show() {
		System.out.println(id +"  " +name+" ");
		System.out.println(address.area +" "+ address.city+" "+address.country+" ");
	}
	public static void main(String[] args) {
		 Addressaas ad= new  Addressaas("Golabari","Barasat","India");
		 Studenthasa sa= new Studenthasa(23,"Sohel", ad);
		 sa.show();
	}

}
