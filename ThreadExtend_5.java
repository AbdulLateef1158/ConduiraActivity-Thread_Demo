// Executed online on https://www.jdoodle.com/online-java-compiler/
public class ThreadExtend_5 extends Thread {
	public void run(){
		System.out.println("Hello All");
	}
	public static void main(String args[]){
		ThreadExtend_5 t1=new ThreadExtend_5();
		ThreadExtend_5 t2=new ThreadExtend_5();
		ThreadExtend_5 t3=new ThreadExtend_5();
		ThreadExtend_5 t4=new ThreadExtend_5();
		ThreadExtend_5 t5=new ThreadExtend_5();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}