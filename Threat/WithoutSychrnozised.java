package Threads.com;
class MyThreadClass{
	// synchronized void print(int x) {//  synchronized is run Thread one by one , not happazartly
		void print(int x) {        // it print Threads happasartly 
		 for(int i =1;i<=8;i++) {
			System.out.println(x*i);
			try {
				Thread.sleep(700);
			}
			catch(Exception e) {
				System.out.println(i);
			}
		}
	}
}
class Thread1 extends Thread{
	MyThreadClass Ts;
	Thread1(MyThreadClass Ts){
		this.Ts=Ts;
	}
	public void run() {
		Ts.print(6);
	}
}
class Thread2 extends Thread{
	MyThreadClass Ts;
	Thread2(MyThreadClass Ts){
		this.Ts=Ts;
	}
	public void run() {
		Ts.print(100);
	}
}
public class WithoutSychrnozised {

	public static void main(String[] args) {
		MyThreadClass Mt = new MyThreadClass();
		Thread1 T1= new Thread1 (Mt);
		Thread2 T2= new Thread2 (Mt);
		T1.start();
		T2.start();
	}

}
