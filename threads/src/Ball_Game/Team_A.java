package Ball_Game;

public class Team_A extends Thread {
	int ID;
	Ball ball=new Ball();
	String phase="First-phase";
  public Team_A(int ID, Ball ball) {
	  this.ball=ball;
	  this.ID=ID;
  }
 @Override 
 public void run() {
	 synchronized (ball) {
	 while(phase.contains("First-phase")){ 
		
			 if (ID==ball.nbr_player) {
				ball.throw_ball();
				
				if(ID!=4) {
					ball.increment();
					System.out.println(ball.nbr_player);
					ball.notifyAll();
					
				}else {
					phase="Second-phase";
					System.out.println(phase);
				   
				}
			}else {
				try {
					ball.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	 
		} 

	while(phase.contains("Second-phase")){ 
		   
		 if (ID==ball.nbr_player) {
			ball.throw_ball_back();
			if(ball.nbr_player>1) {
				ball.decrement();
				ball.notifyAll();
			}else {
				phase="First-phase";
				   
			}
		}else {
			try {
				ball.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	 
	} 
}
 }}