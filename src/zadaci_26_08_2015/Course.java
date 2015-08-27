package zadaci_26_08_2015;

import java.util.ArrayList;

public class Course implements Cloneable{
	
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//no-arg konstruktor
	Course(){
		
	}
	//konstruktor sa argumentima
	Course(String courseName, String[] students, int numberOfStudents){
		this.courseName = courseName;
		this.students = students;
		this.numberOfStudents = numberOfStudents;
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}
	
	/*
	 * metoda koja izbacuje studenta sa kursa
	 */
	public void dropStudent(String student) {
		//lista za smijestanje studenata
		ArrayList<String> studenti = new ArrayList<>();
		//kopiranje niza studenata u listu
		for(int i = 0; i < students.length; i++){
			studenti.add(students[i]);
		}
		//uklanjanje studenta
		for(int i = 0; i < studenti.size(); i++){
			if(student.equals(studenti.get(i))){
				studenti.remove(i);
			}
		}
		//novi niz u koji ce se smijestiti azurirana lista
		String[] novaLista = new String[studenti.size()];
		//smijestanje elmenata liste u niz
		for(int i = 0; i < novaLista.length; i++){
			novaLista[i] = studenti.get(i);
		}
		//azuriranje liste studenata
		students = novaLista;
		//smanjivanje broja studenata
		numberOfStudents--;
	}
	@Override
	/*
	 * metoda za kloniranje klase Course
	 */
	public Course clone(){
		//pravljenje kopije kursa sa istim imenom
		Course kopija = new Course(this.getCourseName());
		kopija.students = new String[100];
		//popunjavanje niza studenata elementima niza kursa koji se kopira
		for(int i = 0; i < this.students.length; i++){
			kopija.students[i] = this.students[i];	
		}
		//broj studenata kopije uzima vrijednost broja studenata originala
		kopija.numberOfStudents = this.getNumberOfStudents();
		
		return kopija;
		
	}
	
}
