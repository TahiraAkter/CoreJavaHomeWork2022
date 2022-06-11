package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	/*
	  One keyword (extends) is used for the inheritance in Java for a regular
	  class. A regular Class can inherit an Abstract Class or other regular Class
	  by 'extends' keyword, but it cannot inherit an interface by 'extends'
	  keyword. Only one inheritance is possible by a regular Class.
	 */

	public ColumbiaUniversity() {

	}

	// public abstract void chemistry();
	/*
	  The reason why the above method is commented out is because Class contains
	  only non-abstract method that cannot be declared but can be implemented.
	 */
	
	public void biology() {
		System.out.println("Bio = life and logy = study");
	}

	@Override
	public void anatomyLab() {

	}

	@Override
	public void hygiene() {

	}
}
