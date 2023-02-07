package Producer_Consumer_V1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Container Co=new Container();
      Producer P= new  Producer(Co);
      Consumer C= new Consumer(Co);
      P.start();
      C.start();
	}

}
