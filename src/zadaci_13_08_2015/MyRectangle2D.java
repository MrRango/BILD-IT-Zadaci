/*
 * (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that contains:
 * - Two double data fields named x and y that specify the center of the rectangle
 * with getter and setter methods. (Assume that the rectangle sides are
 * parallel to x- or y- axes.)
 * - The data fields width and height with getter and setter methods.
 * - A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
 * 1 for both width and height.
 * - A constructor that creates a rectangle with the specified x, y, width, and height.
 * - A method getArea() that returns the area of the rectangle.
 * - A method getPerimeter() that returns the perimeter of the rectangle.
 * - A method contains(double x, double y) that returns true if the
 * specified point (x, y) is inside this rectangle (see Figure 10.24a).
 * - A method contains(MyRectangle2D r) that returns true if the specified
 * rectangle is inside this rectangle (see Figure 10.24b).
 * - A method overlaps(MyRectangle2D r) that returns true if the specified
 * rectangle overlaps with this rectangle (see Figure 10.24c).
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
 * 2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
 * r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5,
 * 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 */

package zadaci_13_08_2015;

import java.awt.geom.Line2D;


public class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;
	
	//no-arg konstruktor
	MyRectangle2D(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	//konstruktor koji kreira pravougaonik sa konkretnim vrijednostima
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/*
	 * metod koji racuna povrsinu pravougaonika
	 */
	public double getArea(){
		
		double povrsina = this.height * this.width;
		
		return povrsina;
	}
	/*
	 * metod koji racuna obim pravougaonika
	 */
	public double getPerimeter(){
		
		double obim = 2 * (this.height + this.width);
		
		return obim;
	}
	/*
	 * metoda koja testira da li se tacka nalazi unutar pravougaonika
	 */
	public boolean contains(double x, double y){
		boolean contains = false;
		
		if(x > this.x && x < this.x + this.width && y > this.y && y < this.y + this.height){
			contains = true;
		}
		
		return contains;
	}
	/*
	 * metoda koja testira da li se pravougaonik nalazi unutar pravougaonika
	 */
	public boolean contains(MyRectangle2D r){
		boolean contains = false;
		//racunanje kolike su razlike izmedju x i y prvog i x i y drugog pravougaonika
		double razlikaX = r.getX() - this.x;
		double razlikaY = r.getY() - this.y;
		//da bi drugi pravougaonik bio u prvom, razlika mora biti pozitivna
		//pocetna tacka drugog pravougaonika mora biti u prvom pravougaoniku
		if(razlikaX > 0 && razlikaY > 0){
			//testiranje da li je dijagonalna tacka drugog pravougaonika u prvom pravougaoniku
			if(razlikaX + r.width < this.width && razlikaY + r.height < this.height){
				contains = true;
			}
		}
		return contains;
	}
	/*
	 * metoda koja testira da li se dva pravougaonika ukrstaju
	 */
	public boolean overlaps(MyRectangle2D r){
		boolean overlaps = false;
		//duzi prvog pravougaonika
		Line2D l1 = new Line2D.Double(this.getX(), this.getY(), this.getX() + this.getWidth(), this.getY());	//vodoravna
		Line2D l2 = new Line2D.Double(this.getX(), this.getY(), this.getX(), this.getY() + this.getHeight());	//uspravna
		Line2D l3 = new Line2D.Double(this.getX(), this.getY() + this.getHeight(), this.getX() + this.getWidth(),  this.getY() + this.getHeight());	//vodoravna
		Line2D l4 = new Line2D.Double(this.getX() + this.getWidth(), this.getY(), this.getX() + this.getWidth(),  this.getY() + this.getHeight()); //uspravna
		//duzi drugog pravougaonika
		Line2D rL1 = new Line2D.Double(r.getX(), r.getY(), r.getX() + r.getWidth(), r.getY());	//vodoravna
		Line2D rL2 = new Line2D.Double(r.getX(), r.getY(), r.getX(), r.getY() + r.getHeight());	//uspravna
		Line2D rL3 = new Line2D.Double(r.getX(), r.getY() + r.getHeight(), r.getX() + r.getWidth(), r.getY() + r.getHeight());	//vodoravna
		Line2D rL4 = new Line2D.Double(r.getX() + r.getWidth(), r.getY(), r.getX() + r.getWidth(), r.getY() + r.getHeight());	//uspravna
		//ispitivanje da li vodoravne duzi sijeku uspravne i obrnuto
		if(l1.intersectsLine(rL2) || l1.intersectsLine(rL4) || l2.intersectsLine(rL1) || l2.intersectsLine(rL3)
				|| l3.intersectsLine(rL2) || l3.intersectsLine(rL4) || l4.intersectsLine(rL1) || l4.intersectsLine(rL3)){
			overlaps = true;
		}
		
		return overlaps;
	}
	
}
