package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {

		AboutMe tahira = new AboutMe(); // constructor initialized

		tahira.myName = "Tahira Akter"; // variable initialized
		tahira.age = 69; // variable initialized
		tahira.myApartmentRent = 23000; // variable initialized
		tahira.myYearlySalary = 193000; // variable initialized
		tahira.myBankBalance = 64092388l; // variable initialized
		tahira.myHeight = 5.3f; // variable initialized
		tahira.myGrade = 3.9875; // variable initialized
		tahira.sex = 'F'; // variable initialized
		tahira.usCitizen = true; // variable initialized
		tahira.aboutMe(); // method initialized

		AboutMe alex = new AboutMe(); // constructor initialized

		alex.myName = "Alex Rodriguez"; // variable initialized
		alex.age = 71; // variable initialized
		alex.myApartmentRent = 27000; // variable initialized
		alex.myYearlySalary = 253000; // variable initialized
		alex.myBankBalance = 78092388l; // variable initialized
		alex.myHeight = 5.11f; // variable initialized
		alex.myGrade = 3.5; // variable initialized
		alex.sex = 'M'; // variable initialized
		alex.usCitizen = true; // variable initialized
		alex.aboutMe(); // method initialized
	}

}
