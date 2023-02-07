package Producer_Consumer;


import java.util.concurrent.Semaphore;

import threads.semaphore;

public class Container { 
	  static int M=5; 
	 int[] container= new int[M];
	// static Semaphore SemProduce= new Semaphore(5);
	// static Semaphore SemConsume= new Semaphore(0);
	semaphore S= new semaphore(5,"S");
	semaphore S1= new semaphore(5,"S");
	semaphore S2= new semaphore(1,"S");
	
	public void Produce(int Product) throws InterruptedException {
		for(int i=0; i<5; i++) {	
			S.P();}
				for(int i1=0; i1<5; i1++) {
					S2.P();
					container[i1]=Product;
				System.out.println(Thread.currentThread().getName()+" is producing");
				Thread.currentThread();
				Thread.sleep(500);
		S2.V();}
				for(int i=0; i<5; i++) {
					S.V();}
				}

	public void Consume() throws InterruptedException {
    	for(int i=0; i<5; i++) {
				S1.P();	}
    	
    	  for(int i1=0; i1<5; i1++) {
			container[i1]= 0;
			S2.P();
    	  System.out.println(Thread.currentThread().getName()+" is consuming");
    	  Thread.currentThread();
		Thread.sleep(500);
		S2.V();}
    	  for(int i1=0; i1<5; i1++) {
			S1.V();}
    }}
			
			
	

