import java.util.Arrays;

public class StudentControl {
	Homework3 mainClass = new Homework3();
	Student stElements = new Student();
	private Student studentArray[] = new Student[10];

	public void stList() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].course == 1) {
				System.out.println(studentArray[i].fio);
			}
		}
	}

	public void stBirthList() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].birth > 1999) {
				System.out.println(studentArray[i].fio);
			}
		}
	}
}