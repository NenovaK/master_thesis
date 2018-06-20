package edu.kit.exp.client.gui;

import edu.kit.exp.client.comunication.ClientStatusManager;
import edu.kit.exp.client.gui.screens.Screen;
import edu.kit.exp.common.Constants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Date;

/**
 * This is the class of the main Application window.
 * 
 */
public class MainFrame extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8780788346280812429L;
	public static final String FRAME_TITLE = "brownie Client";
	public static final String LOGO_PATH = "/edu/kit/exp/common/resources/brownie_logo_noname_reverse.png";

	/** The instance. */
	private static MainFrame instance = null;

	/** The content panel. */
	private JPanel contentPanel;

	/** The current screen. */
	private static Screen currentScreen;

	public static Screen getCurrentScreen() {
		return currentScreen;
	}

	/**
	 * This method gets the single instance of MainFrame.
	 * 
	 * @return the single instance of MainFrame
	 */
	public static MainFrame getInstance() {

		if (instance == null) {
			instance = new MainFrame();
		}

		return instance;
	}

	/**
	 * This constructor instantiates a new main frame.
	 */
	private MainFrame() {
		super();
		applyFrameConfiguration();
		if (Constants.isSystemDebugMode()) {
			applyDebugConfiguration();
		} else {
			applyStandardConfiguration();
		}
	}

	private void applyFrameConfiguration() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		currentScreen = null;
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setSize(this.getContentPane().getSize());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		this.setTitle(FRAME_TITLE);
		this.setIconImage(new ImageIcon(MainFrame.class.getResource(LOGO_PATH)).getImage());
	}

	private void applyStandardConfiguration() {
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setUndecorated(true);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.addWindowListener(new WindowClosingAdapter());
	}

	private void applyDebugConfiguration() {
		this.setSize(new Dimension(1280, 1024));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method shows a screen to the client.
	 * 
	 * @param screen
	 *            The {@link edu.kit.exp.client.gui.screens.Screen Screen} to be
	 *            shown.
	 */
	public void showScreen(Screen screen) {
		if (currentScreen != null) {
			exitCurrentScreen();
		}
		currentScreen = screen;
		String simpleName = currentScreen.getClass().getSimpleName();
		ClientStatusManager.getInstance().getClientStatus().setCurrentScreenName(simpleName);

		refreshContentPanel(currentScreen);
	}

	private void refreshContentPanel(Screen screen) {
		contentPanel.removeAll();
		if (screen != null) {
			contentPanel.add(screen, BorderLayout.CENTER);
			Long clientTimeStamp = new Date().getTime();
			if (screen.getLogDisplayEvent() == true && screen.getGameId() != null) {
				ClientGuiController.getInstance().sendTrialLogMessage(screen.getGameId(), screen.getLogTextEnter(), screen.getScreenId(), screen.getLogValueExit(), clientTimeStamp);
			}
			screen.getParameter().setLogTimeEnter(clientTimeStamp);
		}
		contentPanel.revalidate();
		contentPanel.repaint();
	}

	private void exitCurrentScreen() {
		Long clientTimeStamp;
		currentScreen.extiScreen();

		if (currentScreen.getLogDisplayEvent() == true && currentScreen.getGameId() != null) {
			clientTimeStamp = new Date().getTime();
			ClientGuiController.getInstance().sendTrialLogMessage(currentScreen.getGameId(), currentScreen.getLogTextExit(), currentScreen.getScreenId(), currentScreen.getLogValueExit(), clientTimeStamp);
		}
	}

}
