/*
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 */

package zadaci_26_08_2015;

public class Zadatak5 {

	public static void main(String[] args) {
		//pravljenje novog kursa
		Course kurs1 = new Course("Informatika");
		//dodavanje studenata
		kurs1.addStudent("Goran");
		kurs1.addStudent("Zoran");
		kurs1.addStudent("Dragan");
		kurs1.addStudent("Gagan");
		//kopiranje kursa
		Course kurs2 = kurs1.clone();
		//promjene originala
		kurs1.dropStudent("Goran");
		//stampanje originala
		System.out.println("Original:");
		String[] studenti = kurs1.getStudents();
		for(String student : studenti){
			System.out.println(student);
		}
		//stampanje kopije
		System.out.println("Kopija:");
		String[] studenti2 = kurs2.getStudents();
		for(String student: studenti2){
			System.out.println(student);
		}

	}

}
