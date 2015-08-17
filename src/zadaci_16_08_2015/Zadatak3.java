/*
 * (Implement the Character class) The Character class is provided in the Java
 * library. Provide your own implementation for this class. Name the new class
 * MyCharacter.
 */

package zadaci_16_08_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		MyCharacter myCharacter = new MyCharacter('A');
		MyCharacter myCharacter2 = new MyCharacter('a');
		System.out.println(MyCharacter.toInt('7'));
		System.out.println(myCharacter.toLowerCase().toString());
		System.out.println(myCharacter2.toUpperCase().toString());
	}

}
