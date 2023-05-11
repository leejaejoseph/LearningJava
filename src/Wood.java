
public class Wood {
	int wood;
	static int stack;
	Wood(int wood){
		stack += wood;
	}
	static void Burn() {
		stack--;
	}
	static int GetWood() {
		return stack;
	}
}
