package hw3JavaVariables;

public class AboutMe {

	public String name; // variable declared
	public String myName = "Tahira Akter"; // variable initialized
	public byte age = 69; // variable initialized
	public short myApartmentRent = 23000; // variable initialized
	public int myYearlySalary = 193000; // variable initialized
	public long myBankBalance = 64092388l; // variable initialized
	public float myHeight = 5.3f; // variable initialized
	public double myGrade = 3.9875; // variable initialized
	public char sex = 'F'; // variable initialized
	public boolean usCitizen = true; // variable initialized

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name: " + aboutMe.myName + "\nMy age: " + aboutMe.age + "\nMy yearly salary: "
				+ aboutMe.myYearlySalary + "\nMy U.S. citizenship status: " + aboutMe.usCitizen);
	}
}
