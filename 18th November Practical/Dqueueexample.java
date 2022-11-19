package Collection.com;

import java.util.*;

public class Dqueueexample {

	public static void main(String[] args) {
	 Deque<String> De= new ArrayDeque<String>();// creating Dequeue 
	 De.add("Ram");  // adding element in Dequeue in De 
	 De.add("Sam");
	 De.add("Jadu");
	 De.add("Madhu");
	 for(String s:De) {                                     // traversing with for each-loop
		 System.out.print("\t  " +s);                  // printing element 
	 }
	 System.out.println();
	  // adding element in Dequeue in first ;
	 String s1= "Tanu";
	 De.addFirst(s1);    // adding s1 in first position of De Dequeue
	 System.out.println(De);
	 System.out.println();
	 
	 // Deleting  element in Dequeue in first ;
	 De.removeFirst();
	 System.out.println(De);
	 System.out.println();
	 Deque<String> De2= new ArrayDeque<String>();
	 De2.add("Rahim");
	 De2.add("Mitthu");
	 De2.add("Rony");
	 De.contains(De2);
	 System.out.println( De.pop());// to take element from the Deque
	 System.out.println(De);
	}

}
