/*
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 */

package zadaci_20_08_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		//unos broja tacaka poligona od strane korisnika
		System.out.println("Unesite broj tacaka: ");
		int brojTacaka = in.nextInt();
		//pravljenje matrice za koordinate
		double[][] koordinate = new double[brojTacaka][2];
		//unos koordinata tacaka od strane korisnika
		System.out.println("Unesite koordinate za tacke: ");
		for(int i = 0; i < brojTacaka; i++){
			koordinate[i][0] = in.nextDouble();
			koordinate[i][1] = in.nextDouble();
		}
		in.close();
		
		/*
		 * racunanje povrsine poligona formulom:
		 * area = ((x1y2 + x2y3 + x3y4 + ... + xny1) - (y1x2 + y2x3 + y3x4 + ... + ynx1) / 2 	
		 * area = prviDio - drugiDio / 2
		 */
		
		//zadnje elemente izraza (xny1 i ynx1) dodajemo prve, ostale dodajemo kroz petlju
		double prviDio = koordinate[brojTacaka - 1][0] * koordinate[0][1];
		double drugiDio = koordinate[brojTacaka - 1][1] * koordinate[0][0];
		
		for(int i = 0; i < brojTacaka - 1; i++){
			prviDio += (koordinate[i][0] * koordinate[i + 1][1]);
			drugiDio += (koordinate[i][1] * koordinate[i + 1][0]);
		}
		
		double povrsina = Math.abs((prviDio - drugiDio) / 2.0);
		//stampanje rezultata
		System.out.println("Povrsina unesenog poligona je: " + povrsina);

	}

}
