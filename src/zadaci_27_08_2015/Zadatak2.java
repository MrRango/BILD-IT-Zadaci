/*
 * (Use BigInteger for the Rational class) Redesign and implement the
 * Rational class in Listing 13.13 using BigInteger for the numerator and
 * denominator.
 */

package zadaci_27_08_2015;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		
		//pravljenje dva objekta tipa 'BigIntRational'
		BigIntRational rational1 = new BigIntRational(BigInteger.ONE, new BigInteger("3"));
		BigIntRational rational2 = new BigIntRational(new BigInteger("2"), new BigInteger("3"));
		//stampanje zbira dva objekta tipa 'BigIntRational'
		System.out.println("Rezultat sabiranja dva razlomka je: " + rational1.add(rational2));

	}

}
