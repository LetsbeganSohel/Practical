package Collection.com;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
	Set<String>S1= new HashSet<String>();// creating Hashset
	S1.add("Pen"); // adding Element 
	S1.add("Pencil");
	S1.add("Ereaser");
	S1.add("Pencil_box");
	S1.add(null);                              // we can add null here 
	System.out.print(S1);
	System.out.println();
	for(String s:S1) {                              // prenting St hashSet with the help of for_each loop
		System.out.print("  \t  "  + s);
	}
	System.out.println();
	Iterator<String> s2= S1.iterator();  // traversing with iterator 
	while(s2.hasNext()) {                              //. using while to print 
		System.out.println(s2.next());
	}
	System.out.println();
	Set<String>S3= new HashSet<String>();// creating  Another Hashset
	S3.add(null);
	S3.add("Chair");
	S3.add("Table");
	S1.remove(S3);
	System.out.print(S3);
	S3.removeAll(S3);// to remove all element from S3
	System.out.print(S3);
	
	
	}

}
    