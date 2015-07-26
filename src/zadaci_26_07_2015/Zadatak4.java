/*
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, iskljuèujuæi sebe. 
 * Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4. 
 */

package zadaci_26_07_2015;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println("Sledeci pozitivni cijeli brojevi su savrseni: ");
		ArrayList <Integer> lista = new ArrayList<>();
		
		int suma = 0;
		//testiranje svih brojeva od 1 do 10000
		for(int i = 1; i <= 10000; i++){
			//upisivanje svih djelilaca za trenutni broj u listu
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					lista.add(j);
				}
			}
			//sabiranje svih djelilaca trenutnog broja
			for(int j = 0; j < lista.size(); j++){
				suma += lista.get(j);
			}
			//ako je suma svih djelilaca trenutnog broja jednaka broju, broj je savrsen i stampa se
			if(suma == i){
				System.out.print(i + " ");
			}
			//sadrzaj liste se brise
			lista.clear();
			//suma se resetuje na nulu
			suma = 0;
			
		}

	}

}
