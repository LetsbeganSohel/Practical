package Threads.com;

public class Demonthreads extends Thread {
public void run() {
//	System.out.println("Name :"+  Thread.currentThread());
//	System.out.println("Demon :"+  Thread.currentThread());
	if(Thread.currentThread().isDaemon()) {
		System.out.println("I am Demon Treads");
	     System.out.println(Thread.currentThread().getName());
	}
	else {
		System.out.println("I am User Treads");
	}
}
	public static void main(String[] args) {
		Demonthreads Dt= new Demonthreads();
		Demonthreads Dt2= new Demonthreads();
		Demonthreads Dt3= new Demonthreads();
		Dt.setDaemon(true);
		Dt2.setDaemon(true);
		//Dt3.setDaemon(true);
			Dt.start();
	   Dt3.start(); 
		Dt2.start();

	}
	private void setName(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private void setName(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
