// Executed online on https://www.jdoodle.com/online-java-compiler/
public class ThreadRunnable_5 implements Runnable {
	public void run(){
		System.out.println("Hello India");
	}
	public static void main(String args[]){
		for(int i=0;i<5;i++){
		    ThreadRunnable_5 r=new ThreadRunnable_5();
		    Thread t=new Thread(r);
		    t.start();
		}
	}
}