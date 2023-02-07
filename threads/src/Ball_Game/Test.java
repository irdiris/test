package Ball_Game;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ball ball= new Ball();
        Team_A player_1= new Team_A(1,ball);
        player_1.setName("Player_1");
        Team_A player_2= new Team_A(2,ball);
        player_2.setName("Player_2");
        Team_A player_3= new Team_A(3,ball);
        player_3.setName("Player_3");
        Team_A player_4= new Team_A(4,ball);
        player_4.setName("Player_4");
        player_1.start();
        player_2.start();
        player_3.start();
        player_4.start();
        
        
	}

}
