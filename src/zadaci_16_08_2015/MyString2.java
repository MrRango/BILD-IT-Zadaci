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

public class MyString2 {

	String s;
	
	//konstruktor koji prihvata novi sting
	public MyString2(String s){
		this.s = s;
	}
	/*
	 * metoda za poredjenje stringova
	 * vraca 0 ako su isti, 1 ako je prvi veci, -1 ako je drugi veci
	 */
	public int compare(String s){
		int rez = 0;	
		//uporedjuje se duzina
		if (this.s.length() > s.length()){
			rez = 1;
		}
		else if (this.s.length() < s.length()){
			rez = -1;
		}
		//ako su duzine iste, uporedjuju se karakteri prvog sa karakterima drugog stringa
		else {
			for(int i = 0; i < this.s.length();i++){
				char karakter1 = this.s.charAt(i);
				char karakter2 = s.charAt(i);
				if(karakter1 > karakter2){
					rez = 1;
					break;
				}
				if(karakter1 < karakter2){
					rez = -1;
					break;
				}	
			}
		}
		return rez;
	}
	/*
	 * metoda za substring
	 */
	public MyString2 substring(int begin){
		String string = this.s.substring(begin, this.s.length());
		return new MyString2(string);
	}
	/*
	 * metoda koja pretvara slova stringa u velika slova
	 */
	public MyString2 toUpperCase(){
		String string = "";
		for(int i = 0; i < this.s.length(); i++){
			char karakter = this.s.toUpperCase().charAt(i);
			string += karakter;
		}
		return new MyString2(string);
	}
	/*
	 * metoda za pretvaranje stringa u niz karaktera
	 */
	public char[] toChars(){
		char[]chars = new char[this.s.length()];
		for(int i = 0; i < chars.length; i++){
			char karakter = this.s.charAt(i);
			chars[i] = karakter;
		}
		return chars;
	}
	/*
	 * metoda koja vraca string sa vrijednostima "true" ili "false" u zavisnosti od boolean b
	 */
	public static MyString2 valueOf(boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
	}
	/*
	 * toString metoda za lakse stampanje rezultata
	 */
	public String toString(){
		return this.s;
	}
	
}
