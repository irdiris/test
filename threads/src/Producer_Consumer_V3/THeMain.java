package Producer_Consumer_V3;

public class THeMain {

	public static void main(String[] args) throws InterruptedException {
		int N=5;
		ProdConMonitor pc= new ProdConMonitor(N);
		Producteur producteur= new Producteur(pc);
		Consommateur consommateur=new Consommateur(pc);
		producteur.setName("Producteur");
		producteur.start();
		consommateur.setName("Consommateur");
		consommateur.start();
		producteur.join();
		consommateur.join();
	}

}
