import java.awt.event.*;

public class newGUIEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		new GUI(false, 800, 450, true);
	}
}
