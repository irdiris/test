package Philosophers;



public class philosophers extends Thread{
	 forks left_fork;
	forks right_fork;
	String name;
	
	public philosophers(forks left_fork,forks right_fork,String name) {
		this.left_fork=left_fork;
		this.right_fork=right_fork;
		this.name=name;
	}
	public void eats() {
		if(left_fork.state) {
			left_fork.take();
			System.out.println(Thread.currentThread().getName() +" takes left fork");
			if(right_fork.state) {
				right_fork.take();
		
			    System.out.println(Thread.currentThread().getName() +" takes right fork");
			      System.out.println(Thread.currentThread().getName() +" Eating");
				try {
					philosophers.currentThread();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				right_fork.put();
				System.out.println(Thread.currentThread().getName() +" puts right fork");
				left_fork.put();
				System.out.println(Thread.currentThread().getName() +" puts left fork");
			}else {
				System.out.println(Thread.currentThread().getName() +" puts left fork hungrily");
				left_fork.put();
				
			}
		}
	}
	public void think() {
		System.out.println("thinking");
	}
	
	public void run() {
		
		eats();
	}
	 	
}
