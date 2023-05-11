import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class BasicOperations {

	static void multiply(String[] args) {
		JOptionPane.showMessageDialog(null, "Quick Distance Calculator");
		int InputMiles = Integer.parseInt(JOptionPane.showInputDialog("Enter Distance in miles"));
		JOptionPane.showMessageDialog(null, "Distance at "+ InputMiles + " miles");
		int InputTime = Integer.parseInt(JOptionPane.showInputDialog("Time length in minutes"));
		JOptionPane.showMessageDialog(null, "Time at "+ InputTime + " minutes");
		float speed = InputMiles * 60 / InputTime; 
		JOptionPane.showMessageDialog(null, "Your speed is traveled is " + speed + "m/h");
	}
	
	static void nestedForLoop(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Enter Rows");
		int rows = scanner.nextInt();
		System.out.println("Enter Columns");
		int columns = scanner.nextInt();
		System.out.println("Enter Symbol");
		String symbol = scanner.next();
		scanner.nextLine();
		
		String tables = "";
		for (int i = 0; i < columns; i++ ) {
			for (int j = 0; j < rows; j++) {
				tables += symbol;
			}
			tables += "\n";
		}
		System.out.println(tables);
	}
	
	static void arrays(String[] args) {
		int[] array = {4, 7, 8};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int[] doubledArray = new int[3];
		int[][] doubleArray = {array, array}; 

		
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				doubledArray[j] += doubleArray[i][j];
			}
		}
		System.out.println(Arrays.toString(doubledArray));
	}
	
	static void addingArrayList(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		int total = 0;
		for (int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i);
		}
		System.out.println(total);
	}
	
	static void findingHypotenuse(String[] args) {
		double Hypotenuse = findHypotenuse(2,2);
		System.out.println(Hypotenuse);
	}
	
	static double findHypotenuse(int a, int b) {
		final double HYPOTENUSE = Math.sqrt(a*a + b*b);
		// HYPOTENUSE = 2; because of final, it will not be reassignable.
		// TO WHICH COMMON PRACTICE IS MAKING IT FULLY UPPERCASE
		return HYPOTENUSE;
	}
	
	static void classMaking() {
		Scanner scanner = new Scanner(System.in);
		OOP myOOP = new OOP();
		System.out.println(myOOP.welcome+" ");
		System.out.print(myOOP.name);
		System.out.println(myOOP.classNumber);
		System.out.println("(Type any key+enter continue)");
		String pressToContinue = scanner.next();
		
		System.out.println("Do you enter the classroom? Yes or No");		
		String enter = scanner.next();
		
		if (enter.equalsIgnoreCase("Yes")||enter.equalsIgnoreCase("Y")) {
			System.out.println(myOOP.enter());
		}
	}
	
	static void Constructors() {
		ClassRoom student1 = new ClassRoom("Joseph", "Java", 212423);
		ClassRoom student2 = new ClassRoom("Jo", "JavaScript", 123456);
		ClassRoom[] students = {student1, student2};

		ArrayList<String> studentList = new ArrayList<String>();
		ArrayList<String> studentCourse = new ArrayList<String>();
		ArrayList<Number> studentID = new ArrayList<Number>();
		for (ClassRoom student: students) {
			studentList.add(student.name);
			studentCourse.add(student.course);
			studentID.add(student.id);
		}
		System.out.println(studentList);
		System.out.println(studentCourse);
		System.out.println(studentID);
	}
	
	static void diceRoll() {
		Dice dice = new Dice();
		int number = dice.roll();
		System.out.println(number);
	}
	
	static void teachers(String[] args) {
		Teachers teachers = new Teachers("George", "C++", 32, 6);
		
		System.out.println(teachers);
	}
	
	static void Stores(String[] args) {
//		Arrays[] array = new Arrays[4]; 
		Stores store1 = new Stores("Walmart");
		Stores store2 = new Stores("Target");
		Stores store3 = new Stores("Hmart");
		
		Stores[] Stores = {store1, store2, store3};
		
		for (Stores item : Stores) {
			System.out.println(item.item);
		}
	}
	
	static void burning(String[] args) {
		Torch torch = new Torch();
		Wood wood1 = new Wood(3);
		Wood wood2 = new Wood(3);
		Wood wood3 = new Wood(3);

		String furnace = torch.Burn();
		System.out.println(furnace);
	}
	
	 static void heroes(String[] args) {
		plastic Recycle = new plastic("Plastic", false);
		System.out.println(Recycle.recycle());
		
		Hero hero1 = new Hero("Iron Man", "Propulsion", 2012, "Smarts");
		Hero hero2 = new Hero("Hulk", "Legs", 2008, "Radiation");
		Hero hero3 = new Hero("SpiderMan", "Webs", 2019, "Spidey Tingle");
		
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		
		//Copying hero1 contents to hero 2
		// dont do Hero2 = hero1 as hero1 will now just have two access points from the same memory and instead use
		hero2.copy(hero1); // Have to make a method for copy.
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		// for during instantiation instead of after we do 
		Hero hero4 = new Hero(hero1);
		System.out.println(hero4.toString());
	}
	 public static void main(String[] args) {
		 Fire Charizard = new Fire();
		 System.out.println(Charizard.UnPhase());
		 
		 Electric Pikachu = new Electric();
		 System.out.println(Pikachu.Pain());

		 Grass Bulbasaur = new Grass();
		 System.out.println(Bulbasaur.Pain());
		 
		 Pokemon[] Pokemons = {Charizard, Pikachu, Bulbasaur};
		 
		 for (Pokemon Pokemon: Pokemons) {
			 System.out.println(Pokemon.Weak());
		 }
		 Scanner typeSelection = new Scanner(System.in);
		 Pokemon Leafeon = null;
		 
		 System.out.println("Which type is Leafeon?");
		 System.out.println("1. Grass, 2. Electric, 3.Fire");
		 int type = typeSelection.nextInt();
		 
		 if (type == 1) {
			 Leafeon = new Grass();
		 } else if (type == 2) {
			 Leafeon = new Electric();
		 } else if (type == 3) {
			 Leafeon = new Fire();
		 }
		 System.out.println(Leafeon.Strong());
		 System.out.println(Leafeon.Weak());
	 }
}
