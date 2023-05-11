
abstract public class Person {
	String name;
	String transportation;
	int year;
	
	Person(String name, String transportation, int year){
		this.name = name;
		this.transportation = transportation;
		this.year = year;
	}
	
	Person(Person person) {
		this.name = person.name;
		this.transportation = person.transportation;
		this.year = person.year;
	}
	
	Person(){}
	
	public String toString() {
		return name + " " + transportation + " " + year; 
	}
	
	public void copy(String name, String transportation, int year){
		this.name = name;
		this.transportation = transportation;
		this.year = year;
	}
}
