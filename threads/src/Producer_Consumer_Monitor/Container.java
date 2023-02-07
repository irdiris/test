package Producer_Consumer_Monitor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class Container {
 Lock state= new ReentrantLock();
	Condition full=state.newCondition(); 
	Condition Empty=state.newCondition(); 
   int Count;
    public  static int capacity=5;
   int[] container= new int[capacity];
   void put(int m) throws InterruptedException {
	   if(Count==container.length) {
		   Empty.await();
		   full.signal();
	   }
	   while(Count<container.length) {
		   container[Count]=m;
		   System.out.println(Thread.currentThread().getName()+"  is making stuff");
		   Count++;
	   }
	   
   }
   @SuppressWarnings("null")
void pull() throws InterruptedException {
	   if(Count==0) {
		   full.await();
		   Empty.signal();
	   }
	   while(Count!=0) {
		   container[Count]=(Integer) null;
		   System.out.println(Thread.currentThread().getName()+"  is taking stuff");
		   Count--;
	   } 
	
}}
