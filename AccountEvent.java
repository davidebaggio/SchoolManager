import java.awt.*;
import java.awt.event.*;

public class AccountEvent implements ActionListener {

	private GUI gui;

	public AccountEvent(GUI gui) {
		this.gui = gui;
	}

	public void actionPerformed(ActionEvent e) {
		GUI g = new GUI(false, 200, 200, gui.getAccountLogged());
		Button b = new Button("Log");
		b.addActionListener(new ButtonPressedEvent(gui, g));
		g.add(b);
	}

}
