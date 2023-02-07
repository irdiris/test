package threads;

public class threads extends Thread {
	  semaphore s= new semaphore(1,"s");
     static int count=0;
	@Override
     public synchronized void run() {
		int i= 0;
	
		try {
			s.P();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	while ( i<10) {
		count= count+1;
		i++;	
		
	}
	System.out.println(count);
     s.V();
	 
}}
