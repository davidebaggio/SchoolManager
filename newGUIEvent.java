import java.awt.event.*;

public class newGUIEvent implements ActionListener {

	private GUI gui;

	public newGUIEvent(GUI g) {
		this.gui = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new GUI(false, 800, 450, gui.getAccountLogged());
	}
}
