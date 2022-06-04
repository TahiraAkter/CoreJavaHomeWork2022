package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Single Inheritance as Mammal class extends Animal class

		System.out.println("\n------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // Single Inheritance as Reptile class extends Animal class

		System.out.println("\n------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // Single Inheritance as Birds class extends Animal class

		/*
		  Example of hierarchical inheritance: Animal class is the parent class from
		  which Mammal, Reptile, and Birds classes are derived.
		 */

		System.out.println("\n------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		/*
		  Multi-level inheritance because Robin class extends Birds class, and Birds
		  class extends Animal class
		 */

		System.out.println("\n------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
