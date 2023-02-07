package Producer_Consumer_V1;

import java.util.concurrent.Semaphore;


public class Container {
    static Semaphore semProducer = new Semaphore(1);
    static Semaphore semConsumer = new Semaphore(0);
    
    int Product;
     
    public void Produce(int Product){
        try {
            semProducer.acquire();
            this.Product=Product;
            System.out.println(Thread.currentThread().getName()+" Making product");
            semConsumer.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
    public void Consume(){
        try {
            semConsumer.acquire();
            System.out.println(Thread.currentThread().getName()+" Consuming Product");
            semProducer.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}