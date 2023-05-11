
public class Teachers {
	String name;
	String course;
	int age;
	int rating;
	
	//Differences in arguments make different signature
	Teachers(String name, String course, int age, int rating){
		this.name = name;
		this.course = course;
		this.age = age;
		this.rating = rating;
	}
	Teachers(String name, String course, int age){
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public String toString() {
		return name + ' ' + course + ' ' + age + ' ' + rating;
	}
}
