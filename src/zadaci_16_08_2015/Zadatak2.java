/*
 * (Implement the String class) The String class is provided in the Java library.
 * Provide your own implementation for the following methods (name the new
 * class MyString2):
 * public MyString2(String s);
 * public int compare(String s);
 * public MyString2 substring(int begin);
 * public MyString2 toUpperCase();
 * public char[] toChars();
 * public static MyString2 valueOf(boolean b);
 */

package zadaci_16_08_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		
		MyString2 string = new MyString2("Goran Arsenic");
		System.out.println("Koji je string veci? " + string.compare("Goran Arsenic"));
		System.out.println("Dio stringa od unesenog indeksa: " + string.substring(6).toString());
		System.out.println("Pretvaranje u velika slova: " + string.toUpperCase().toString());
		System.out.println("Ispis boolean vrijednosti: " + MyString2.valueOf(true));

	}

}
