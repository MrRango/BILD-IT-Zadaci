package zadaci_26_08_2015;

public abstract class GeometricObject{
	
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
	
}
