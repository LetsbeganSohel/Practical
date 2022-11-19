package Threads.com;

public class ThreadPeriority extends Thread {
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("This is a thread related problems");
			Thread.sleep(500);
		}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
public static void main(String[] args) {
		ThreadPeriority TP= new ThreadPeriority();
		ThreadPeriority TP1= new ThreadPeriority();
		ThreadPeriority TP2= new ThreadPeriority();
		TP1.setPriority(MAX_PRIORITY);
		System.out.println(TP1.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		TP2.setName("Third Thread");
		System.out.println(TP2.getName());
		System.out.println(Thread.currentThread().getName());
		TP.start();
		TP1.start();
		TP2.start();
	}
	}
