
public class Recyclables {
	String material;
	boolean canRecycle;
	
	public Recyclables(String material, boolean canRecycle) {
		this.material = material;
		this.canRecycle = canRecycle;
	}
	public String recycle(){
		if (canRecycle)  {
			return "This material is :" + this.material + "\n It is recycleable";
		}
		return "This material is :" + this.material + "\n It is not recycleable";
	}	
}



//	HashMap<String, Boolean> materialList = new HashMap<String, Boolean>(){{		
//		put("plastic", true);
//		put("paper", true);
//		put("glass", true);
//		put("metal", true);
//		put("steel", true);
//		put("concrete", true);
//		put("wood", true);
//		put("textile", true);
//		put("raw materials", true);
//		put("lumber", true);
//		put("fiber", true);
//	}};