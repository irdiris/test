package RunnableVSThread;

public class thread extends Thread {
	    private int counter = 0;
	    public void run() {
	       counter++;
	        System.out.println("ExtendsThread: Counter : " + counter);

	    }
	}
