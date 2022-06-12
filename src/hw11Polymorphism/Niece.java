package hw11Polymorphism;

public class Niece extends Sister {

	/*
	  Method Overriding: 
	  When the child class has the same method as the parent
	  class with different syntax or logic, it is called method overriding.
	 */

	@Override
	public void sister() {
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + 5;
		System.out.println("Total age from parameterized method sister: " + total1);
	}

	@Override
	public int sister(String age4, int age1, int age2, int age3, int age5) {
		int total2 = Integer.parseInt(age4) + age1 - 4 + age2 + age3 + age5;
		System.out.println("Total age from return type method sister: " + total2);
		return total2;
	}

	/*
	  @Override 
	  public static void sister(int age1, int age2, int age3, int age5,
	  String age4) { int total3 = age1 + age2 + age3 + age5 +
	  Integer.parseInt(age4);
	  System.out.println("Total age from static method sister: " + total3); 
	  }
	 */

	/*
	  Static method cannot be overridden by a subclass as it is the local method of
	  the class in which it is implemented. Nevertheless, it can be implemented in
	  a child class with same signature/parameter as parent class without the
	  override annotation. Then it will work as the static method of the child
	  class.
	 */

	/*
	  @Override 
	  public final int sister(int age1, String age4, int age2, int age3,
	  int age5) { int total4 = age1 + age2 + Integer.parseInt(age4) + age3 + age5;
	  System.out.println("Total age from final method sister: " + total4); return
	  total4; 
	  }
	 */

	/*
	  Final type methods cannot be overridden by a subclass because making a method
	  final ensures that it is complete and cannot be altered.
	 */

}
