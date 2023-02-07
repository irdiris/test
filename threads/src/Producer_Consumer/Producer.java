package Producer_Consumer;

public class Producer extends Thread {
	  Container C= new Container();
	 
	 public Producer(Container C) {
		 this.C= C;
		 this.setName("Producer");	 
	 }
	  public void run() {
		  for(int i = 0; i<Container.M; i++) {
			  try {
				C.Produce(Container.M);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		 	}
	  }
		  
}}
