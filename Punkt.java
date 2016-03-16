package punkty;

public class Punkt {
	private float x, y;
	
	public Punkt (float wspX, float wspY) {
		x=wspX;
		y=wspY;
	}
	
	public float getX () {
		return x;
	}
	
	public float getY () {
		return y;
	}
	
	public void setXY (float wspX, float wspY) {
		x=wspX;
		y=wspY;
	}
}
