package punkty;

public class Kwadrat extends Figura {

	public Kwadrat(Odcinek[] wejscie) {
		super(wejscie);
	}
	
	public float policzPole() {
		if (sprawdzCzyKwadrat()==true) {
			return (getOdcinek(0).policzDlugosc() * getOdcinek(0).policzDlugosc());
		}
		else
			return 0;
	}
	
	public float policzObwod() {
		if (sprawdzCzyKwadrat()==true) {
			return (4 * getOdcinek(0).policzDlugosc());
		}
		else
			return 0;
	}
	
	
	public boolean sprawdzCzyKwadrat () {
		if (getLength() != 4)
			return false;
		
		if ( sprawdzCzyWielobok() == false )
			return false;
		
		float dlugosc = getOdcinek(0).policzDlugosc();
		
		for (int i=1; i<4; i++) {
			if ( getOdcinek(i).policzDlugosc() != dlugosc) 
				return false;
		}
		
		for (int i=1; i<4; i++) {
			float f = (getOdcinek(i).getPunkt2().getX() - getOdcinek(i).getPunkt1().getX())*(getOdcinek(i-1).getPunkt2().getX() - getOdcinek(i-1).getPunkt1().getX())+(getOdcinek(i).getPunkt2().getY() - getOdcinek(i).getPunkt1().getY())*(getOdcinek(i-1).getPunkt2().getY() - getOdcinek(i-1).getPunkt1().getY());
			System.out.println(f);
			if (f!=0)
				return false;
		}
		
		return true;
	}

}
