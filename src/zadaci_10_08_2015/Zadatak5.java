/*
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
 * each occurring exactly once in each row and once in each column. Write a
 * program that prompts the user to enter the number n and the array of characters,
 * as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */

package zadaci_10_08_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//niz slova
		char[] slova = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V' ,'W' ,'X', 'Y', 'Z'};
		
		Scanner in = new Scanner(System.in);
		//trazi se od korisnika da odredi velicinu matrice
		System.out.println("Unesite 'n' za matricu 'n x n'");
		int duzina = in.nextInt();
		char[][] matrica = new char[duzina][duzina];
		//unosenje karaktera u matricu
		System.out.println("Unosite clanove matrice");
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				matrica[i][j] = in.next().toUpperCase().charAt(0);
			}
		}
		in.close();
		
		boolean isLatinSquare = true;
		//prolazak kroz matricu i testiranje da li se odgovarajuci karakteri nalaze na pravim mjestima
		for(int i = 0; i < duzina; i++){
			//testiranje da li se na pozicijama matrica[0][i] i matrica[i][0] nalazi karakter niz[i]
			if(matrica[0][i] != slova[i] || matrica[i][0] != slova[i]){
				isLatinSquare = false;
				break;
			}
			for(int j = 0; j < duzina; j++){
				for(int k = 0; k < duzina; k++){
					//testiranje da li se u redovima ili kolonama ponavljaju karakteri
					if(j != k && (matrica[i][j] == matrica[i][k] || matrica[j][i] == matrica[k][i])){
						isLatinSquare = false;
						break;
					}
				}
			}
		}
		//prolazak kroz matricu i testiranje da li se u matrici nalaze karakteri koji nisu dozvoljeni
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				for(int k = 0; k < slova.length; k++){
					//ako matrica sadrzi karakter koji se u nizu slova nalazi na ili vecoj od pozicije slova[duzina], matrica nije 'Latin square'
					if(matrica[i][j] == slova[k] && k >= duzina){
						isLatinSquare = false;
						break;
					}
				}
			}
		}
		//u zavisnosti da li se odgovarajuci karakteri nalaze na pravim pozicijama, stampa se rezultat
		if(isLatinSquare){
			System.out.println("Unesena matrica je 'Latin square'");
		}else{
			System.out.println("Unesena matrica nije 'Latin square'");
		}

	}

}
