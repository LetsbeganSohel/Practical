package Private.Ltd;


interface NewInt{
	void print();
	void display();
	void creat();
	void rule();
}
abstract class Doctor implements NewInt{
	public void print() {
		System.out.println("Mr. Dutta is a doctor.");
	}
	public void display() {
		System.out.println("He is a doctor of CMC hospital");
	}
}
class NewDoctor extends Doctor{
	public void creat() {
		System.out.println("His wife is also a Doctor.");
	
	}
	public void rule() {
		System.out.println("They have 2 children.");
	}
	
}

public class InterWithAbst {

	public static void main(String[] args) {
		 NewDoctor ND= new  NewDoctor();
		 ND.print();
		 ND.display();
		 ND.creat();
		 ND.rule();
	}

}
