package hw4JavaConstructor;

public class AboutMe {

	public String myName; // variable declared
	public byte age; // variable declared
	public short myApartmentRent; // variable declared
	public int myYearlySalary; // variable declared
	public long myBankBalance; // variable declared
	public float myHeight; // variable declared
	public double myGrade; // variable declared
	public char sex; // variable declared
	public boolean usCitizen; // variable declared

	public AboutMe() { // constructor declared
		System.out.println("\nThis is all about us: \n");
	}

	public void aboutMe() { // method implemented
		System.out.println("My name: " + myName + "\nAge:" + age + "\nRent: " + myApartmentRent + "\nYearly salary: "
				+ myYearlySalary + "\nBank balance " + +myBankBalance + "\nHeight: " + myHeight + "\nGender: " + sex
				+ "\nU.S. Citizenship status: " + usCitizen);
	}

}
