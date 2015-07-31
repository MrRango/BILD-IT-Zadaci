/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.
 */

package zadaci_31_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos podataka za prvi proizvod
		System.out.println("Unesite tezinu i cijenu prvog pakovanja");
		double tezina1 = in.nextDouble();
		double cijena1 = in.nextDouble();
		//unos podataka za drugi proizvod
		System.out.println("Unesite tezinu i cijenu drugog pakovanja");
		double tezina2 = in.nextDouble();
		double cijena2 = in.nextDouble();
		in.close();
		//racunanje odnosa izmedju tezina i cijena prvog i drugog proizvoda
		double odnosTezine = (tezina2 / tezina1) * 100 - 100;
		double odnosCijene = (cijena2 / cijena1) * 100 - 100;
		//ako su odnosi isti, nema razlike, ni jedno pakovanje nije povoljnije od drugog
		if(odnosTezine == odnosCijene){
			System.out.println("Odnos cijene i kolicine je isti, tako da je svejedno koji proizvod cete kupiti");
		}
		//ako je odnos tezine manji od odnosa cijene, isplativije je kupiti prvi proizvod
		else if(odnosTezine < odnosCijene){
			System.out.println("Prvi proizvod ima bolju cijenu");
		}
		//ako je odnos tezine veci od odnosa cijene, isplativije je kupiti drugi proizvod
		else{
			System.out.println("Drugi proizvod ima bolju cijenu");
		}

	}

}
