package zadaci_26_08_2015;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

	private double side;
	
	//no-arg konstruktor
	public Octagon() {
		// TODO Auto-generated constructor stub
	}
	//konstruktor sa argumentom
	Octagon(double side){
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	/*
	 * metoda za poredjenje dva oktagona poredjenjem njihovih povrsina
	 */
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	/*
	 * metoda za racunanje povrsine
	 */
	public double getArea() {

		double povrsina = (2 + 4/22)* side * side;
		
		return povrsina;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * metoda za kloniranje oktagona
	 */
	public Octagon clone() throws CloneNotSupportedException{
		return (Octagon) super.clone();
	}
}
