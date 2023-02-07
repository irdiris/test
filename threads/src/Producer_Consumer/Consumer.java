package Producer_Consumer;

public class Consumer extends Thread {
	  Container C= new Container();
	 
	 public Consumer(Container C) {
		 this.C= C;
		 this.setName("Consumer");	 
	 }
	  public void run() {
		  for(int i = 0; i<Container.M; i++) {
			  try {
				C.Consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }
	 

}
