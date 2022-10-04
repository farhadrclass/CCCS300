import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Create ArrayList
		ArrayList<String> country = new ArrayList<>();
		
		// Add Elements to the ArrayList
		country.add("Canada");
		country.add("USA");
		country.add("France");
		
		System.out.println("ArrayList: " + country);
		
		//	Get an element from the ArrayList
		String current_country = country.get(1);
		System.out.println("Current Country: " + current_country);
		
		//	Change the element in the ArrayList
		country.set(2, "England");
		System.out.println("ArrayList Updated: " + country);
		
		// Remove an element from the ArrayList using the Object
		country.remove("USA");
		System.out.println("ArrayList Updated 2: " + country);
		
		// Remove an element from the ArrayList using the Index
		country.remove(1);
		System.out.println("ArrayList Updated 3: " + country);
	}

}
