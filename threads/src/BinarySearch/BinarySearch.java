package BinarySearch;

/**
* Tri d'un tableau d'entiers multi-thread.
* Version qui utilise join().
**/
public class BinarySearch extends Thread {
 private int[] t; // tableau � trier
 private int debut, fin; // tranche de ce tableau qu'il faut trier
 // CONSTRUCTEURS...
 public BinarySearch(int[] tab, int debut, int fin) {
		this.t = tab;
		this.debut =debut;
		this.fin = fin;
	}
public void run() {
 // A COMPLETER...
	Fusion(debut,fin);
 }
 /**
 * Fusionne 2 tranches d�j� tri�es du tableau t.
 * - 1�re tranche : de debut � milieu
 * - 2�me tranche : de milieu + 1 � fin
 * @param milieu indique le dernier indice de la 1�re tranche
 */
 public void Fusion(int debut, int fin) {
 // tableau o� va aller la fusion
 int[] tFusion = new int[fin - debut + 1];
 int milieu = (debut + fin) / 2;
 // Indices des �l�ments � comparer
 int i1 = debut, 
 i2 = milieu + 1;
 // indice de la prochaine case du tableau tFusion � remplir
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
 // la 1�re tranche est �puis�e
 for (int i = i2; i <= fin; ) {
 tFusion[iFusion++] = t[i++];
 }
 }
 else {
 // la 2�me tranche est �puis�e
 for (int i = i1; i <= milieu; ) {
 tFusion[iFusion++] = t[i++];
 }
 }
 // Copie tFusion dans t
 for (int i = 0, j = debut; i <= fin - debut; ) {
 t[j++] = tFusion[i++];
 }
 }}
