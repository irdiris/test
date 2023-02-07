package Producer_Consumer_V2;

public class Consumer extends Thread {
	private Container container;
	private int num;
	public Consumer(Container s, int num) {
		container=s;
		this.num=num;
	}
	@Override
	public void run() {
		int valeur=0;
		for (int i=0;i<10;i++) {
			valeur=container.prendre();
			System.out.println("Consumer "+i+" prend "+valeur);
		}
	}

}
