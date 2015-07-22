/*
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi unijeti) 
 * te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
 */

package zadaci_22_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//trazi se od korisnika da odredi velicinu matrice
		System.out.println("Unesite 'n' za matricu 'n x n'");
		int duzina = in.nextInt();
		double[][] matrica = new double[duzina][duzina];
		//unosenje vrijednosti u matricu
		System.out.println("Unosite clanove matrice");
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				matrica[i][j] = in.nextDouble();
			}
		}
		in.close();
		//pozivanje metode
		matrica = sortRows(matrica);
		//stampanje rezultata
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica.length; j++){
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
	/*
	 * metoda za sortiranje redova matrice
	 */
	public static double[ ][ ] sortRows(double[ ][ ] array){
		ArrayList<Double>row = new ArrayList<>();
		double[][]matrica = new double[array.length][array.length];
		//ovdje se desava magija :)
		for(int i = 0; i < array.length; i++){ 			//prolazimo kroz redove
			for(int j = 0; j < array.length; j++){		//prolazimo kroz kolone
				row.add(array[i][j]);					//clanove jednog reda dodajemo u listu
			}
			Collections.sort(row);						//dobijenu listu sortiramo
			//elemente iz liste upisujemo u matricu
			for(int j = 0; j < array.length; j++){		
				matrica[i][j] = row.get(j);
			}
			//brisemo listu, jer za sledeci red treba da bude prazna
			row.clear();
		}
		return matrica;
	}
}