package zadaci_17_08_2015;

public class Loan {
	
	double iznos;
	
	Loan(){
		
	}
	Loan(double iznos){
		this.iznos = iznos;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
	return "Pozajmica: " + iznos;
	}
}
