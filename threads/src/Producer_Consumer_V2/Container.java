package Producer_Consumer_V2;

public class Container {
  private int Contenu;
  private boolean D= false;
    
  public synchronized int prendre() {
	  while(D==true) {
		  try{
			  wait();
			  }
		  catch(InterruptedException e) {}
		  }
	  D=true;
	  notify();
	  return Contenu;
	  }
  public synchronized void mettre(int valeur) {
	  while(D==false) {
		  try{
			  wait();
			  }
		  catch(InterruptedException e) {}
		  }
	  Contenu=valeur;
	  D=false;
	  notify();
	  }
  }