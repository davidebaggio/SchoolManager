import java.util.ArrayList;

public class School {

	private ArrayList<ClassRoom> classes = new ArrayList<ClassRoom>();
	private Secretariat secretariat;

	public School(Secretariat secretariat, ArrayList<ClassRoom> classes) {
		this.secretariat = secretariat;
		this.classes = classes;
	}

	public Secretariat getSecretariat() {
		return secretariat;
	}

	public ArrayList<ClassRoom> getClasses() {
		return classes;
	}
}
