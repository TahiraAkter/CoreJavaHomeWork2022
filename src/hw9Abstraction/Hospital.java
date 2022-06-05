package hw9Abstraction;

public interface Hospital {
	
	public default void morgue() {

	}

	public static void pharmacy() {

	}

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

}
