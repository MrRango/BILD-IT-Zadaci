package zadaci_25_08_2015;

public class Circle {
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
	
}
