package synchronization;

public class Demo extends Thread{
	
	Hello h;
	String msg;
	
	public Demo(String msg,Hello h) {
		this.msg=msg;
		this.h=h;
	}
	
	@Override
	public void run() {
		h.display(msg);
	}
}
