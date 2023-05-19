public class Student {
	int course;
	int stId;
	String fio;
	String fakult;
	int group;
	int birth;

	public Student() {
	}

	public Student(int stId, String fio, String fakult, int group, int course, int birth) {
		this.course = course;
		this.stId = stId;
		this.fio = fio;
		this.fakult = fakult;
		this.group = group;
		this.birth = birth;
	}

	public void setId(int stId) {
		this.stId = stId;
	}

	public int getId() {
		return stId;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getFio() {
		return fio;
	}

	public void setFakult(String fakult) {
		this.fakult = fakult;
	}

	public String getFakult() {
		return fakult;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getBirth() {
		return birth;
	}

	public void getStudentInfo() {
		System.out.println("Привет! Меня зовут " + fio + ", год моего рождения: "
				+ birth + ", мой ID:"
				+ stId + ". Я учусь на факультете '" + fakult + "' в "
				+ group + " группе " + course
				+ " курса.");
	}
}