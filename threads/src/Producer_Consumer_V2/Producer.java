package Producer_Consumer_V2;

public class Producer extends Thread {
	private Container container;
	private int num;
	public Producer(Container s, int num) {
		container=s;
		this.num=num;
	}
	@Override
public void run() {
	for (int i=0;i<10;i++) {
		container.mettre(num);
		System.out.println("producer "+i);
		try {
			sleep((long) (Math.random()*100));}
			catch(InterruptedException e) {}
		}
	}
}

