/*
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */

package zadaci_01_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		//generisanje nasumicnog broja od 1 do 12
		int broj = (int)(Math.random() * 12) + 1;
		//imena mjeseci smjestena u niz
		String[] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
		//stampanje imena mjeseca za odgovarajuci broj
		System.out.println(mjeseci[broj - 1]);

	}

}
