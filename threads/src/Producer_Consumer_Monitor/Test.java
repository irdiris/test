package Producer_Consumer_Monitor;

public class Test {
	  static Container buffer=new Container();
		static Producer Azzedine=new Producer(buffer);
		static Consumer Amine=new Consumer(buffer);
	public static void main(String[] args) {
	
     try {
		Azzedine.start();
		Amine.start();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
