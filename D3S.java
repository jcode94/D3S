import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

class D3S
{
	private static JMenuBar createJMenuBar()
	{

		String [] fileMenuOptions = {"New", "Open", "Save", "Print", "Save"};
		String [] helpMenuOptions = {"Options", "Settings", "About"};

		// Create Menu Bar
		JMenuBar menuBar = new JMenuBar();

		// Create menus
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		
		for (String option : fileMenuOptions)
			fileMenu.add(new JMenuItem(option));
			
		for (String option : helpMenuOptions)
			helpMenu.add(new JMenuItem(option));

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

		// JFrame main pane and professional contentPane accessories
		MainPane contentPane = new MainPane();

		frame.setContentPane(contentPane);

		// Follow the following model for adding lightweight components:
		//
		// 		contentPane.add(theComponent, constraints);

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

class MainPane extends JPanel {
	public MainPane() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setBorder(new EmptyBorder(2, 3, 2, 3));
		setBackground(new Color(28, 101, 119));
		
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 5, 5, 5);
		
		add(new JLabel("Label 1"), c);
		c.gridx++;
		
		c.gridx = 1;
		c.gridy++;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(new JTextField(20), c);
		
		c.gridx = 1;
		c.gridy = 2;
		add(new JButton("Button1"), c);		
		
	}
}