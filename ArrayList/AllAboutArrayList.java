package Collection.com;
import java.util.*;
//import java.util.List;
public class AllAboutArrayList {

	public static void main(String[] args) {
		
		List<String>  flower = new ArrayList<String>  ();
		  flower.add("Rose");
		  flower.add("Jasmine");
		  flower.add("Marigold");
		  flower.add("Lotus");
		  flower.add("Lilly");
		  flower.add("Sunflower");
		  flower.add("Poppy");
		  flower.add(5,"Daisy");
		  flower.add(7,"Hibiscus");
		  flower.add("Sara");
		  System.out.println("The array List is  :" + flower.size());
		  System.out.print(flower);
		  System.out.println("The array List is  :" + flower.remove(4));
		  System.out.println(flower);
		  System.out.println("The array List is  :" + flower.set(6, "Sihan"));
		  System.out.println(flower);
		  System.out.println("The array List is  :" + flower.get(6));
		  System.out.println(flower);
		  }
		}

