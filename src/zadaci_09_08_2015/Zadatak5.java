/*
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as
 * a double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array.
 */

package zadaci_09_08_2015;

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
		Location lokacija = locateLargest(matrica);
		//stampanje rezultata
		System.out.println("Najveci element u matrici se nalazi na lokaciji " + lokacija.row + ", " + lokacija.column);
		

	}
	/*
	 * metoda koja trazi najveci element u matrici i vraca njegovu poziciju
	 */
	public static Location locateLargest(double[][] a){
		//pravljenje novog objekta
		Location location = new Location();
		
		int red = 0;
		int kolona = 0;
		double najveci = 0;
		//prolazak kroz matricu
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				//ako je elemenat na poziciji i,j veci od najveceg, on postaje najveci
				if (a[i][j] > najveci){
					najveci = a[i][j];
					//uzimanje lokacije najveceg elementa
					red = i;
					kolona = j;
				}
			}
		}
		//smijestanje dobijenih podataka u ovjekat
		location.row = red;
		location.column = kolona;
		
		return location;
	}


}
