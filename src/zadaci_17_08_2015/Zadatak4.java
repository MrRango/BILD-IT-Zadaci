/*
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 */

package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		//dodavanje objekata u listu
		list.add(new Loan(1000));
		list.add(new Date());
		list.add(new String("string objekat"));
		list.add(new Circle(15));
		//stampanje toString metoda za objekte
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}

	}

}
