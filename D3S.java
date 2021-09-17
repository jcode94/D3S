import javax.swing.*;
import java.awt.*;

class D3S
{
	private static JMenuBar createJMenuBar()
	{

		String [] fileMenuOptions = {"New", "Open", "Save", "Print", "Save"};
		String [] helpMenuOptions = {"Options", "Settings", "About"};

		// Create Menu Bar
		JMenuBar menuBar = new JMenuBar();

		// Create File Menu
		JMenu fileMenu = new JMenu("File");
		for (String fileOption : fileMenuOptions)
			fileMenu.add(new JMenuItem(fileOption));

		// Create Help Menu
		JMenu helpMenu = new JMenu("Help");
		for (String helpOption : helpMenuOptions)
			helpMenu.add(new JMenuItem(helpOption));

		// Add menus to menubar
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		return menuBar;
	}

	private static void createAndShowGui()
	{
		// Resource aggregation
		JFrame frame = new JFrame("D3S");
		ImageIcon icon = new ImageIcon("Icon256x256.png");

		// JFrame Configuration
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(350, 400));
		frame.setIconImage(icon.getImage());
		frame.setJMenuBar(createJMenuBar());

		// JFrame main pane and professional pane accessories
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		pane.setBackground(new Color(28, 101, 119));

		frame.setContentPane(pane);

		// Follow the following model for adding lightweight components:
		//
		// 		pane.add(theComponent, constraints);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String [] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				createAndShowGui();
			}
		});
	}
}
