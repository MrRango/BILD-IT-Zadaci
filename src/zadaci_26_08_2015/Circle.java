package zadaci_26_08_2015;

public class Circle extends GeometricObject implements Comparable<Circle> {

	
	double radius;
	final static double PI = 3.1415;
	//no-arg konstruktor
	Circle(){
		
	}
	//konstruktor koji prima radius kao argument
	Circle(double radius){
		this.radius = radius;
	}

	/*
	 * metod koji racuna povrsinu kruga
	 */
	public double getArea(){
		
		double povrsina = PI * this.radius * this.radius; 
		
		return povrsina;
	}
	
	/*
	 * metoda koja poredi krugove poredjenjem njihovih radijusa
	 */
	@Override
	public int compareTo(Circle o) {
		if (this.radius > o.radius)
			return 1;
		else if (this.radius < o.radius)
			return -1;
		else
			return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
