package threads;

public class semaphore {

	int max;
	String name;
	public semaphore (int max, String name) {
		this.name=name;
		this.max=max;
	}
	
	public synchronized void P() throws InterruptedException {
		max--;
		if(max<=0) { 
	wait();	}	
		
	}
	public synchronized void V() { 
			 max++;
			 notifyAll();	
	}	
	public int getmax() {
		return max;
	}
}
