package zadaci_17_08_2015;

public class Circle {
	double radius;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius = radius;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Radius kruga: " + this.radius;
	}
}
