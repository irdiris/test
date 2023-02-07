package Producer_Consumer_V1;

public class Consumer extends Thread{
    
    Container Co;
     
    public Consumer(Container Co){
        this.Co=Co;
        this.setName("Consumer Thread");  
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            Co.Consume();
        }
         
    }
 
}
