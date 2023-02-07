package Philosophers;

import threads.semaphore;

public class forks {
	int max=1;
	semaphore fork=new semaphore(max,"S");
	boolean state=true;
	
	
	
	public boolean state() {
		return state;}
	
	
	public void take() {
		try {
			fork.P();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int S=fork.getmax();
		
		if(S==0) {
			state=false;}
			
	}
	public void put() {
		fork.V();
	 
		state=true;
	}

	
}
