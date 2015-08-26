package zadaci_25_08_2015;

public class Square extends GeometricObject implements Colorable {

	double a = 0;

	// no-arg konstruktor
	Square() {

	}

	// konstruktor sa argumentom
	Square(double a) {
		this.a = a;
	}

	@Override
	//metoda za ispisivanje poruke 'how to color'
	public void howToColor() {
		System.out.println("Color all four sides");
	}
 
	@Override
	/*
	 * metoda za racunanje povrsine kvadrata
	 */
	public double getArea() {

		double povrsina = a * a;

		return povrsina;
	}

	@Override
	/*
	 * metoda za racunanje obima kvadrata
	 */
	public double getPerimeter() {
		
		double obim = 4 * a;
		
		return obim;
	}

}
