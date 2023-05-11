
public class Hero extends Person {
	String Powers;
	
	Hero(String name, String transportation, int year, String Powers) {
		super(name, transportation, year);
		this.Powers = Powers;
	}
	
	Hero(Hero hero) {
		super.copy(hero.name, hero.transportation, hero.year);
		this.Powers = hero.Powers;
	}
	
	public String toString(){
		return super.toString() + " " + Powers;
	}
	
	public void copy(Hero target) {
		super.copy(target.name, target.transportation, target.year);
		this.Powers = target.Powers;
	}
}
