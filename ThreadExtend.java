public class ThreadExtend extends Thread{
	@Override
	public void run(){
		System.out.println("Name of the thread is: "+Thread.currentThread().getName());
	}
	public static void main(String args[]){
		ThreadExtend t=new ThreadExtend();
		t.setName("Abd");
		t.start();
	}
}
