/*
 * (Convert decimals to fractions) Write a program that prompts the user to enter
 * a decimal number and displays the number in a fraction. Hint: read the decimal
 * number as a string, extract the integer part and fractional part from the string,
 * and use the BigInteger implementation of the Rational class in Programming
 * Exercise 13.15 to obtain a rational number for the decimal number.
 */

package zadaci_27_08_2015;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		//unos broja od strane korisnika
		System.out.println("Unesite decimalni broj: ");
		String broj = in.next();
		in.close();

		//podjela stringa na cijeli dio i decimalni dio
		String[] dioBroja = broj.split("\\.");

		//duzina decimalnog dijela
		int brojDecimala = dioBroja[1].length();

		//pretvaranje cijelog dijela u razlomak
		BigIntRational cijeliDio = new BigIntRational(new BigInteger(dioBroja[0]), BigInteger.ONE);
		
		//pretvaranje decimalnog dijela u razlomak
		BigIntRational decimalniDio = new BigIntRational(new BigInteger(dioBroja[1]), BigInteger.TEN.pow(brojDecimala));

		//sabiranje razlomaka za dobijanje rezultata u vidu razlomka
		BigIntRational rezultat = cijeliDio.add(decimalniDio);

		//stampanje rezultata
		System.out.println(rezultat);

	}

}
