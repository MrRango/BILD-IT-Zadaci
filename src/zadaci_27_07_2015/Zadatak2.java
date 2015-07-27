/*
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke. 
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije ta�ke na povr�ini zemlje te mu ispisuje great circle distance. 
 * Prosje�ni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse koriste�i se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * �irina i du�ina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne vrijednosti da ozna�imo istok i jug. 
 */

package zadaci_27_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//matrica za smijestanje tacaka
		double[][] tacke = new double [2][2];
		//radius Zemlje
		final double RADIUS = 6371.01;
		
		Scanner in = new Scanner(System.in);
		//uzimanje podataka od korisnika
		System.out.println("Unesite geografsku sirinu i geografsku duzinu za prvu tacku");
		tacke[0][0] = Math.toRadians(in.nextDouble());
		tacke[0][1] = Math.toRadians(in.nextDouble());
		System.out.println("Unesite geografsku sirinu i geografsku duzinu za drugu tacku");
		tacke[1][0] = Math.toRadians(in.nextDouble());
		tacke[1][1] = Math.toRadians(in.nextDouble());
		in.close();
		//formula za izracunavanje
		double greatCircleDistance = RADIUS * Math.acos(Math.sin(tacke[0][0]) * Math.sin(tacke[1][0]) 
				+ Math.cos(tacke[0][0]) * Math.cos(tacke[1][0]) * Math.cos(tacke[0][1] - tacke[1][1]));
		//stampanje rezultata
		System.out.println("Great circle distance za unesene kordinate je: " + greatCircleDistance);
	}

}
