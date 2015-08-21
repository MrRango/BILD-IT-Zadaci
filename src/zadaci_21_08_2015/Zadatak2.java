/*
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */

package zadaci_21_08_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		
		try{
			//pokusaj pravljenja niza ove velicine ce baciti izuzetak
			int[] niz = new int[Integer.MAX_VALUE];	
			//cisto da se negdje koristi niz, da nema uzvicnika :)
			for(int i = 0; i < niz.length; i++){
				System.out.print(niz[i]);
			}
		}
		//hvatanje izuzetka i ispisivanje poruge
		catch (OutOfMemoryError ex){
			System.out.println("Desio se OutOfMemoryError");
		}
		
		
		

	}

}
