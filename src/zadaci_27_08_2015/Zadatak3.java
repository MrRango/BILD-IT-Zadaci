/*
 * (Create a rational-number calculator) Write a program similar to Listing 7.9,
 * Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a.
 * You will need to use the split method in the String class, introduced in
 * Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string and
 * denominator string, and convert strings into integers using the Integer.parseInt method.
 */

package zadaci_27_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos razlomaka od strane korisnika
		System.out.println("Unesite prvi razlomak");
		String unos1 = in.next();
		System.out.println("Unesite drugi razlomak");
		String unos2 = in.next();
		//unos znaka operacije od strane korisnika
		System.out.println("Unesite operaciju");
		char operacija = in.next().charAt(0);
		in.close();
		//splitanje unosa
		String[] razlomak1 = unos1.split("/");
		String[] razlomak2 = unos2.split("/");
		//pravljenje objekata tipa 'rational'
		Rational rational1 = new Rational(Integer.parseInt(razlomak1[0]), Integer.parseInt(razlomak1[1]));
		Rational rational2 = new Rational(Integer.parseInt(razlomak2[0]), Integer.parseInt(razlomak2[1]));
		//u zavisnosti od unijetog znaka operacije poziva se odgovarajuci metod i stampa rezultat
		switch(operacija){
		case '+':{
			Rational rezultat = rational1.add(rational2);
			System.out.println(rezultat);
			break;
		}
		case '-':{
			Rational rezultat = rational1.subtract(rational2);
			System.out.println(rezultat);
			break;
		}
		case '*':{
			Rational rezultat = rational1.multiply(rational2);
			System.out.println(rezultat);
			break;
		}
		case '/':{
			Rational rezultat = rational1.divide(rational2);
			System.out.println(rezultat);
			break;
		}
		default:{
			System.out.println("Unijet je pograsan operand");
			break;
		}
		
		}
	}

}
