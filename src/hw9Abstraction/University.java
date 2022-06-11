package hw9Abstraction;

public interface University extends College, Hospital{
	
	/*
	  One keyword (extends) is used for the inheritance in Interface. An Interface
	  can inherit other Interfaces by 'extends' keyword, but it cannot inherit a
	  regular class or an abstract class by 'extends' keyword. An Interface can
	  inherit more than one interface.
	 */

	// public University () {
	// }
	/*
	  Interfaces cannot have constructor because it contains abstract methods that
	  are declared only, therefore, there is no need to make an object to
	  initialize methods. For that reason, interface cannot have constructor in it.
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		
	}
	
	public static void library() {
		
	}

}
