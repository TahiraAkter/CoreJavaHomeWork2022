package hw11Abstraction;

public interface University extends College, Hospital {

	/*
	  public University () { }
	 */

	/*
	  Answers to HW8 questions: 
	  
	  Interfaces cannot have constructor because it
	  contains abstract methods that are declared only, therefore, there is no need
	  to make an object to initialize methods. For that reason, interface cannot
	  have constructor in it.
	 */

	/*
	  Answers to HW9 questions: 
	  
	  One keyword (extends) is used for the inheritance in Interface. 
	  An Interface can inherit other Interfaces by 'extends' keyword,
	  but it cannot inherit a regular class or an abstract class by 'extends'
	  keyword. An Interface can inherit more than one interface.
	 */

	/*
	  Answers to HW10 questions: 
	  
	  One keyword (extends) is used for the inheritance in Interface. 
	  An Interface can inherit other Interfaces by 'extends' keyword, but
	  not by 'implements' keyword. It cannot inherit a regular class or an abstract class by
	  'extends' or 'implements' keyword. An Interface can inherit more than one
	  interface.
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

}
