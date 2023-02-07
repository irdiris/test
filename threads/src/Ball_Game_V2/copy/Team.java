package Ball_Game_V2.copy;

import java.util.ArrayList;

import java.util.List;

public class Team {
    private int nbrPlayers;
    private List<Player> Players;
    private enum phase {forward, backward};
    private phase current;
    
    public Team ( int nbrPlayers) {
    	this.nbrPlayers=nbrPlayers;
    	Players= new ArrayList<>(nbrPlayers);
    	current=phase.forward;
    	for(int i=0; i<nbrPlayers;i++) {
    		Players.add(new Player(this,i+1));}	
    }
    
    public void play() {
      Players.forEach(Thread:: start);
      Players.get(0).Catch();
      synchronized (this) {notifyAll();}
    }
    public void Stop() {
    	Players.forEach(Player::endgame);
    	synchronized (this) {
    		notifyAll();
    	}
    	Players.forEach(Player::State);
    }
    public Player getPlayer(int currentPlayer) {
    	switch (current) {
		case forward: {
			
		  if(currentPlayer>=nbrPlayers) {
			  current=phase.backward;
		  };
		}
		case backward: {
			
			  if(currentPlayer<=1) {
				  current=phase.forward;
			  };
			}
    }
    	 int Player= (current ==phase.forward? currentPlayer+1: currentPlayer -1);
    	 return Players.get(Player-1);
}}

