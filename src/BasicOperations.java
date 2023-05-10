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
	
	static void classMaking(String[] args) {
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
	
	public static void main(String[] args) {
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
	
	
}
