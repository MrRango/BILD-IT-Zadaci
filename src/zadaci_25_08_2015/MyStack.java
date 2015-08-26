/*
 * klasa 'Stack' za smjestanje objekata tipa Circle
 */

package zadaci_25_08_2015;

import java.util.ArrayList;

public class MyStack {
	//lista za smijestanje objekata (sadrzaja steka)
	private ArrayList<Circle> list = new ArrayList<>();
	//no-arg konstruktor
	MyStack(){
		
	}
	//konstruktor sa argumentom
	MyStack(ArrayList<Circle> list){
		this.list = list;
	}
	
	
	/*
	 * metoda za ispitivanje da li je stek prazan
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	/*
	 * metoda za odredjivanje broja objekata u steku
	 */
	public int getSize() {
		return list.size();
	}
	/*
	 * metoda koja pokazuje na vrh steka
	 */
	public Object peek() {
		return list.get(getSize() - 1);
	}
	/*
	 * metoda za uzimanje objekata iz steka
	 */
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	/*
	 * metoda za smijestanje objekata u stek
	 */
	public void push(Circle o) {
		list.add(o);
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	
	/*
	 * metoda za deep copy steka koji sadrzi objekte Circle
	 */
	public static MyStack deepCopy(MyStack stack){
		//lista za smijestanje kopija
		ArrayList<Circle> deepCopy = new ArrayList<>();
		//pravljenje kopija objekata
		for(int i = 0; i < stack.list.size(); i++){
			deepCopy.add(new Circle(stack.list.get(i).radius));
		}
		return new MyStack(deepCopy);
	}

}
