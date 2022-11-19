package Threads.com;

public class ThreadNewExample extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(900);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadNewExample Te= new ThreadNewExample();
		ThreadNewExample Te1 = new ThreadNewExample();
		ThreadNewExample Te2 = new ThreadNewExample();
		Te.start();
		Te2.start();
		Te1.start();
		Te.join();
	}

}
