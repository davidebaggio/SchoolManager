import java.awt.*;
import java.awt.event.*;

public class ButtonPressedEvent implements ActionListener {

	private GUI mainGui;
	private GUI gui;

	public ButtonPressedEvent(GUI mainGui, GUI gui) {
		this.mainGui = mainGui;
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!mainGui.getAccountLogged()) {
			mainGui.setAccountLogged(true);
			Label l = new Label("Logged in!");
			gui.add(l);
		} else {
			mainGui.setAccountLogged(false);
			Label l = new Label("Logged out!");
			gui.add(l);
		}
	}

}
