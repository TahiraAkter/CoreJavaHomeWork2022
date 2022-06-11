package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("-----Default constructor is initialized from Daughter Class-----");
		Daughter daughter01 = new Daughter();
		
		System.out.println("\n-----Parameterized constructor is initialized from Daughter Class-----");
		Daughter daughter02 = new Daughter("March", 55);
		
		System.out.println("\n-----Void type method is initialized from Daughter Class-----");
		daughter01.daughter();
		
		System.out.println("\n-----Parameterized method is initialized from Daughter Class-----");
		daughter02.daughterInfo("August", 30);
		
		System.out.println("\n-----Default constructor is initialized from Father Class-----");
		Father father01 = new Father();
		
		System.out.println("\n-----Parameterized constructor is initialized from Father Class-----");
		Father father02 = new Father("Mohammed", 80, 'M', true);
		
		System.out.println("\n-----Void type method is initialized from Father Class-----");
		father01.father();
		
		System.out.println("\n-----Parameterized method is initialized from Father Class-----");
		father02.fatherInfo("Mohammed", 80, 'M', true);

	}
}
