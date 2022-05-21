package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer();		
		Computer apple = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		Computer dell = new Computer("Dell", "Windows", 900, 'A', true);
	}
}
