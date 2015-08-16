/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 */

package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int i = 0;
		
		//dodjeljivenje varijabli broj najveci long broj uvecan za 1
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		
		System.out.println("Prvi 10 brojeva vecih od najveceg long broja koji su djeljivi sa 5 ili 6:");
		//trazenje 10 brojeva vecih od najveceg long broja koji su djeljivi sa 5 ili 6
		while(i < 10){
			//ako su ostaci dijeljenja broja sa 5 ili 6 jednaki 0, broj je djeljiv sa 5 ili 6
			if (broj.remainder(new BigInteger("5")) == BigInteger.ZERO || broj.remainder(new BigInteger("6")) == BigInteger.ZERO) {
				//stampanje broja
				System.out.println(broj);	
				i++;
			}
			//broj za provjeru povecava se za 1
			broj = broj.add(BigInteger.ONE);
		}
		
	}

}
