package greet;

public class Persons {
	
	private String firstname;
	private String lastName;
	private int age;
	
	public Persons(String firstName, String lastName, int age) {
		super();
		this.firstname = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "first name: "+firstname +" Last Name: "+lastName+ " Age: "+ age;
	}

}
