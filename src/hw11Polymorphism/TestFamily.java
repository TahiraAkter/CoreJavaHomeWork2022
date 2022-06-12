package hw11Polymorphism;

public class TestFamily {
	
	public static void main(String[] args) {
		
		System.out.println("--------Sister Class--------");		
		
		Sister sis = new Sister();
		sis.sister();
		sis.sister(10, 12, 14, "16", 18);
		sis.sister("13", 15, 17, 1, 21);
		Sister.sister(22, 24, 26, 29, "31");
		sis.sister(32, "34", 36, 38, 40);
		
		System.out.println("--------Niece Class--------");
		Niece n= new Niece();
		n.sister();
		n.sister(4, 7, 9, "10", 11);
		n.sister("22", 25, 28, 30, 29);
	}

}
