package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		System.out.println("-------Columbia University-------");

		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.biology();
		cu.anatomyLab();
		cu.hygiene();
		cu.lawInfo();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.classSize();
		cu.playGround();
		cu.teacher();
		cu.vocationalInfo();
		ColumbiaUniversity.student();

		System.out.println("-------University-------");

		University u = new ColumbiaUniversity();
		u.classSize();
		u.playGround();
		u.teacher();
		u.gymnasium();
		University.library();

		System.out.println("-------Medical School-------");

		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		MedicalSchool.cellStudyLab();
	}

}
