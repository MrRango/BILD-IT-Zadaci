/*
 * (Random number chooser) Write a method that returns a random number between
 * 1 and 54, excluding the numbers passed in the argument. The method header is specified as follows:
 * public static int getRandom(int... numbers)
 */

package zadaci_07_08_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		//pozivanje metode za generisanje brojeva od 1 do 54, iskljucujuci 4 ,5 i 7
		System.out.println(getRandom(4, 5, 7));

	}
	/*
	 * metoda za generisanje brojeva od 1 do 54
	 * brojevi prosljedjeni kao argumenti, ne mogu biti generisani
	 */
	public static int getRandom(int... numbers){
		boolean uslov = true;
		int broj = 0;
		do{
			//generisanje broja
			broj = (int)(Math.random() * 54 + 1);
			//ako je generisan broj jednak nekom od prosljedjenjih, generise se novi
			for(int i = 0; i < numbers.length; i++){
				if(broj == numbers[i]){
					break;
				}
				if(i == numbers.length - 1){
					uslov = false;
				}
			}
		}while(uslov);
		return broj;
	}

}
