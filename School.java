import java.util.ArrayList;

public class School {

	private ArrayList<ClassRoom> classes;
	private Secretariat secretariat;

	public School() {
		classes = new ArrayList<ClassRoom>();
		secretariat = new Secretariat();
	}

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

	public void addClassRoom(ClassRoom classRoom) {
		if (classRoom == null)
			throw new IllegalClassRoomException();
		classes.add(classRoom);
	}

	public int findClassRoom(ClassRoom classRoom) {
		if (classRoom == null)
			throw new IllegalClassRoomException();
		for (int i = 0; i < classes.size(); i++) {
			if (classes.get(i).equals(classRoom))
				return i;
		}
		return -1;
	}

	public ClassRoom findClassRoom(int index) {
		if (index < 0 || index > classes.size())
			throw new IllegalArgumentException();
		return classes.get(index);
	}

	public void removeClassRoom(ClassRoom classRoom) {
		int index = findClassRoom(classRoom);
		classes.remove(index);
	}

	public String getInfo() {
		String info = "This School has " + classes.size() + " classes.";
		return info;
	}
}
