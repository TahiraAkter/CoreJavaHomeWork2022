package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {

	/*
	  One keyword (extends) is used for the inheritance in Java for Abstract Class.
	  An Abstract Class can inherit another Abstract Class or a regular Class by
	  'extends' keyword, but it cannot inherit an interface by 'extends' keyword.
	  Only one inheritance is possible by an Abstract Class.
	 */

	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Blood tests are done at biochemistry lab");
	}

}
