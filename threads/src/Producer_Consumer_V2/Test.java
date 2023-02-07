package Producer_Consumer_V2;

public class Test {

	public static void main(String[] args) {
		
			Container s=new Container();
			Producer P= new Producer(s,0);
			Consumer C=new Consumer(s,1);
			
			P.start();
	        C.start();
	}

}
