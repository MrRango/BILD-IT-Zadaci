package zadaci_26_08_2015;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

	private double a;
	private double b;
	
	//no-arg konstruktor
	Rectangle(){
		
	}
	//konstruktror sa argumentima
	Rectangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	/*
	 * metoda koja poredi dva pravougaonika poredjenjem njihovih povrsina
	 */
	public int compareTo(Rectangle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public double getArea() {

		double povrsina = this.a * this.b;
		
		return povrsina;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
