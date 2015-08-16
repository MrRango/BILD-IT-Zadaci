/*
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2p - 1 for some positive integer p. Write a program that finds
 * all Mersenne primes with p … 100 and displays the output as shown below.
 * (Hint: You have to use BigInteger to store the number, because it is too big to
 * be stored in long. Your program may take several hours to run.)
 * 
 * 	p 	2^p – 1
 * 
 * 	2 	   3
 * 	3 	   7
 * 	5 	   31
 */

package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {
			
		System.out.println("p	2^p-1\n");
		//petlja se vrti dok se ne nadju svi 'Mersenne prime' brojevi manji od 100
		for (int p = 0; p <= 100; p++) {
			//racunanje 2^p – 1 za p
			BigInteger broj = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
			//ako je broj 'Mersenne prime', stampa se
			if (broj.isProbablePrime(1)) {
				System.out.println(p + "	" + broj);
			}
		}

	}


}
