package zadaci_25_08_2015;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

	//konstruktor koji pozivanjem konstuktora super klase pravi objekat tipa Circle
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	@Override
	/*
	 * metoda za poredjenje objekata koristeci njihovu povrsinu
	 * vraca pozitivnu vrijednost ako je prvi objekat veci
	 * vraca negativnu vrijednost ako je drugi objekat veci
	 * vraca nulu ako su objekti isti
	 */
	public int compareTo(ComparableCircle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	

}
