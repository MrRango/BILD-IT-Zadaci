/*
 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
 */

package zadaci_31_07_2015;

public class Zadatak4 {

	public static void main(String[] args) {
		int brojac = 0, i = 10;
		//petlja se vrti dok ne dobijemo 100 palindrome prime brojeva
		while(brojac < 100){
			//provjera da li je broj prost i da li su broj i broj ispisan naopako isti
			if(isPrime(i) && i == reverse(i)){
				//ako je ispisano 10 brojeva, prelazi se u novi red
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				//stampanje broja
				System.out.print(i + " ");
				//povecavanje broja ispisanih brojeva
				brojac++;
			}
			//povecavanje broja koji se provjerava
			i++;
		}

	}
	/*
	 * metoda koja vraca broj ispisan naopako
	 */
	public static int reverse(int number){
		int newNumber = 0;
		int cifra = 0;
		//petlja se ponavlja dok broj ne postane jednak 0, tj. dok se sve cifre ne obrade
		while(number != 0){
			//odvajanje zadnje cifre od broja
			cifra = number % 10;
			//pomjeranje zareza za jedno mjesto u lijevo kod unesenog broja
			number = number / 10;
			//pomjeranje zareza za jedno mjesto u desno kod novog broja
			newNumber = newNumber * 10;
			//dodavanje odvojene cifre novom broju
			newNumber += cifra;
		}
		return newNumber;
	}
	/*
	 * metoda za ispitivanje da li je broj prost
	 */
	public static boolean isPrime(int n){
		boolean isPrime = true;
		//da bi broj bio prost mora biti veci od jedan
		if(n < 2){
			isPrime = false;
		}else{
			//ako je broj djeliv sa bilo kojim brojem osim jedinicom i samim sobom, on nije prost
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}


}
