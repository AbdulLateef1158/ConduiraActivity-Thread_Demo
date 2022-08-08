public class RunnableThread implements Runnable{
	@Override
	public void run(){
		System.out.println("The thread name is: "+Thread.currentThread().getName());

	}
	public static void main(String[] args) {
		RunnableThread r=new RunnableThread();
		Thread t=new Thread(r);
		t.setName("R-Thread");
		t.start();
	}
}