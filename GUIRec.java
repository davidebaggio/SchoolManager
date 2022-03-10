import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GUIRec extends Frame {

	private GUI gui;
	private int width, height;

	public GUIRec(GUI gui, int width, int height) {
		this.gui = gui;
		this.width = width;
		this.height = height;

		setWindowsSettings();
	}

	public void setWindowsSettings() {
		setLayout(new GridLayout(7, 0));
		setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		setTitle("Register");
		setSize(width, height);
		if (!gui.getAccountLogged()) {
			Label l = new Label("Account not logged");
			add(l);
		} else {
			recordEntityGUI();
		}
		setVisible(true);
		setResizable(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				setVisible(false);
			}
		});
	}

	public void recordEntityGUI() {
		TextField type = new TextField("Type of entity", 30);
		TextField name = new TextField("Name", 30);
		TextField surname = new TextField("Surname", 30);
		TextField birthday = new TextField("BirthDay", 30);
		TextField CF = new TextField("CF", 30);
		TextField birthplace = new TextField("BirthPlace", 30);
		TextField otherInfo = new TextField("Other Info", 30);
		this.add(type);
		this.add(name);
		this.add(surname);
		this.add(birthday);
		this.add(CF);
		this.add(birthplace);
		this.add(otherInfo);

		Button save = new Button("Save Record");
		save.addActionListener(new ActionListener() {
			String[] entity = new String[7];
			CSVWriter fw = new CSVWriter("allEntity.csv");

			public void actionPerformed(ActionEvent e) {
				Label l;
				for (int i = 0; i < getComponentCount() - 1; i++) {
					entity[i] = ((TextField) getComponent(i)).getText();
				}
				try {
					fw.writeParsedSingleEntity(entity);
					l = new Label("Entity saved in the system.");
				} catch (IOException e1) {
					l = new Label("Entity not saved in the system.");
				}
				add(l);
			}
		});
		this.add(save);
	}

}
