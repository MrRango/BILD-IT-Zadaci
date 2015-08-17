/*
 * (New string split method) The split method in the String class returns an
 * array of strings consisting of the substrings split by the delimiters. However, the
 * delimiters are not returned. Implement the following new method that returns
 * an array of strings consisting of the substrings split by the matching delimiters,
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 * array of String, and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, gf,
 * #, and e in an array of String.
 */

package zadaci_16_08_2015;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		//pozivanje metode i smijestanje rezultata u niz strRez
		String[] strRez = split("a?b?gf#e", "[?#]");
		//stampanje rezultata
		for(int i = 0; i < strRez.length; i++){
			System.out.print(strRez[i] + " ");
		}

	}
	/*
	 * metoda za splitanje stringa 
	 */
	public static String[] split(String s, String regex){
		ArrayList<String>strings = new ArrayList<>();
		String str = "";
		int pocetak = 0;
		//pretvaranje regex stringa u niz karaktera
		char[] regexNiz = new char[regex.length()];
		for(int i = 0; i < regexNiz.length; i++){
			char karakter = regex.charAt(i);
			regexNiz[i] = karakter;
		}
		//prolazak kroz string s i njegovo splitanje na mjestima gdje se nalazi neki od regex karaktera
		for(int i = 0; i < s.length(); i++){
			//odvajanje karaktera iz stinga s
			char karakter = s.charAt(i);
			for(int j = 0; j < regexNiz.length; j++){
				//poredjenje karaktera iz stringa s sa karakterima iz niza regex karaktera
				if(karakter == regexNiz[j]){
					//pravljenje stinga substingom stringa s
					str = s.substring(pocetak, i);
					//dodavanje stinga u listu
					strings.add(str);
					//dodavanje regex karaktera u listu
					strings.add(regexNiz[j] + "");
					//postavljanje pocetka za sledeci string
					pocetak = i + 1;
				}

			}
			//uzimanje stringa od zadnjeg regex karaktera
			if(i == s.length() - 1){
				str = s.substring(pocetak, s.length());
				strings.add(str);
			}
			
		}
		
		//smijestanje stringova iz liste u niz
		String[] strNiz = new String[strings.size()];
		for(int i = 0; i < strNiz.length; i++){
			strNiz[i] = strings.get(i);
		}
		return strNiz;
	}

}
