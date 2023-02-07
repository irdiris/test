package Philosophers;

public class Ph_Test {

	static String[] names= {"ali","azzedine","chihab","adem","amine"};
	static forks[] forks=new forks[5];
	static philosophers[] philosopher=new philosophers[5];
	
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<forks.length;i++) {
			forks[i]=new forks();
		}
		for(int i=0;i<philosopher.length;i++) {
			philosopher[i]=new philosophers(forks[i],forks[(i+1)/forks.length],names[i]);
			 philosopher[(int) (Math.floor(Math.random() * (+4 + 1 - 0)) + +0)].sleep(1000);
			 philosopher[i].setName(names[i]);
			philosopher[i].start();
		}
		
	}

}
