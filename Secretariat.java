import java.util.ArrayList;

public class Secretariat implements Section {
	private ArrayList<Entity> operators = new ArrayList<Entity>();
	private int size;

	public Secretariat() {
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size <= 0;
	}

	public void addEntity(Entity entity) {
		if (entity == null)
			throw new IllegalEntityException();
		if (entity instanceof Secretarians) {
			operators.add(0, entity);
			this.size++;
		} else if (entity instanceof ATA) {
			operators.add(entity);
			this.size++;
		} else
			throw new IllegalEntityException();

	}

	public int findEntity(Entity entity) {
		if (entity == null)
			throw new IllegalEntityException();
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i).equals(entity))
				return i;
		}
		return -1;
	}

	public void removeEntity(Entity entity) {
		int index = findEntity(entity);
		if (index < 0)
			return;
		else
			operators.remove(index);
		this.size--;
	}

	public ArrayList<Entity> getEntities() {
		return operators;
	}

	public ArrayList<Secretarians> getSecretarians() {
		ArrayList<Secretarians> secretarians = new ArrayList<Secretarians>();
		for (Entity e : operators) {
			if (e instanceof Secretarians)
				secretarians.add((Secretarians) e);
		}
		return secretarians;
	}

	public ArrayList<ATA> getATA() {
		ArrayList<ATA> ata = new ArrayList<ATA>();
		for (Entity e : operators) {
			if (e instanceof ATA)
				ata.add((ATA) e);
		}
		return ata;
	}
}
