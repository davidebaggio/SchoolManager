import java.util.ArrayList;

public interface Section {
	int size();

	boolean isEmpty();

	void addEntity(Entity entity);

	int findEntity(Entity entity);

	void removeEntity(Entity entity);

	ArrayList<Entity> getEntities();
}
