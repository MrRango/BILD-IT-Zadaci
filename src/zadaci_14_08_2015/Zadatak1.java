/*
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
 * divisible by 2 or 3.
 */

package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak1 {

	public static void main(String[] args) {
		int i = 0;
		
		//BigInteger vrijednosti 10 oktiliona 
		BigInteger broj = new BigInteger("10000000000000000000000000000000000000000000000000");
		
		System.out.println("Najmanji pedesetocifreni brojevi dijeljivi sa 2 i 3:");
		//trazenje 10 brojeva od 50 cifri djeljivih sa 2 i 3
		while(i < 10){
			//ako su ostaci dijeljenja broja sa 2 i 3 jednaki 0, broj je dijeljiv sa 2 i 3
			if (broj.remainder(new BigInteger("2")) == BigInteger.ZERO && broj.remainder(new BigInteger("3")) == BigInteger.ZERO) {
				//stampanje broja
				System.out.println(broj);	
				i++;
			}
			//broj za provjeru povecava se za 1
			broj = broj.add(BigInteger.ONE);
		}
	}

}
