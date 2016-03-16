package punkty;

public class Main {

	public static void main(String[] args) {
/*		Punkt p1,p2;
		p1= new Punkt(0,0);
		p2= new Punkt(0,2);
		Trojkatrown trojkat;
		trojkat = new Trojkatrown(p1,p2);
		
		System.out.println(trojkat.obliczObwod());*/
		
		Punkt a,b,c,d;
		d= new Punkt(0,0);
		c= new Punkt(0,2);
		b= new Punkt(2,2);
		a= new Punkt(2,5);
		
		Odcinek o0,o1,o2,o3;
		o0= new Odcinek(d,a);
		o1= new Odcinek(a,b);
		o2= new Odcinek(b,c);
		o3= new Odcinek(c,d);
		
		Odcinek[] tablica= new Odcinek[4];
		tablica[0]=o0;
		tablica[1]=o1;
		tablica[2]=o2;
		tablica[3]=o3;
		
		Kwadrat kw = new Kwadrat(tablica);
		System.out.println(kw.sprawdzCzyKwadrat());
		
		System.out.println(o0.policzDlugosc());
		System.out.println(o1.policzDlugosc());
		System.out.println(o2.policzDlugosc());
		System.out.println(o3.policzDlugosc());
		
		System.out.println(kw.policzPole());
		
		
	}

}
