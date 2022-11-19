package LinkListusingJava.com;
interface Lamda2 {
	abstract int add(int a, int b);
}
public class LamdaFunction{
	public static void main(String[] args) {
		Lamda2 obj=(a,b)->{return (a+b);
		};
	System.out.println(obj.add(34, 56));	
	}
}
