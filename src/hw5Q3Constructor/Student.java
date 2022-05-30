package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgramming;
	public float grade;

	public Student() {
	}

	public Student(String stName, int stID, char sex, boolean isProgramming, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgramming = isProgramming;
		this.grade = grade;
		
		System.out.println("This is from default Constructor of Student class.\n" + "\nStudent name: " + stName + ", ID: "
				+ stID + ", Sex: " + sex + ", Grade: " + grade + " and Java Programmer? Ans: " +isProgramming + ".");
	}
}
