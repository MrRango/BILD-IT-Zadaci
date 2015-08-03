/*
 * Pretpostavimo da �kolarina za godinu dana na fakultetu ko�ta 10.000 i da se pove�ava za 5% svake godine. 
 * Godinu dana od danas, �kolarina �e iznositi 10.500. Napisati program koji izra�unava koliko �e �kolarina za godinu dana iznositi kroz 10 godina.
 */

package zadaci_03_08_2015;

public class Zadatak5 {

	public static void main(String[] args) {
		//iznos skolarine na pocetku
		double skolarina = 10000;
		//godisnje povecanje skolarine 5%
		double povecanje = 5 / 100.0;
		//racunanje skolarine za 10 godina	
		for(int i = 0; i < 10; i++){
			skolarina = skolarina + (skolarina * povecanje);
		}
		//stampanje rezultata
		System.out.println("Za 10 godina skolarina ce iznositi " + (int)(skolarina *100)/100.0);
		

	}
}
