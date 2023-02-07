package Ball_Game_V2.copy;



public class Player extends Thread {
    private Team team;
    private int PlayerID;
    private boolean Hasball;
    private boolean Gameover;
   
    
    public Player(Team team, int PlayerID) {
    	this.team=team; 
    	this.PlayerID=PlayerID;
    	Hasball=false;
    	Gameover=false;
    }
  public void Catch() {
	  System.out.println("Player "+PlayerID+": got the ball!");
	  Hasball=true;
  }
  public void endgame() {
	  Gameover=true;
  }
    public void State() {
    	System.out.println("Player"+PlayerID+ (Hasball? "has ball!": "doesn't have ball."));
    }
    
@Override
public void run() {     while (!Gameover) {
    try {
        synchronized (team) {
            if (Hasball) {
                Player nextPlayer = team.getPlayer(PlayerID);
                nextPlayer.Catch();
                Hasball = false;
                team.notifyAll();
            } else {
                team.wait();
            }
        }
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
    
}
