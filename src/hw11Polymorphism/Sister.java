package hw11Polymorphism;

public class Sister {

	/*
	  Method Overloading:	  
	  Method overloading is the process of having two or more methods within the
	  same class that shares the same name with different parameter declarations.
	  It occurs during compile time.
	 */
	
	public void sister() {
	}

	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Total age from parameterized method sister: " + total1);
	}

	public int sister(String age4, int age1, int age2, int age3, int age5) {
		int total2 = Integer.parseInt(age4) + age1 + age2 + age3 + age5;
		System.out.println("Total age from return type method sister: " + total2);
		return total2;
	}

	public static void sister(int age1, int age2, int age3, int age5, String age4) {
		int total3 = age1 + age2 + age3 + age5 + Integer.parseInt(age4);
		System.out.println("Total age from static method sister: " + total3);
	}

	public final int sister(int age1, String age4, int age2, int age3, int age5) {
		int total4 = age1 + age2 + Integer.parseInt(age4) + age3 + age5;
		System.out.println("Total age from final method sister: " + total4);
		return total4;
	}

}
