/*
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke. 
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom: d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na površini zemlje te mu ispisuje great circle distance. 
 * Prosjeèni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * Širina i dužina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznaèimo istok i jug. 
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
