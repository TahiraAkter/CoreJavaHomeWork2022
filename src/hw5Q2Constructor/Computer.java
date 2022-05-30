package hw5Q2Constructor;

import java.security.PublicKey;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default constructor of Computer class.\n ");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ", Price: $" + price + ", Grade:" + grade + " and Made in USA? Ans: " + madeInUSA + ".");
	}

	public Computer(String brand, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("\nMy Brand: " + brand + ", Operating System: " + operatingSystem + ", Price: $" + price
				+ ", Grade:" + grade + " and Made in USA? Ans: " + madeInUSA + ".");
	}
}
