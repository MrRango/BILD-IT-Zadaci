/*
 * Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki djelilac za ta dva broja.
 */

package zadaci_20_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int najveciDjelilac = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja ");
		int brJedan = in.nextInt();
		int brDva = in.nextInt();
		in.close();
		//petlja se vrti od 1 pa do manjeg od unesenih brojeva
		for(int i = 1; i <= brJedan && i <= brDva; i++){
			//ako su oba unesena broja djeljiva sa trenutnim brojacem, on postaje najveci djelilac
			if(brJedan % i == 0 && brDva % i == 0){
				najveciDjelilac = i;
			}
		}
		//stampanje rezultata
		System.out.println("Za unesene brojeve " + brJedan + " i " + brDva + " najveci djelilac je " + najveciDjelilac);
		
	}

}
