package view.panels;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.components.Button;
import view.components.Panel;

public class MenuPanel implements ActionListener {

	private Panel panel;

	public Panel getPanel() {
		return panel;
	}

	private JLabel bg;

	private Button consultButton;
	private Button insertButton;
	private Button updateButton;
	private Button deleteButton;
	private Button exitButton;

	private Label logo;

	private JFrame frame;

	public MenuPanel(JFrame frame) {

		this.frame = frame;

		panel = new Panel(1280, 720);

		consultButton = new Button(522, 150, 276, 80, "CONSULT", 20, 20, 20);
		consultButton.getJComponent().addActionListener(this);
		panel.add(consultButton);

		insertButton = new Button(522, 250, 276, 80, "INSERT", 20, 20, 20);
		insertButton.getJComponent().addActionListener(this);
		panel.add(insertButton);

		updateButton = new Button(522, 350, 276, 80, "UPDATE", 20, 20, 20);
		updateButton.getJComponent().addActionListener(this);
		panel.add(updateButton);

		deleteButton = new Button(522, 450, 276, 80, "DELETE", 20, 20, 20);
		deleteButton.getJComponent().addActionListener(this);
		panel.add(deleteButton);

		exitButton = new Button(522, 550, 276, 80, "EXIT", 20, 20, 20);
		exitButton.getJComponent().addActionListener(this);
		panel.add(exitButton);

		bg = new JLabel();
		bg.setSize(1280, 720);
		bg.setBackground(Color.black);
		
		panel.getJComponent().add(bg);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == consultButton.getJComponent()) {
			
		}

		if (e.getSource() == insertButton.getJComponent()) {
		}

		if (e.getSource() == deleteButton.getJComponent()) {
		}

		if (e.getSource() == exitButton.getJComponent()) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}

}