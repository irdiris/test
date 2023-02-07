package Producer_Consumer;

public class TestP_C {

	public static void main(String[] args) {
		Container Co=new Container();
		Producer P=new Producer(Co);
		Consumer C=new Consumer(Co);

		P.start();
		C.start();
	
	}

}
