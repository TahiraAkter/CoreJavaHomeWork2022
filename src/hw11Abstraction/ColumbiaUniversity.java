package hw11Abstraction;

import javax.swing.DefaultBoundedRangeModel;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{

	/*
	  Answers to HW9 questions:
	  
	  One keyword (extends) is used for the inheritance in Java for a regular
	  class. A regular Class can inherit an Abstract Class or other regular Class
	  by 'extends' keyword, but it cannot inherit an interface by 'extends'
	  keyword. Only one inheritance is possible by a regular Class.
	 */
	
	/*
	  Answers to HW10 questions:
	  
	  Two keywords, 'extends' and 'implements' are used for the inheritance in Java
	  for a regular Class. A regular Class can inherit another Abstract Class or a
	  regular Class by 'extends' keyword, but it cannot inherit an Interface by
	  'extends' keyword. However, it can inherit an Interface by 'implements'
	  keyword. A regular Class can inherit either one Abstract Class or one
	  regular Class(by 'extends' keyword), and more than one Interface (by
	  'implements' keyword).
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

	@Override
	public void lawInfo() {
		
	}

	@Override
	public void commonRoom() {
		
	}

	@Override
	public void laboratory() {
		
	}

	@Override
	public void languageClub() {
		
	}

	@Override
	public void emergencyRoom() {
		
	}

	@Override
	public void surgeryRoom() {
		
	}

	@Override
	public void cafeteria() {
		
	}

	@Override
	public void classSize() {
		
	}

	@Override
	public void playGround() {
		
	}

	@Override
	public void teacher() {
		
	}

	@Override
	public void vocationalInfo() {
		
	}
	public static void student() {
		
	}
	//public default void staff() {}
	//Default method is only allowed in interface
		
	}

