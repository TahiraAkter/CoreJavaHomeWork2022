package hw9Abstraction;

public interface University extends College, Hospital {

	/*
	  One keyword (extends) is used for the inheritance in Interface. An Interface
	  can inherit other Interfaces by 'extends' keyword, but it cannot inherit a
	  regular class or an abstract class by 'extends' keyword. An Interface can
	  inherit more than one interface.
	 */

	public default void gymnasium() {

	}

	public static void library() {

	}

	public void classSize();

	public void playGround();

	public void teacher();

}
