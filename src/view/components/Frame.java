package view.components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;


public class Frame {

	private JFrame frame;

	public JFrame getJFrame() {
		return frame;
	}

	public Frame(int x, int y) {
		frame = new JFrame();

		frame.setLayout(null);
		frame.setSize(x, y);
		frame.setMinimumSize(new Dimension(x, y));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
//		ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource("windowIcon.jpg"));
//		frame.setIconImage(windowIcon.getImage());
		frame.setTitle("NBA - DataBase Manager");
		frame.setResizable(false);
		frame.pack();
		
		frame.add(new Button(50, 50, 50, 50, "Test", 20, 20, 20).getJComponent());
		
		
		frame.setVisible(true);
	}

}
