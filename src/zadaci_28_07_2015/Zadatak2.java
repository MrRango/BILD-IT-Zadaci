/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 
 */

package zadaci_28_07_2015;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		//lista za smijestanje prostih brojeva
		ArrayList<Integer> prostiBrojevi = new ArrayList<>();
		int brojac = 0;
		//trazenje prostih brojeva i njihovo smijestanje u listu
		for(int i = 1; i <= 10000; i++){
			for(int j = 2; j <= i; j++){
				//ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
				if(i % j == 0 && i != j){
					break;
				}
				if(i == j){
					prostiBrojevi.add(i);
				}
			}
		}
		//trazenje twin prime brojeva u listi prostih brojeva
		for(int i = 0; i < prostiBrojevi.size() - 1; i++){
			//ako je broj za 2 manji od sledeceg prostog broja, oni predstavljaju twin prime
			if(prostiBrojevi.get(i) + 2 == prostiBrojevi.get(i + 1)){
				//ako je odstampano deset parova, prelazi se u novi red
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				//stampanje parova
				System.out.print(prostiBrojevi.get(i) + " " + prostiBrojevi.get(i + 1) + "  ");
				//povecavanje brojaca odstampanih parova
				brojac++;
			}
			
		}
	}
}
