package BinarySearch;

public class Test {

	public static void main(String[] args)   {
		
			 int[] t = {5, 8, 3, 2, 7, 10, 1};
			 
			 BinarySearch BN = new BinarySearch(t,0,t.length-1);
			 BN.start();
			 try {
				BN.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 for (int i = 0; i <t.length; i++) {
			 System.out.print(t[i] + " ; ");
			 }
			 System.out.println();
			 }
			
	}
