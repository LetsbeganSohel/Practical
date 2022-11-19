package Collection.com;
import java.util.*;
public class PriorityQueueExemple {

	public static void main(String[] args) {
		PriorityQueue<String> Q= new PriorityQueue<String>();
		Q.add("Sohel");
		Q.add("Zihan");
		Q.add("Yasir");
		Q.add("Akash");
		Q.add("Bikash");
		Q.add("Cheatan");
		System.out.print(Q);
		System.out.println();
		System.out.println("head : " +Q.element());
		System.out.println("head : " +Q.peek());
		System.out.println(Q.remove());
		System.out.println(Q.poll());
		System.out.println(" After Removing");
		System.out.print(Q);
	}	
}
