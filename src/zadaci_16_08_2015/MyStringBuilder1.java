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

public class MyStringBuilder1 {

	String s;
	
	public MyStringBuilder1(String s){
		this.s = s;
	}
	/*
	 * metoda za dodavanje drugog objekta na prvi
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s){
		return new MyStringBuilder1(this.s += s.s);
	}
	/*
	 * metoda za dodavanje broja na objekat
	 */
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.s += i);
	}
	/*
	 * metoda za odredjivanje duzine stringa objekta
	 */
	 public int length(){
		 return this.s.length();
	 }
	 /*
	  * metoda koja vraca karakter koji se nalazi na specificiranom indeksu
	  */
	 public char charAt(int index){
		 return this.s.charAt(index);
	 }
	 /*
	  * metoda koja pretvara string objekta u sva mala slova
	  */
	 public MyStringBuilder1 toLowerCase(){
		 return new MyStringBuilder1(this.s.toLowerCase());
	 }
	 /*
	  * metoda koja pravi substring od indexa begin do end ukljucujuci i njih
	  */
	 public MyStringBuilder1 substring(int begin, int end){
		 String s = "";
		 for(int i = begin; i <= end; i++){
			 s += this.s.charAt(i);
		 }
		 return new MyStringBuilder1(s);
	 }
	/*
	 * toString metoda za lakse stampanje rezultata
	 */
	public String toString(){
		return this.s;
	}
	
}
