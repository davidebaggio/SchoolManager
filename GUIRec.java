import java.awt.*;
import java.awt.event.*;

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
		setLayout(new FlowLayout());
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
		TextField t = new TextField("Ciao", 30);
		this.add(t);
	}

}
