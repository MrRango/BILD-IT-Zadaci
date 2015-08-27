/*
 * (Sum the areas of geometric objects) Write a method that sums the areas of all the
 * geometric objects in an array. The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 */

package zadaci_26_08_2015;

public class Zadatak4 {

	public static void main(String[] args) {
		//niz za smijestanje 4 geometrijska objekta
		GeometricObject[] niz = new GeometricObject[4]; 
		//pravljenje 4 geometrijska objekta i njihovo smijestanje u niz
		niz[0] = new Circle(2);
		niz[1] = new Circle(3);
		niz[2] = new Rectangle(2, 2);
		niz[3] = new Rectangle(3, 3);
		//pozivanje metode i stampanje rezultata 
		System.out.println(sumArea(niz));

	}
	/*
	 * metoda za sabiranje povrsina geometrijskih objekata u nizu
	 */
	public static double sumArea(GeometricObject[] a){
		double suma = 0;
		//prolazak kroz niz
		for(int i = 0; i < a.length; i++){
			//dodavanje na sumu povrsina svih elemenata niza
			suma += a[i].getArea();
		}
		
		return suma;
	}

}
