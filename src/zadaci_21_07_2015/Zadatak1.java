/*
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom. 
 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 */
package zadaci_21_07_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int brPrestupni = 0;
		//petlja koja ide od 101 do 2100
		for(int i = 101; i <= 2100; i++){
			//ispitivanje da li je godina prestupna
			//prestupna godina je ako je djeljiva sa 4 i ako nije djeljiva sa 100 ili je djeljiva sa 400
			if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
				//kad se ispise 10 godina, prelazi se u novi red
				if(brPrestupni != 0 && brPrestupni % 10 == 0){
					System.out.println();
				}
				//brojanje prestupnih godina
				brPrestupni++;
				//stampanje godina
				System.out.print(i + " ");
			}
		}
		//stampanje ukupnog broja prestupnih godina
		System.out.println("\nUkupan broj prestupnih godina u periodu od 101. do 2100. godine je " + brPrestupni);
	}
}
