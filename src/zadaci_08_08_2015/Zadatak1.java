/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 */

package zadaci_08_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[][] sati = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2},
						{9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4},
						{3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
		
		int[][] ukupniSati = new int[8][2];
		
		//stampanje radinih sati za radnike
		System.out.println("             P U S C P S N\n");
		for(int i = 0; i < 8; i++){
			System.out.print("Radinik " + i + "    ");
			for(int j = 0; j < 7; j++){
				System.out.print(sati[i][j] + " ");
			}
			System.out.println();
		}
		//racunanje sedmicnog broja sati za svakog radnika
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				ukupniSati[i][0] = i;
				ukupniSati[i][1] += sati[i][j];
			}
		}
		System.out.println();
		
		int najveci = 0;
		//trazenje radinika koji ima najvise sati
		for(int i = 0; i < 8; i++){
			if(ukupniSati[i][1] > ukupniSati[najveci][1]){
				najveci = i;
			}
		}
		//stampanje radnika u opadajucem redu u zavisnosti koliko su sati radili
		for(int i = ukupniSati[najveci][1]; i >= 0; i--){
			for(int j = 0; j < 8; j++){
				if(ukupniSati[j][1] == i){
					System.out.println("Radnik " + ukupniSati[j][0] + " je ovu sedmicu radio " + ukupniSati[j][1]);
				}
			}
		}
		
	}	
}
