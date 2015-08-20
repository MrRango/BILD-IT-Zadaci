/*
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or
 * number of years is less than or equal to zero.
 */

package zadaci_20_08_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Loan loan = new Loan();
		//unos iznosa, kamate i broja godina od strane korisnika
		try{
			System.out.println("Unesite iznos:");
			loan.setLoanAmount(in.nextDouble());
			System.out.println("Unesite kamatu:");
			loan.setInterestRate(in.nextDouble());
			System.out.println("Unesite broj godina:");
			loan.setNumberOfYears(in.nextInt());
		}
		//ako unos nije validan, hvata se izuzetak
		catch(IllegalArgumentException ex){
			System.out.println("Greska pri unosu.");
		}
		finally{
			in.close();
		}
		
	}

}
