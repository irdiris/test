package Producer_Consumer_Monitor;



public class Producer extends Thread {
	Container Con= new Container();
	
 public Producer(Container Con) {
	 this.Con=Con;	
	 this.setName("Producer");
	 }
 
 
 public void run() {
	  for(int i = 0; i<Container.capacity; i++) {
		  try {
			Con.put(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	 	}
 }
 
}}
