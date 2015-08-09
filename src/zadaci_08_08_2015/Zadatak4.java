/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header:
 * public static void sort(int m[][])
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * will be sorted to
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */

package zadaci_08_08_2015;

public class Zadatak4 {

	public static void main(String[] args) {
		//matrica koju treba sortirati
		int[][] matrica = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		//pozivanje metode za sortiranje matrice
		sort(matrica);
		
	}
	/*
	 * metoda za sortiranje matrice ciji redovi sadrze 2 karaktera
	 */
	public static void sort(int m[][]){

		for(int k = 0; k < 10; k++){
			for(int l = 0; l < 10; l++){
				//prolazak kroz matricu
				for(int i = 0; i < m.length; i++){	
					if(m[i][0] == k && m[i][1] == l){	
						System.out.print(k + ", " + l + "\n");
					}	
				}		
			}	
		}	
	}
}
