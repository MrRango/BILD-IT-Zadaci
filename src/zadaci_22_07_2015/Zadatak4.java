/*
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:
 * public static int[ ] locateLargest(double[ ][ ] a)
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */

package zadaci_22_07_2015;

import java.util.Scanner;

public class Zadatak4 {

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
		int[] rez = locateLargest(matrica);
		//stampanje rezultata
		System.out.println("Najvecei element u unijetom 2D nizu se nalazi na poziciji " + rez[0] + "," + rez[1]);
	}
	/*
	 * metoda za odredjivanje pozicije najveceg elementa u matrici
	 */
	public static int[ ] locateLargest(double[ ][ ] a){
		int[] largest = new int[2];
		double largestElement = a[0][0];
		//trazenje najveceg elementa sa dvije petlje
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				//ako je trenutni element veci od prethodnog najveceg elementa, on postaje najveci
				if(a[i][j] > largestElement){
					largestElement = a[i][j];
					//cuvanje pozicije trenutno najveceg elementa
					largest[0] = i;
					largest[1] = j;
				}
			}
		}
		return largest;
	}

}
