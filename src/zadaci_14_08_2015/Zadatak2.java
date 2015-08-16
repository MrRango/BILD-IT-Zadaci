/*
 * (Square numbers) Find the first ten square numbers that are greater than
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your
 * program fast.
 */

package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak2 {
	
	public static void main(String[] args) {
		
		int i = 0;
				
		//racunanje korijena od najveceg long broja i zaokruzivanje rezultata na veci cijeli broj
		long longMaxKorijen = (long) Math.ceil(Math.sqrt(Long.MAX_VALUE));

		//BigInteger sa vrijednoscu korijena od najveceg long broja zaokruzenog na veci cijeli broj
		BigInteger broj = new BigInteger(longMaxKorijen + "");
		BigInteger brojNaKvadrat;
		
		System.out.println("10 'square' brojeva, vecih od najveceg long broja:");
		//petlja se vrti dok se ne odstampa prvih 10 'square' brojeva vecih od najveceg long broja
		while(i < 10){
			//kvadriranje broja
			brojNaKvadrat = broj.multiply(broj);
			//stampanje kvadrata broja
			System.out.println(brojNaKvadrat);
			//povecavanje broja za jedan
			broj = broj.add(BigInteger.ONE);
			i++;
		}

	}
}
