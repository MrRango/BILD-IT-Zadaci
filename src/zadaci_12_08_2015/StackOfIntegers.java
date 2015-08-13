/*
 * Clasa sadrzi metode za Zadatak4 i Zadatak5
 */

package zadaci_12_08_2015;

import java.util.ArrayList;

public class StackOfIntegers {
	
	private int broj = 0;
	
	StackOfIntegers(int newBroj){
		this.broj = newBroj;
	}
	
	/*
	 * metoda koja vraca prime faktore unesenog broja
	 */
	public ArrayList<Integer> getPrimeFactors(){
		
		ArrayList<Integer> primeFactors = new ArrayList<>();
		int brojac = 0;
		int br = broj;
		//ispitujemo da li je broj djeljiv sa bilo kojim brojem manjim od sebe 
		for(int i = 2; i < br; i++){
			//dok god je broj djeljiv sa trenutnom vrijednoscu 'i', dijelimo ga i stampamo vrijednost 'i'
			while(broj % i == 0){ 		
				broj = broj / i;
				primeFactors.add(i);	
				//brojimo koliko broj ima najmanjih faktora
				brojac++;
			}
		}
		//ako broj nema manjih faktora, broj je prost i on se ne moze podijeliti na manje faktore
		if(brojac == 0){
			System.out.println("Unijeti broj je prost i on se ne moze podijeliti na manje faktore");
		}
		return primeFactors;
	}
	/*
	 * metoda koja vraca proste brojeve koji su manji od unesenog broja
	 */
	
	public ArrayList<Integer> getPrimeNumbes(){
		ArrayList<Integer> primeNumbes = new ArrayList<>();
		//svi prosti brojevi manji od unesenog broja se dodaju u listu
		for(int i = 0; i < broj; i++){
			//ispitivanje da li je broj prost pozivanje metode
			if(isPrime(i)){
				primeNumbes.add(i);
			}
		}
		return primeNumbes;
	}
	
	/*
	 * metoda za ispitivanje da li je broj prost
	 */
	public static boolean isPrime(int a){
		boolean isPrime = false;
		for(int i = 2; i <= a; i++){
			//ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
			if(a % i == 0 && a != i){
				break;
			}
			if(a == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}

}
