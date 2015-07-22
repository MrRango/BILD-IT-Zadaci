/*
 *  Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:
 *  public static double min(double[ ] array)
 *  Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu 
 */

package zadaci_22_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		double[] array = new double[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite deset brojeva ");
		//unosenje brojeva u niz
		for(int i = 0; i < 10; i++){
			array[i] = in.nextDouble();
		}
		in.close();
		System.out.println("Najmanji broj u nizu je: " + min(array));
	}
	/*
	 * metoda za pronalazenje najmanjeg clana u nizu
	 */
	public static double min(double[] array){
		//na pocetku se predpostavlja da je prvi clan u nizu najmanji
		double min = array[0];
		//petljom se pregledaju svi clanovi niza
		for(int i = 1; i < 10; i++){
			//ako je trenutni clan manji od do sada najmanjeg, on postaje najmanji 
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
}
