/*
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * - An int data field named value that stores the int value represented by this object.
 * - A constructor that creates a MyInteger object for the specified int value.
 * - A getter method that returns the int value.
 * - The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * - The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * - The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * - The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * - A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * - A static method parseInt(String) that converts a string into an int value.
 * Draw the UML diagram for the class and then implement the class. Write a client
 * program that tests all methods in the class.
 */

package zadaci_12_08_2015;

public class MyInteger {
	
	private int value = 0;

	public MyInteger(int newValue){
		this.value = newValue;
	}

	public int getValue() {
		return value;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta paran broj
	 */
	public boolean isEven(){
		boolean isEven = false;
		
		if(this.value % 2 == 0){
			isEven = true;
		}		
		return isEven;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta neparan broj
	 */
	public boolean isOdd(){
		boolean isEven = false;
		
		if(this.value % 2 != 0){
			isEven = true;
		}		
		return isEven;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta prost broj
	 */
	public boolean isPrime(){
		boolean isPrime = false;
		for(int i = 2; i <= this.value; i++){
			//ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
			if(this.value % i == 0 && this.value != i){
				break;
			}
			if(this.value == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}
	/*
	 * metoda za ispitivanje da li je broj paran
	 */
	public static boolean isEven(int a){
		boolean isEven = false;
		//ispitivanje da li je broj paran
		if(a % 2 == 0){
			isEven = true;
		}	
		return isEven;
	}
	/*
	 * metoda za ispitivanje da li je broj neparan
	 */
	public static boolean isOdd(int a){
		boolean isOdd = false;
		//ispitivanje da li je broj neparan
		if(a % 2 != 0){
			isOdd = true;
		}
		return isOdd;
	}
	/*
	 * metoda za ispitivanje da li je broj prost
	 */
	public static boolean isPrime(int a){
		boolean isPrime = false;
		for(int i = 2; i <= a; i++){
			//ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
			if(a % i == 0 && a != i){
				break;
			}
			if(a == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta i paran broj
	 */
	public static boolean isEven(MyInteger i){
		boolean isEven = false;
		//ispitivanje da li je broj paran
		if(i.getValue() % 2 == 0){
			isEven = true;
		}
		
		return isEven;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta i neparan broj
	 */
	public static boolean isOdd(MyInteger i){
		boolean isOdd = false;;
		//ispitivanje da li je broj neparan
		if(i.getValue() % 2 != 0){
			isOdd = true;
		}
		
		return isOdd;
	}
	/*
	 * metoda za ispitivanje da li je vrijednost 'value' objekta i prost broj
	 */
	public static boolean isPrime(MyInteger i){
		boolean isPrime = false;;
		
		for(int j = 2; j <= i.getValue(); j++){
			//ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
			if(i.getValue() % j == 0 && i.getValue() != j){
				break;
			}
			if(i.getValue() == j){
				isPrime = true;
			}
		}	
		
		return isPrime;
	}
	/*
	 * metoda koja provjerava jednakost broja smjestenog u promjenljivu 'value' i unesenog broja
	 */
	public boolean equals(int a){
		boolean equals = false;
		
		if(value == a){
			equals = true;
		}
		return equals;
	}
	/*
	 * metoda koja provjerava jednakost broja smjestenog u promjenljivu 'value' i vrijednosti 'value' objekta i
	 */
	public boolean equals(MyInteger i){
		boolean equals = false;
		
		if(value == i.getValue()){
			equals = true;
		}
		return equals;
	}
	/*
	 * metoda za pretvaranje karaktere u int
	 */
	public static int parseInt(char[] a){
		int rez = 0;
		
		for(int i = 0; i < a.length; i++){
			//parsirenje karaktera u cifru
			int cifra = Integer.parseInt(a[i] + "");
			rez = rez * 10 + cifra;
		}
		return rez;
	}
	/*
	 * metoda za pretvaranje stringa u int
	 */
	public static int parseInt(String a){
		int rez = 0;
		
		for(int i = 0; i < a.length(); i++){
			//odvajanje karaktera is stringa
			char c = a.charAt(i);
			//parsiranje karaktera u cifru
			int cifra = Integer.parseInt(c + "");
			rez = rez * 10 + cifra;
		}	
		return rez;
	}
}
