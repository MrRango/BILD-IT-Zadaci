/*
 * (Demonstrate the benefits of encapsulation) Rewrite the Rational class in
 * Listing 13.13 using a new internal representation for the numerator and denominator.
 * Create an array of two integers as follows: private long[] r = new long[2];
 * Use r[0] to represent the numerator and r[1] to represent the denominator.
 * The signatures of the methods in the Rational class are not changed, so a client
 * application that uses the previous Rational class can continue to use this new
 * Rational class without being recompiled.
 */

package zadaci_27_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		//pravljenje dva objekta tipa 'rational'
		Rational rational1 = new Rational(1, 3);
		Rational rational2 = new Rational(2, 3);
		//stampanje zbira dva objekta tipa 'rational'
		System.out.println("Rezultat sabiranja dva razlomka je: " + rational1.add(rational2));

	}

}
