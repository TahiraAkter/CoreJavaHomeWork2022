package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.familyName = "Ali";
		System.out.println("Father's family name: " + familyName);

		System.out.println("\nThis is a default constructor from Daughter Class");
	}

	public Daughter(String birthMonth, int age) {
		super("Mohammed", 80, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nDaugher's month of birth: " + birthMonth + "\nDaugher's age: " + age);
	}

	public void daughter() {
		System.out.println("\nThis is a void type method from Dauther Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Mohammed", 80, 'M', true);
		super.familyName = "Ali";
		System.out.println("Father's family name: " + familyName);

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("\nDaugher's month of birth: " + birthMonth + "\nDaugher's age: " + age);
	}

}
