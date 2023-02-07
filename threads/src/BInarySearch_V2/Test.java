package BInarySearch_V2;

public abstract class Test {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[]= {1,4,5,8,6,5,6,7,2,7,15,20,25,12};
       BinarySearch BN= new BinarySearch( tab,0,tab.length-1);
       BN.start();
       
       for(int i=0;i<tab.length;i++)
       System.out.println(tab[i]);
	}

}
