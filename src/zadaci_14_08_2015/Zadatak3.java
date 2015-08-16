/*
 * (Large prime numbers) Write a program that finds five prime numbers larger
 * than Long.MAX_VALUE.
 */

package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int i = 0;
		//dodjeljivenje varijabli broj najveci long broj uvecan za 1
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		//petlja se vrti dok se ne odstampa 5 prostih brojeva vecih od najveceg long broja
		while (i < 5) {
			//testiranje da li je broj prost koristenjem metode isProbablePrime
			if(broj.isProbablePrime(1)) {
				//stampanje broja
				System.out.println(broj);
				//povecanje brojaca odstampanih brojeva
				i++;
			}
			//uvecanje broja za 1
			broj = broj.add(BigInteger.ONE);
		}

	}

}
