package Producer_Consumer_V3;

public class Consommateur extends Thread {
	ProdConMonitor Mo;
	Consommateur(ProdConMonitor Mo){this.Mo=Mo;}
	public void run() {
		try {
			while(true) {
				int m=Mo.Prelever();
				Thread.sleep((int)(1000*Math.random()));
			}
		} catch(InterruptedException E) {}
	}

}
