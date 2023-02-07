package BInarySearch_V2;

import java.util.concurrent.CountDownLatch;

public class BinarySearch extends Thread{
	
	private int[] t;
	private int debut,fin;
	static CountDownLatch count= new CountDownLatch(2);
	
	public BinarySearch(int[] t, int debut, int fin) {
		this.t = t;
		this.debut =debut;
		this.fin = fin;
	}
	/*public BinarySearch(int[] tab) {
		this(tab,0,tab.length-1);
	}*/
	
	public void run() {
		try {
			triFusion(debut, fin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 private void triFusion(int deb, int fin) throws InterruptedException
     {	int longueur=t.length;
		     if (longueur>0) {
	if (deb!=fin)
         {
         int milieu=(fin+deb)/2;
         BinarySearch T = new BinarySearch(t,deb,milieu);
         BinarySearch t2 = new BinarySearch(t,milieu+1,fin);
         T.start();
         t2.start();
         Fusion(deb,fin);
         T.count.await();
         T.count.await();
         }
	try {
		BinarySearch.count.countDown();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		     }
     }

	
		 public void Fusion(int debut, int fin) {
			 
			 // tableau où va aller la fusion
			 int[] tFusion = new int[fin - debut + 1];
			 int milieu = (debut + fin) / 2;
			 // Indices des éléments à comparer
			 int i1 = debut, 
			 i2 = milieu + 1;
			 // indice de la prochaine case du tableau tFusion à remplir
			 int iFusion = 0;
			 while (i1 <= milieu && i2 <= fin) {
			 if (t[i1] < t[i2]) {
			 tFusion[iFusion++] = t[i1++];
			 }
			 else {
			 tFusion[iFusion++] = t[i2++]; 
			 }
			 }
			 if (i1 > milieu) {
			 // la 1ère tranche est épuisée
			 for (int i = i2; i <= fin; ) {
			 tFusion[iFusion++] = t[i++];
			 }
			 }
			 else {
			 // la 2ème tranche est épuisée
			 for (int i = i1; i <= milieu; ) {
			 tFusion[iFusion++] = t[i++];
			 }
			 }
			 // Copie tFusion dans t
			 for (int i = 0, j = debut; i <= fin - debut; ) {
			 t[j++] = tFusion[i++];
			 }
			 }}
