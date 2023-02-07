package Ball_Game;

public class Ball{
	int nbr_player=1;
    public synchronized void throw_ball() {
    	System.out.println(Thread.currentThread().getName()+" :throws ball");
    }
    public synchronized void throw_ball_back() {
    	System.out.println( Thread.currentThread().getName()+" :throws ball back");
    }
    public synchronized void increment() {
    	nbr_player++;
    }
    public synchronized void decrement() {
    	nbr_player--;
    }
}

