import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class SchoolInfoEvent implements ActionListener {

	private GUI gui;
	private School school;

	public SchoolInfoEvent(GUI g, School s) {
		this.gui = g;
		this.school = s;
	}

	public void actionPerformed(ActionEvent e) {
		GUI g = new GUI(false, 800, 500, gui.getAccountLogged());
		Label l = new Label(school.getInfo());
		TextArea text = new TextArea(10, 100);
		CSVReader fr = new CSVReader("allEntity.csv");
		ArrayList<String[]> entities;
		try {
			entities = fr.parseCSV();
		} catch (IOException e1) {
			return;
		}
		for (String[] s : entities) {
			for (String str : s) {
				text.append(str + "\t");
			}
			text.append("\n");
		}
		g.add(l);
		g.add(text);
	}

}
