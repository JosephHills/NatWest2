package personTaskWithAsh;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Person Joseph = new Person("Joseph", 36, "Professional Idiot");

		Person Shanks = new Person("Ash", 29, "Professional Idiot");

		System.out.println(Joseph.toString());
		System.out.println(Shanks.toString());

		ArrayList <Person> people = new ArrayList<>();
		people.add(Joseph);
		people.add(Shanks);
		System.out.println();
		
		
		
		
		
	}
}
