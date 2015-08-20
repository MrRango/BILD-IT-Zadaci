package zadaci_20_08_2015;

public class Loan {
	
	double loanAmount;
	double interestRate;
	int numberOfYears;
	
	//no-arg konstruktor
	Loan(){
		
	}
	//seteri
	public void setLoanAmount(double loanAmount) {
		//ispitivanje da li je unesen pozitivan broj
		if(loanAmount <= 0){
			throw new IllegalArgumentException("error");
		}
		this.loanAmount = loanAmount;
	}
	public void setInterestRate(double interestRate) {
		//ispitivanje da li je unesen pozitivan broj
		if(interestRate <= 0){
			throw new IllegalArgumentException("error");
		}
		this.interestRate = interestRate;
	}
	public void setNumberOfYears(int numberOfYears) {
		//ispitivanje da li je unesen pozitivan broj
		if(numberOfYears <= 0){
			throw new IllegalArgumentException("error");
		}
		this.numberOfYears = numberOfYears;
	}
	
	
	
}
