package DIOsmartTV;

public class smartTV {
  boolean ligada=false ;
  
		  int canal=1 ;
		  public void mudarCanal(int novoCanal){
			  canal = novoCanal;  
		  }
		  
		  public void aumentarCanal(){
			  canal++;
		  }
		  public void diminuirCanal() {
			  canal--;
		  }
		  int volume=25 ;
		  
		  public void aumentarVolume() {
			  //volume = + 1;
			  System.out.println("Aumentando volume para :" + volume);
			  volume ++;
		  }
		  public void diminuirVolume() {
			  //volume = + 1;
			  System.out.println("Diminuindo volume para :" + volume);
			  volume --;
		  }
		  
		  public void ligar() {
			  ligada=true;
		  }
			  public void desligar () {
				  ligada=false;
			  }
		  }

