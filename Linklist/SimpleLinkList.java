package LinkListusingJava.com;
import java.util.*;
public class SimpleLinkList {
	public static void main(String args[]) {
		LinkedList<String>L1= new LinkedList<String>(); // create list name L1
		LinkedList<String>L2= new LinkedList<String>(); // creat 2nd list name L2
		L2.add("Sihan");
		L2.add("Sara");
		L2.add("Sihan");
		L2.add("Safin");
		L1.add("Sohel");  // add List element in L1
		L1.add("Saad");
		L1.add("Sajid");
		L1.add("Eakramul");
		L1.add("Afridi");
		//System.out.println(L1);// print list L1
		//Iterator <String>it= L1.iterator();
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//L1.addAll(L2);
		//System.out.println(L1);
		L1.addAll(0, L2); // add the L2 at 0th position of the L1 list ;
		//System.out.println(L1);
		//L1.remove("Sihan");// to remome Sihan 
		//L1.remove(3);// to remove at the index at number at 3
		L1.removeFirstOccurrence("Sihan"); // remove the 1st duplicate one 
		/*Iterator <String>it= L1.iterator(); // the iteration 
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
	// reverse linkList 
		System.out.println();
		System.out.println();
		/*ListIterator <String>it2=L1.listIterator(L1.size());
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}*/
		
		System.out.println();
		System.out.println();
	/*	Iterator <String>it= L1.descendingIterator(); // the iteration 
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		System.out.println();
		System.out.println();
		Iterator <String>it= L1.iterator(); // the iteration 
		Collections.reverse(L1);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
}}
