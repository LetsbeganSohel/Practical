package Private.Ltd;


class Encapculation2 {
	private String name;
	public   String getName() {      //computer get the value here
		return name;
	}
	public  void setName(String name) {  //computer set the value here  
		this.name= name;
		System.out.println("complied successfully");
	}

}

public class Encapculation{
	public static void main(String[] args) {
		Encapculation2 Ep= new Encapculation2();
		Ep.setName("Sohel");
		System.out.println(Ep.getName());
		
	}
}
