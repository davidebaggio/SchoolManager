public class Secretarians implements Entity {

	private String name, surname, CF, birthplace, job;
	private Date birthday;

	public Secretarians(String name, String surname, Date birthday, String CF, String birthplace, String job) {
		setName(name);
		setSurname(surname);
		setBirthday(birthday);
		setBirthplace(birthplace);
		setCF(CF);
		setJob(job);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public String getCF() {
		return CF;
	}

	public String getJob() {
		return job;
	}

	public String getInfo() {
		String info = name + " " + surname + "\nBorn: " + birthday.getDate() + " in " + birthplace + "\nCF: " + CF
				+ "\nWork as a: " + job;
		return info;
	}
}
