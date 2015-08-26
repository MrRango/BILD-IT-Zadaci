/*
 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
 * a deep copy of the list field.
 */

package zadaci_25_08_2015;

public class Zadatak5 {

	public static void main(String[] args) {
		//kreiranje steka
		MyStack stack = new MyStack();
		//punjenje steka krugovima
		stack.push(new Circle(2));
		stack.push(new Circle(3));
		stack.push(new Circle(5));
		//pravljenje deep kopije steka
		MyStack copy = MyStack.deepCopy(stack);
		//dodavanje jos jednog kruga u stek
		stack.push(new Circle(4));
		//stampanje orginalnog steka
		System.out.println("Orginalni stek");
		while(!stack.isEmpty()){
			System.out.println(stack.pop().getClass());
		}
		//stampanje kopije steka
		System.out.println("Kopija steka");
		while(!copy.isEmpty()){
			System.out.println(copy.pop().getClass());
		}

	}

}

