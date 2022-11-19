package Collection.com;
import java.util.*;
public class ItteratioinInArray {

	public static void main(String[] args) {
		List<String>  baby = new ArrayList<String>  ();
		baby.add("Sarfaraj");
		baby.add("Sihan");
		baby.add("Sara");
		baby.add("Safin");
		Collections.sort(baby);
		System.out.print(baby);
		System.out.println(" get all array without itterarion");
System.out.println(baby);

System.out.println();

//itteration in 1st proccesss
System.out.println(" get all array with 1st  itterarion");
for(int i =0;i<baby.size();i++) {
	System.out.print(" \t"+baby.get(i));
}
System.out.println();
System.out.println();
System.out.println();
System.out.println(" get all array with 2nd  itterarion");
for(String i :baby) {
	System.out.print("\t " +i);

	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println(" get all array with 3nd  itterarion");
	Iterator itr= baby.iterator();
	while(itr.hasNext()) {
		System.out.print("\t " +itr.next());
	}
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("from last of the Array");
	ListIterator<String> itr2=baby.listIterator(baby.size());
	while(itr2.hasPrevious()) {
		System.out.print("\t " +itr2.previous());
	}
	
	System.out.println();
	
	System.out.println("Array is IsEmpty or Not");
	
System.out.println(baby.isEmpty());

/// retainall methode is check common factor of 2 or more ArrayList;: 
System.out.println();
//System.out.println(baby.)
}}}
