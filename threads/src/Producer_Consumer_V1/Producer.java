package Producer_Consumer_V1;

public class Producer extends Thread{
    
    Container Co;
     
    public Producer(Container Co){
        this.Co=Co;
        this.setName("Producer Thread");
       
    }
     
    public void run(){
        for(int i=0;i<5;i++){
            Co.Produce(i);
        }
         
    }
 
}