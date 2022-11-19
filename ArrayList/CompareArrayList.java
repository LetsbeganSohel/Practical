package Collection.com;
import java.util.ArrayList;
public class CompareArrayList {

	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Apple");
	a1.add("Banana");
	a1.add("Guava");
	a1.add("Papaya");
//	ArrayList<String> a2=new ArrayList<String>();
//	System.out.println(" This is for Ill people");
//	a2.add("Apple");
//	a2.add("Cucumber");
//	a2.add("Pomegranate");
//	a2.add("Papaya");
	ArrayList<String> a3=new ArrayList<String>();
	System.out.println(" This is for extreamly sick people");
	a3.add("Apple");
	a3.add("Banana");
	a3.add("Chickoo");
	a3.add("Orange");
System.out.println(a1.equals(a3));// to check a1 and a2 are equal or not
System.out.println(a1.retainAll(a3));
System.out.println(a1.contains(a3));
System.out.println(a1.removeAll(a3));
for(int i=0;i<a3.size()-1;i++) {
	System.out.print(a3.get(i));
}
for(int i=0;i<a1.size()-1;i++) {
	System.out.print(a1.get(i));
}
	}

}
