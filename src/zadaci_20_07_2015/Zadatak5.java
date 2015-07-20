/*
 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisruje koliko se puta taj broj ponavlja. 
 * Pretpostavimo da se unos brojeva završava sa nulom.
 */

package zadaci_20_07_2015;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
 
public class Zadatak5 {

	public static void main(String[] args) {  
		
		ArrayList<Integer> list = new ArrayList <>();
		Scanner in = new Scanner(System.in);
		boolean uslov = true;
		int brojac = 0;
		System.out.println("Unesite brojeve: ");
		//unos brojeva u listu
		do{
			int broj = in.nextInt();
			//ako je unesen broj 0 unos se zavrsava
			if(broj == 0){
				uslov = false;
			}
			//ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
			}
		}while(uslov);
		in.close();
		//unesena lista se sortira od najmanje ka najvecoj vrijednosti
		Collections.sort(list);
		//za najveci broj se uzima broj sa kraja liste
		int najveci = list.get(list.size() - 1);
		//od kraja liste se krece sa prebrojavanjem koliko puta se najveca vrijednost pojavljuje
		for(int i = list.size()-1; i >= 0; i--){
			if(list.get(i) == najveci){
				brojac++;
			}
			//cim se dodje do broja koji nije jednak najvecem, izlazi se iz petlje
			else{
				break;
			}
		}
		//stampanje rezultata
		System.out.println("Najveci uneseni broj je " + najveci + ", a unesen je " + brojac + " puta.");
	}

}
