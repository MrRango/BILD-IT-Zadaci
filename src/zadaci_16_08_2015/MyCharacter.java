/*
 * (Implement the Character class) The Character class is provided in the Java
 * library. Provide your own implementation for this class. Name the new class
 * MyCharacter.
 */

package zadaci_16_08_2015;

public class MyCharacter {

	char ch;
	
	//konstruktor koji prima karakter
	public MyCharacter(char ch) {
		this.ch = ch;
	}
	/*
	 * metoda za pretvaranje numerickog znaka u int
	 */
	public static int toInt(char ch){
		return Integer.parseInt(ch + "");
	}
	/*
	 * metoda za pretvaranje znaka u malo slovo
	 */
	public MyCharacter toLowerCase(){
		String s = this.ch + "";
		char ch = s.toLowerCase().charAt(0);
		return new MyCharacter(ch);
	}
	/*
	 * metoda za pretvaranje znaka u veliko slovo
	 */
	public MyCharacter toUpperCase(){
		String s = this.ch + "";
		char ch = s.toUpperCase().charAt(0);
		return new MyCharacter(ch);
	}
	/*
	 * toString metoda za lakse stampanje rezultata
	 */
	public String toString(){
		return this.ch + "";
	}
}
