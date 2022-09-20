package Private.Ltd;



abstract class Student{
	abstract void hardwork();
	abstract void helpfull();
	
}
class BadBoy extends Student{
	void hardwork() {
			System.out.println("Student must be Hardworking");
	}
	void helpfull() {
		System.out.println("Students should be helpfull");
	}
	void decepline() {
		System.out.println("They are all deciplined ");
	}
	
}

public class AbstractExamp {

	public static void main(String[] args) {
		BadBoy BD= new BadBoy();
		BD.decepline();
		BD.hardwork();
		BD.helpfull();
	}

}
