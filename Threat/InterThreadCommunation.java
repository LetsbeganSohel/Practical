package Threads.com;
class InterThread{
	int i; 
	boolean value = false;
	synchronized void product(int i) {
		if (value ) {
			try {
			//	wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}}
		synchronized int consume() {
			if(!value) {
				try {
				//	wait();
				}
				catch(Exception e) {
					System.out.println(e);
				}	
			}
			System.out.println("Production consumed"+ i);
			value =true;
			notify();
		return i;
		}
}
class Product extends Thread{
	InterThread iThread;
	Product(iThread){
		
	}
}

public class InterThreadCommunation {

	public static void main(String[] args) {
	
	}

}
