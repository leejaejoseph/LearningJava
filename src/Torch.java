
public class Torch {
	String Burn(){
		Wood.Burn();

		if (Wood.GetWood() == 0) {			
			return "The furnace is not burning. \n" + Wood.GetWood() + " wood left.";
		}
		return "The furnace is burning with " + Wood.GetWood() + " wood left.";
	}
}
