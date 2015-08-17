/*
 * (Implement the StringBuilder class) The StringBuilder class is provided
 * in the Java library. Provide your own implementation for the following methods
 * (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);
 * public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 */

package zadaci_16_08_2015;

public class Zadatak5 {

	public static void main(String[] args) {
		
		MyStringBuilder1 myString = new MyStringBuilder1("Goran");
		MyStringBuilder1 myString2 = new MyStringBuilder1("Arsenic");
		System.out.println(myString.append(myString2).toString());
		System.out.println(myString.append(88).toString());
		System.out.println(myString.length());
		System.out.println(myString.charAt(5));
		System.out.println(myString.toLowerCase().toString());
		System.out.println(myString.substring(5, 11).toString());
	}

}
