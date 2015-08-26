package zadaci_25_08_2015;

public abstract class GeometricObject implements Comparable<GeometricObject>{
	
	private String color = "white";
	private boolean filled;
	
	//no-arg konstruktor
	protected GeometricObject(){
		
	}
	//konstruktor sa argumentima
	protected GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	//geteri i seteri
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//abstraktne metode koje ce biti implementirane u klasama koje ekstenduju ovu klasu
	public abstract double getArea();
	public abstract double getPerimeter();
	
	/*
	 * metoda za poredjenje objekata koristeci njihovu povrsinu
	 */
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	/*
	 * metoda koja pronalazi veci od dva objekta
	 */
	public static int max(GeometricObject o1, GeometricObject o2) {
		//ako metoda compareTo vrati 1, prvi objekat je veci
		if (o1.compareTo(o2) == 1)
			return 1;
		else
			return 2;
	}
}
