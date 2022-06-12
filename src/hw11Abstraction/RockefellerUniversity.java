package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	
	public void maths() {
		System.out.println("I love algebra");
	}

	@Override
	public void mechanicalLab() {
	}

	@Override
	public void aeronauticalInfo() {
	}
}
