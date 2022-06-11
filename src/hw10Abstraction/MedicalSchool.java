package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{

	/*
	  Answers to HW9 questions:
	  
	  One keyword (extends) is used for the inheritance in Java for Abstract Class.
	  An Abstract Class can inherit another Abstract Class or a regular Class by
	  'extends' keyword, but it cannot inherit an Interface by 'extends' keyword.
	  Only one inheritance is possible by an Abstract Class.
	 */

	/*
	  Answers to HW10 questions:
	  
	  Two keywords, 'extends' and 'implements' are used for the inheritance in Java
	  for an Abstract Class. An Abstract Class can inherit another Abstract Class or a
	  regular Class by 'extends' keyword, but it cannot inherit an Interface by
	  'extends' keyword. However, it can inherit an Interface by 'implements'
	  keyword. An Abstract Class can inherit either one Abstract Class or one
	  regular Class(by 'extends' keyword), and more than one Interface (by
	  'implements' keyword).
	 */

	public MedicalSchool() {
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Blood tests are done at biochemistry lab");
	}

}
