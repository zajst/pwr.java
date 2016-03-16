package punkty;

public class Figura {
	private Odcinek[] odcinek;
	public Figura (Odcinek[] wejscie) {
		odcinek = new Odcinek[wejscie.length];
		
		for (int i=0; i<wejscie.length; i++) {
			odcinek[i]=wejscie[i];
		}
	}
	
	public Odcinek getBok (int n) {
	return odcinek[n % odcinek.length];
	}
	
	public float policzObwod () {
		double dlugosc=0;
		float zwraca;
		
		for (int i=0; i<odcinek.length; i++) {
			dlugosc += odcinek[i].policzDlugosc();
		}
		
		zwraca = (float) dlugosc;
		return zwraca;
	}
	
	public boolean sprawdzCzyWielobok() {
		
		if (odcinek.length==1)
			return false;
		
		if ( (odcinek[odcinek.length-1].getPunkt2()).getX() != (odcinek[0].getPunkt1()).getX() || (odcinek[odcinek.length-1].getPunkt2()).getY() != (odcinek[0].getPunkt1()).getY() ) 
			return false;
		

		for (int i=0; i<odcinek.length-1; i++) {
			if ( (odcinek[i].getPunkt2()).getX() != (odcinek[i+1].getPunkt1()).getX() || (odcinek[i].getPunkt2()).getY() != (odcinek[i+1].getPunkt1()).getY() )
				return false;
		}
		
		return true;
	}
		
	public void zmienOdcinek (Odcinek[] wejscie) {
		odcinek = new Odcinek[wejscie.length];
		
		for (int i=0; i<wejscie.length; i++) {
			odcinek[i]=wejscie[i];
		}
	}
	
	public Odcinek getOdcinek(int i) {
		return odcinek[i];
	}
	
	public int getLength() {
		return odcinek.length;
	}
		
	
}
