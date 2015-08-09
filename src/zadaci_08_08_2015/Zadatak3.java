/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2
 */

package zadaci_08_08_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int[][] matrica = new int [4][4];
		
		int[] brojURedovima = new int[4]; //broj jedinica u redu se snima na odgovarajucu poziciju u ovom nizu
		int[] brojUKolonama = new int[4]; //broj jedinica u koloni se snima na odgovarajucu poziciju u ovom nizu
		
		int brojURedu = 0;
		int brojUKoloni = 0;
		//punjenje matrice nulama i jedinicama i njihovo stampanje
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				//generisanje broja za poziciju ij
				matrica[i][j] = (int)(Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		//prolazak kroz matricu i brojanje jedinica po redovima i kolonama
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				//brojanje jedinica po redovima
				if(matrica[i][j] == 1){
					brojURedu++;
				}
				//na kraju reda, broj jedinica u redu se prebacuje u niz brojURedovima[] na poziciju i
				if(j == 3){
					brojURedovima[i] = brojURedu;
					brojURedu = 0;
				}
				//brojanje jedinica po kolonama
				if(matrica[j][i] == 1){
					brojUKoloni++;
				}
				//na kraju kolone, broj jedinica u koloni se prebacuje u niz brojUKolonama[] na poziciju i
				if(j == 3){
					brojUKolonama[i] = brojUKoloni;
					brojUKoloni = 0;
				}
			}
		}
		//odredjivanje u kojem redu/koloni ima najvise jedinica	
		int najveciRed = 0;
		int najvecaKolona = 0;
		//prolazak kroz nizove brojURedovima[] i brojUKolonama[]
		for(int i = 1; i < 4; i++){
			if(brojURedovima[i] > brojURedovima[najveciRed]){
				najveciRed = i;
			}
			if(brojUKolonama[i] > brojUKolonama[najvecaKolona]){
				najvecaKolona = i;
			}
		}
		//stampanje rezultata
		System.out.println("Najvise jedinica ima u redu sa indeksom: " + najveciRed);
		System.out.println("Najvise jedinica ima u kolona sa indeksom: " + najvecaKolona);
	}

}
