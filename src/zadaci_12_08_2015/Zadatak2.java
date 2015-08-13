/*
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * - An int data field named value that stores the int value represented by this object.
 * - A constructor that creates a MyInteger object for the specified int value.
 * - A getter method that returns the int value.
 * - The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * - The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * - The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * - The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * - A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * - A static method parseInt(String) that converts a string into an int value.
 * Draw the UML diagram for the class and then implement the class. Write a client
 * program that tests all methods in the class.
 */

package zadaci_12_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite cijeli broj");
		int broj = in.nextInt();
		
		//pravljenje novog objekta integer sa vrijednosti koju je unio korisnik
		MyInteger integer = new MyInteger(broj);
		//pozivanje svih metoda i ispisivanje rezultata
		System.out.println("Broj " + broj + " je paran: " + integer.isEven());
		System.out.println("Broj " + broj + " je neparan: " + integer.isOdd());
		System.out.println("Broj " + broj + " je prost : " + integer.isPrime());
		System.out.println();
		System.out.println("Broj je paran: " + MyInteger.isEven(integer));
		System.out.println("Broj je neparan: " + MyInteger.isOdd(integer));
		System.out.println("Broj je prost : " + MyInteger.isPrime(integer));
		System.out.println();
		System.out.println("Broj je paran: " + MyInteger.isEven(7));
		System.out.println("Broj je neparan: " + MyInteger.isOdd(7));
		System.out.println("Broj je prost : " + MyInteger.isPrime(7));
		System.out.println();
		
		//unos broja od strane korisnika
		System.out.println("Unesite cijeli broj");
		int broj1 = in.nextInt();
		in.close();
		
		System.out.println("Uneseni broj je jednak vrijednosti 'value': " + integer.equals(broj1));
		System.out.println("Vrijednost 'value' je jednaka vrijednosti 'value' objekta integer: " + integer.equals(integer));
		System.out.println();
		char[] brojevi = {'5', '5', '3', '2'};
		System.out.println(MyInteger.parseInt(brojevi));
		System.out.println();
		String brojevi2 = "5532";
		System.out.println(MyInteger.parseInt(brojevi2));
	}

}
