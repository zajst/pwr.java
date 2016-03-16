package punkty;

public class Odcinek {
	private Punkt p1, p2;
	
	public Odcinek (Punkt pkt1, Punkt pkt2) {
		p1=pkt1;
		p2=pkt2;
	}
	
	public float policzDlugosc () {
		double dlugosc;
		float zwraca;
		dlugosc = Math.sqrt((p1.getX() - p2.getX())*(p1.getX() - p2.getX()) + (p1.getY() - p2.getY())*(p1.getY() - p2.getY()));
		
		zwraca = (float) dlugosc;
		return zwraca;
	}
	
	public Punkt getPunkt1() {
		return p1;
	}
	
	public Punkt getPunkt2() {
		return p2;
	}

}
