/*
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */

package zadaci_23_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite tri broja");
		double brJedan = in.nextDouble();
		double brDva = in.nextDouble();
		double brTri = in.nextDouble();
		in.close();
		//pozivanje metode za sortiranje tri broja u rastucem redosljedu
		displaySortedNumbers(brJedan, brDva, brTri);

	}
	/*
	 * metoda za sortiranje tri broja u rastucem redosljedu
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3){
		
		double privremena;
		//ako je prvi broj veci od drugog, mijenjamo im mjesta
		if(num1 > num2){
			privremena = num1;
			num1 = num2;
			num2 = privremena;
		}
		//ako je treci broj manji od prvog, drugi postaje treci, prvi drugi, a treci prvi
		if(num3 < num1){
			privremena = num3;
			num3 = num2;
			num2 = num1;
			num1 = privremena;
		}
		//ako je treci broj manji od drugog, mijenjamo im mjesta
		if(num3 < num2){
			privremena = num2;
			num2 = num3;
			num3 = privremena;
		}
		//stampanje rezultata
		System.out.println("Unijeti brojevi, slozeni u rastucem redosljedu: " + num1 + ", " + num2 + ", " + num3);
		
	}
}
