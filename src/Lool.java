import java.util.Scanner;
import java.util.function.Supplier;

public class Lool {
	public static void main(String[] args) {
		Supplier<Human> human = () -> {
			Scanner in = new Scanner(System.in);
			System.out.println("input name");
			String name = in.nextLine();
			return new Human(name);
			
		};
			Human h1 = human.get();
			Human h2 = human.get();
			System.out.println("Human 1: "+h1.getname());
			System.out.println("Human 2: "+h2.getname()+ " ");
	}

}

class Human{
	private String name;
	Human(String name) {
		this.name = name;
		
	}
	String getname() {
		return name;
	}
}