package punkty;

public class Trojkatrown extends Trojkat {
	
	public Trojkatrown (Punkt a, Punkt b) {
		super(a,b);
		float x,y;
		double  dx,dy;
		
		dx= Math.cos(Math.PI/3) * (b.getX()-a.getX()) - Math.sin(Math.PI/3) * (b.getY()-a.getY()) + a.getX();
		dy= Math.sin(Math.PI/3) * (b.getX()-a.getX()) + Math.cos(Math.PI/3) * (b.getY()-a.getY()) + a.getY();
		
		x = (float) dx;
		y = (float) dy;
		
		Punkt C = new Punkt(x,y);
		setC(C);
	}

}
