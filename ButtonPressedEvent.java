import java.awt.*;
import java.awt.event.*;

public class ButtonPressedEvent implements ActionListener {

	private GUI gui;

	public ButtonPressedEvent(GUI gui) {
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!gui.getAccountLogged()) {
			gui.setAccountLogged(true);
			Label l = new Label("Logged in!");
			gui.add(l);
		} else {
			gui.setAccountLogged(false);
			Label l = new Label("Logged out!");
			gui.add(l);
		}
	}

}
