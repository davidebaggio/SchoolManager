import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame {

	private int width, height;
	private boolean accountLogged;

	private MenuBar menuBar;
	private Menu fileMenu;
	private Menu settingsMenu;
	private Menu schoolInfoMenu;
	private Menu registerEntityMenu;

	public GUI(boolean isMainGUI, int width, int height, boolean logged) {

		this.accountLogged = logged;
		this.width = width;
		this.height = height;

		setWindowsSettings(isMainGUI);

		if (isMainGUI)
			setMenuBarFunction();

	}

	public void setAccountLogged(boolean accountLogged) {
		this.accountLogged = accountLogged;
	}

	public boolean getAccountLogged() {
		return this.accountLogged;
	}

	public void setWindowsSettings(boolean isMainGUI) {
		setLayout(new FlowLayout());
		setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		setTitle("School Manager");
		setSize(width, height);
		setVisible(true);
		setResizable(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				if (isMainGUI)
					System.exit(0);
				else
					setVisible(false);
			}
		});
	}

	public void setMenuBarFunction() {
		menuBar = new MenuBar();

		fileMenu = new Menu("|File|");
		fileMenu.add(new MenuItem("Account"));
		fileMenu.add(new MenuItem("Exit"));
		fileMenu.getItem(0).addActionListener(new AccountEvent(this));
		fileMenu.getItem(1).addActionListener(new ExitMenuEvent());

		settingsMenu = new Menu("|Settings|");

		schoolInfoMenu = new Menu("|School Info|");
		schoolInfoMenu.add(new MenuItem("Info"));
		schoolInfoMenu.getItem(0).addActionListener(new SchoolInfoEvent(this, new School()));

		registerEntityMenu = new Menu("|Register Entity|");
		registerEntityMenu.add(new MenuItem("Register Student"));
		registerEntityMenu.add(new MenuItem("Register Teacher"));
		registerEntityMenu.add(new MenuItem("Register Secretarian"));
		registerEntityMenu.add(new MenuItem("Register ATA"));
		for (int i = 0; i < 4; i++)
			registerEntityMenu.getItem(i).addActionListener(new RegisterGUIEvent(this, null));

		menuBar.add(fileMenu);
		menuBar.add(settingsMenu);
		menuBar.add(schoolInfoMenu);
		menuBar.add(registerEntityMenu);

		setMenuBar(menuBar);
	}

}