package RunnableVSThread;

public class main {

	public static void main(String[] args) throws InterruptedException {
        // USING IMPLEMENTS RUNNABLE


     runnable rc = new runnable();
      Thread t1 = new Thread(rc);     
       t1.start();
        Thread.sleep(1000);
      
        Thread t2 = new Thread(rc);      
         t2.start();
         Thread.sleep(1000); 
         Thread t3 = new Thread(rc);
         t3.start();

        // USING EXTENDS THREAD


       thread tc1 = new thread();
        tc1.start();
        Thread.sleep(1000);


       thread tc2 = new thread();
        tc2.start();
        Thread.sleep(1000); 

        thread tc3 = new thread();
        tc3.start();


    }




	}


