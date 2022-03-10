import java.awt.*;
import java.awt.event.*;

public class SchoolInfoEvent implements ActionListener {

	private GUI gui;
	private School school;

	public SchoolInfoEvent(GUI g, School s) {
		this.gui = g;
		this.school = s;
	}

	public void actionPerformed(ActionEvent e) {
		GUI g = new GUI(false, 300, 500, gui.getAccountLogged());
		Label l = new Label(school.getInfo());
		g.add(l);
	}

}
