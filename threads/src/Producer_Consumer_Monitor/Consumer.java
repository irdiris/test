package Producer_Consumer_Monitor;

public class Consumer extends Thread {
	Container Con= new Container();
	
 public Consumer(Container Con) {
	 this.Con=Con;	
	 this.setName("Consumer");
	 }
 
 
 public void run() {
	  for(int i = 0; i<Container.capacity; i++) {
		  try {
			Con.pull();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	 	}
 }}}