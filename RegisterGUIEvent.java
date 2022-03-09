import java.awt.event.*;

public class RegisterGUIEvent implements ActionListener {

	private School school;
	private GUI gui;

	public RegisterGUIEvent(GUI gui, School s) {
		this.school = s;
		this.gui = gui;
	}

	public void actionPerformed(ActionEvent e) {
		new GUIRec(gui, 600, 600);
	}

}
