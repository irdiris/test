package Producer_Consumer_V3;

public class ProdConMonitor implements PC_interface {

	private int NbPliens=0,tete=0,queue=0;
	private int N;
	private int tampon[];
	ProdConMonitor(int n){
		N=n;tampon=new int [N];
	}
	@Override
	public void Deposer(int m) throws InterruptedException {
		while(NbPliens==N) {wait();}
		tampon[queue]=m;
		queue=(queue+1)%N;
		NbPliens++;
		System.out.println(Thread.currentThread().getName()+"vient de produire"+m);
		notifyAll();
	}
	

	@Override
	public int Prelever() throws InterruptedException {
		while(NbPliens==0) {wait();}
		int m= tampon[tete];
		tete=(tete+1)%N;
		NbPliens--;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+"vient de consommer"+m);
		return m;
	}

}
