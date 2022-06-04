package hw8Abstraction;

public interface University {

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

}
