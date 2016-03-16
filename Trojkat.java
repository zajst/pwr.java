package punkty;

public class Trojkat {
	private Punkt[] punkty = new Punkt[3];
	
	public Trojkat () {}
	
	public Trojkat (Punkt a, Punkt b) {
		punkty[0]=a;
		punkty[1]=b;
		punkty[2]= new Punkt(0,0);
	}
	
	public Trojkat (Punkt a, Punkt b, Punkt c) {
		punkty[0]=a;
		punkty[1]=b;
		punkty[2]=c;
	}
	
	public float obliczObwod () {
		double dlugosc=0;
		double obwod=0;
		float zwraca;
		
		dlugosc = Math.sqrt((punkty[0].getX() - punkty[1].getX())*(punkty[0].getX() - punkty[1].getX()) + (punkty[0].getY() - punkty[1].getY())*(punkty[0].getY() - punkty[1].getY()));
		obwod += dlugosc;
		dlugosc = Math.sqrt((punkty[1].getX() - punkty[2].getX())*(punkty[1].getX() - punkty[2].getX()) + (punkty[1].getY() - punkty[2].getY())*(punkty[1].getY() - punkty[2].getY()));
		obwod += dlugosc;
		dlugosc = Math.sqrt((punkty[2].getX() - punkty[0].getX())*(punkty[2].getX() - punkty[0].getX()) + (punkty[2].getY() - punkty[0].getY())*(punkty[2].getY() - punkty[0].getY()));
		obwod += dlugosc;
		
		zwraca = (float) obwod;
		
		return zwraca;
	}
	
	public float obliczPole () {
		double odcinekAB, odcinekBC, odcinekCA;
		double pole;
		float zwraca;
		
		odcinekAB = Math.sqrt((punkty[0].getX() - punkty[1].getX())*(punkty[0].getX() - punkty[1].getX()) + (punkty[0].getY() - punkty[1].getY())*(punkty[0].getY() - punkty[1].getY()));
		odcinekBC = Math.sqrt((punkty[1].getX() - punkty[2].getX())*(punkty[1].getX() - punkty[2].getX()) + (punkty[1].getY() - punkty[2].getY())*(punkty[1].getY() - punkty[2].getY()));
		odcinekCA = Math.sqrt((punkty[2].getX() - punkty[0].getX())*(punkty[2].getX() - punkty[0].getX()) + (punkty[2].getY() - punkty[0].getY())*(punkty[2].getY() - punkty[0].getY()));
		
		pole = Math.sqrt((odcinekAB + odcinekBC + odcinekCA)*(odcinekAB - odcinekBC + odcinekCA)*(odcinekAB + odcinekBC - odcinekCA)*(odcinekCA + odcinekBC - odcinekAB))/4;
		
		zwraca = (float) pole;
		
		return zwraca;
		
	}
	
	public void setA (Punkt C) {
		punkty[0]=C;
	}
	
	public void setB (Punkt C) {
		punkty[1]=C;
	}
	
	public void setC (Punkt C) {
		punkty[2]=C;
	}
	
	public Punkt getA () {
		return punkty[0];
	}
	
	public Punkt getB () {
		return punkty[1];
	}
	
	public Punkt getC () {
		return punkty[2];
	}
	
}
