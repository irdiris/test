package Producer_Consumer_V3;

public class Producteur extends Thread {
	ProdConMonitor Mo;
	Producteur(ProdConMonitor Mo){this.Mo=Mo;}
	public void run() {
		try {
			while(true) {
					int m= (int)(1000*Math.random());
				    Mo.Deposer(m);
					Thread.sleep((int)(1000*Math.random()));
				}
			}catch(InterruptedException e) {}
		}
	}


