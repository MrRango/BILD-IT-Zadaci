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

public class MyString1 {

	char[] chars;
	
	//konstruktor koji niz chars puni novim vrijednostima
	public MyString1(char[] chars){
		this.chars = new char[chars.length];
		for(int i = 0; i < chars.length; i++){
			this.chars[i] = chars[i];
		}
	}
	/*
	 * charAt metoda
	 */
	public char charAt(int index){
		return this.chars[index];
	}
	/*
	 * metoda koja vraca duzinu niza chars
	 */
	public int length(){
		return this.chars.length;
	}
	/*
	 * substring metoda
	 */
	public MyString1 substring(int begin, int end){
		char[] chars = new char[end - begin + 1];
		for(int i = 0; i < chars.length; i++){
			chars[i] = this.chars[begin++];
		}
		return new MyString1(chars);
	}
	/*
	 *toLowerCase metoda
	 */
	public MyString1 toLowerCase(){
		char[] chars = new char[this.chars.length];
		for(int i = 0; i < chars.length; i++){
			chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(chars);
	}
	/*
	 * metoda koja testira da li su dva objekta MyString1 jednaka
	 */
	public boolean equals(MyString1 s){
		boolean equals = true;
		//ispitivanje da li su im duzine nizova jednake
		if(this.chars.length != s.chars.length){
			equals = false;
		}else{
			//ispitivanje da li su elementi na istim pozicijama jednaki
			for(int i = 0; i < this.chars.length; i++){
				if(this.chars[i] != s.chars[i]){
					equals = false;
				}
			}
		}
		return equals;
	}
	/*
	 * metoda koja broj pretvara u niz karaktera
	 */
	public static MyString1 valueOf(int i){
		int broj = i;
		int brojac = 0;
		//odredjivanje duzine broja
		while(i != 0){
			i /= 10;
			brojac++;
		}
		//kreiranje niza duzine koja odgovara broju cifara unesenig broja
		char[]chars = new char[brojac];
		//odvajanje cifara od broja i njihovi smijestanje u niz
		for(int j = chars.length - 1; j >= 0; j--){
			int cifra = broj % 10;
			chars[j] = Character.forDigit(cifra, 10);
			broj /= 10;
		}
		
		return new MyString1(chars);
	}
	/*
	 * toString metoda za lakse stampanje
	 */
	public String toString(){
		String string = "";
		for(int i = 0; i < this.length(); i++){
			string += this.chars[i];
		}
		return string;
	}
	
}
