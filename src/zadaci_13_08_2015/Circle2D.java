/*
 * (Geometry: the Circle2D class) Define the Circle2D class that contains:
 * - Two double data fields named x and y that specify the center of the circle
 * with getter methods.
 * - A data field radius with a getter method.
 * - A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
 * - A constructor that creates a circle with the specified x, y, and radius.
 * - A method getArea() that returns the area of the circle.
 * - A method getPerimeter() that returns the perimeter of the circle.
 * - A method contains(double x, double y) that returns true if the
 * specified point (x, y) is inside this circle (see Figure 10.21a).
 * - A method contains(Circle2D circle) that returns true if the specified
 * circle is inside this circle (see Figure 10.21b).
 * - A method overlaps(Circle2D circle) that returns true if the specified
 * circle overlaps with this circle (see Figure 10.21c).
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
 * displays its area and perimeter, and displays the result of c1.contains(3,
 * 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
 * Circle2D(3, 5, 2.3)).
 */

package zadaci_13_08_2015;

public class Circle2D {

	private double x = 0;
	private double y = 0;
	private double radius = 0;
	final static double PI = 3.1415;
	
	//no-arg konstruktror
	Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	//konstruktor koji prima konktetne vrijednosti za x, y i radius
	Circle2D(double newX, double newY, double newRadius){
		this.x = newX;
		this.y = newY;
		this.radius = newRadius;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	
	/*
	 * metod koji racuna povrsinu kruga
	 */
	public double getArea(){
		
		double povrsina = PI * this.radius * this.radius; 
		
		return povrsina;
	}
	/*
	 * metoda koja racuna obim kruga
	 */
	public double getPerimeter(){
		
		double obim = 2 * PI * this.radius;
		
		return obim;
	}
	/*
	 * metoda koja testira da li se tacka nalazi unutar kruga
	 */
	public boolean contains(double x, double y){
		boolean contains = false;
		//odredjivanje koliko je tacka udaljena od centra kruga, pomocu pitagorine teoreme
		double udaljenost = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		//ako je radijus veci ili jednak udaljenosti tacke od centra kruga, tacka se nalazi u krugu
		if(this.radius >= udaljenost){
			contains = true;
		}
		return contains;
	}
	/*
	 * metoda koja testira da li se krug nalazi unutar kruga
	 */
	public boolean contains(Circle2D circle){
		boolean contains = false;
		
		//odredjivanje koliko je centar drugog kruga udaljena od centra prvog kruga, pomocu pitagorine teoreme
		double udaljenost = Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2));
		
		if(this.radius >= udaljenost + circle.radius){
			contains = true;
		}
		
		return contains;
	}
	/*
	 * metoda koja testira da li se dva kruga ukrstaju
	 */
	public boolean overlaps(Circle2D circle){
		boolean overlaps = false;
		
		//odredjivanje koliko je centar drugog kruga udaljena od centra prvog kruga, pomocu pitagorine teoreme
		double udaljenost = Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2));
		
		if(udaljenost < this.radius + circle.radius){
			overlaps = true;
		}
		return overlaps;
	}
}
