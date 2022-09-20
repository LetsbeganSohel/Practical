package Private.Ltd;


 abstract  class  Test{
	Test(){
		System.out.println("It is a Constractor");
	}
	void Me() {
		System.out.println("We are not a bad, we are just naughty");
	}
	abstract void simple();
	}
public  class AbstractInClass extends Test {
	void simple() {
		System.out.println("We are as simple as middleclass");
	}

	public static void main(String[] args) {
		AbstractInClass As= new AbstractInClass ();
		As.Me();
		As.simple();
	}

}
