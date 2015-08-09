/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s.
 */

package zadaci_08_08_2015;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int[][]matrica = new int[6][6];
		
		int[] brojURedovima = new int[6]; //broj jedinica u redu se snima na odgovarajucu poziciju u ovom nizu
		int[] brojUKolonama = new int[6]; //broj jedinica u koloni se snima na odgovarajucu poziciju u ovom nizu
		
		int brojURedu = 0;
		int brojUKoloni = 0;
		//punjenje matrice nulama i jedinicama i njihovo stampanje
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				//generisanje broja za poziciju ij
				matrica[i][j] = (int)(Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		//prolazak kroz matricu i brojanje jedinica po redovima i kolonama
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
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
		
		boolean isEven = true;
		//prolazak kroz nizove brojURedovima[] i brojUKolonama[]
		for(int i = 0; i < 5; i++){
			//ako se vrijednosti u nizu razlikuju, matrica nema isti broj jedinica u redovima i kolonama
			if(brojURedovima[i] != brojURedovima[i + 1]){
				isEven = false;
			}
			//ako se vrijednosti u nizu razlikuju, matrica nema isti broj jedinica u redovima i kolonama
			if(brojUKolonama[i] != brojUKolonama[i + 1]){
				isEven = false;
			}
		}
		
		//stamapanje rezultata
		if(isEven){
			System.out.println("Svi redovi i kolone imaju isti broj jedinica");
		}
		else{
			System.out.println("Svi redovi i kolone nemaju isti broj jedinica");
		}

	}

}
