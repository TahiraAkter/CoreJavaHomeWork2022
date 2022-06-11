package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("\nThis is a default constructor of Father Class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's name: " + name + "\nFather's age: " + age + "\nFather's gender: " + sex
				+ "\nFather's US citizenship status: " + usCitizen);
	}

	public void father() {
		System.out.println("\nThis is a void type method from Father Class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's name: " + name + "\nFather's age: " + age + "\nFather's gender: " + sex
				+ "\nFather's US citizenship status: " + usCitizen);
	}

}
