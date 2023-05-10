import java.util.Random;

public class OOP {
	
	String welcome = "Welcome to";
	String name = "Java Learning";
	int classNumber = 101;
	
	String enter(){
		Random random = new Random();
		int messageProbability = random.nextInt(2);
		return getMessage(messageProbability);
	}
	static String getMessage(int probability) {
		String message = "";
		if (probability == 0) {
			message += "Hello, Mr. Joseph";
		} else if (probability == 1) {
			message += "I am in the wrong class";
		}
		return message;
	}
}

