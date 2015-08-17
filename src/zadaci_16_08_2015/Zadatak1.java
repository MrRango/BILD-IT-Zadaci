/*
 * (Implement the String class) The String class is provided in the Java library.
 * Provide your own implementation for the following methods (name the new
 * class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase();
 * public boolean equals(MyString1 s);
 * public static MyString1 valueOf(int i);
 */

package zadaci_16_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//pravljenje objekata MyString1 i ispitivanje metoda
		char[] chars = {'G', 'o', 'r', 'a', 'n',' ', 'A', 'r', 's', 'e', 'n', 'i', 'c'};
		char[] chars2 = {'2', '9', '0', '7'};
		MyString1 myString = new MyString1(chars);
		MyString1 myString2 = new MyString1(chars);
		MyString1 myString3 = new MyString1(chars2);
		System.out.println("Karakter na indeksu 3 je: " + myString.charAt(3));
		System.out.println("Duzina niza karaktera je: " + myString.length());
		System.out.println("Izmedju 6 indeksa i 10 indeksa karakteri su: " + myString.substring(6, 10).toString());
		System.out.println("Niz ispisan malim slovima: " + myString.toLowerCase().toString());
		System.out.println("Dva su niza ista? " + myString.equals(myString2));
		System.out.println("Dva su niza ista? " + myString.equals(myString3));
		System.out.println("Karakteri niza formiraju broj: " + MyString1.valueOf(4584).toString());
	}

}
