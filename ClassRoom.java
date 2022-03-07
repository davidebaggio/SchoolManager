import java.util.ArrayList;

public class ClassRoom implements Section {
	private ArrayList<Entity> entities = new ArrayList<Entity>();
	private int size;
	private int assignedRoom;

	public ClassRoom(int assignedRoom) {
		this.assignedRoom = assignedRoom;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size <= 0;
	}

	public int getAssignedRoom() {
		return assignedRoom;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void addEntity(Entity entity) {
		if (entity == null)
			throw new IllegalEntityException();
		if (entity instanceof Teacher) {
			entities.add(0, entity);
			this.size++;
		} else if (entity instanceof Student) {
			entities.add(entity);
			this.size++;
		} else
			throw new IllegalEntityException();
	}

	public int findEntity(Entity entity) {
		if (entity == null)
			throw new IllegalEntityException();
		for (int i = 0; i < entities.size(); i++) {
			if (entities.get(i).equals(entity))
				return i;
		}
		return -1;
	}

	public void removeEntity(Entity entity) {
		int index = findEntity(entity);
		if (index < 0)
			return;
		else
			entities.remove(index);
		this.size--;
	}

	public ArrayList<Teacher> getTeachers() {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		for (Entity e : entities) {
			if (e instanceof Teacher)
				teachers.add((Teacher) e);
		}
		return teachers;
	}

	public ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		for (Entity e : entities) {
			if (e instanceof Student)
				students.add((Student) e);
		}
		return students;
	}
}
