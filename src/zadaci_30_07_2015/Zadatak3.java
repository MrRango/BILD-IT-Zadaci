/*
 * Napisati metodu sa sljedeæim headerom: public static boolean isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */

package zadaci_30_07_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac = 0; 
		//petlja od 0 do 100000
		for(int i = 0; i <= 100000; i++){
			//testira se da li je broj prost, pozivanjem metode
			if(isPrime(i)){
				//prelazak u novi red ako je vec odstampano deset brojeva
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				//stampanje prostog broja
				System.out.print(i + " ");
				//povecavanje brojaca prostih brojeva
				brojac++;
			}
		}

	}
	/*
	 * metoda za ispitivanje da li je broj prost
	 */
	public static boolean isPrime(int n){
		boolean isPrime = true;
		//da bi broj bio prost mora biti veci od jedan
		if(n < 2){
			isPrime = false;
		}else{
			//ako je broj djeliv sa bilo kojim brojem osim jedinicom i samim sobom, on nije prost
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
