package DIOsmartTV;

public class Usuario {

	public static void main(String[] args) throws Exception {
		smartTV smartTV = new smartTV();
		
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.aumentarVolume();
		smartTV.mudarCanal(52);
		
		System.out.println("Canal atual:" + smartTV.canal);
		System.out.println("VOlume Atual :" + smartTV.volume);		

		
		System.out.println ("TV Ligada? " + smartTV.ligada);
		System.out.println("Canal Atual? " +smartTV.canal);
		System.out.println("Volume Atual? " + smartTV.volume);

		
		smartTV.ligar ();
		System.out.println("NOVO STATUS -> TV Ligada? " + smartTV.ligada);
		
		smartTV.desligar ();
		System.out.println("NOVO STATUS -> TV Ligada? " + smartTV.ligada);
		
		
	}

}
