
public class Person {
    private int number;
	private String name;
	private String surname;
	private int yearOfBirth;
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Person (int number, String name, String surname, int yearOfBirth){
		this.number=number;
		this.name=name;
		this.surname=surname;
		this.yearOfBirth=yearOfBirth;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	
}
