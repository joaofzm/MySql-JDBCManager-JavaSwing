package view.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import view.components.Button;
import view.components.Label;
import view.components.Panel;

public class UpdateMainPanel implements ActionListener {

	private Panel panel;

	public Panel getPanel() {
		return panel;
	}

	private JLabel bg;

	private Button updatePlayerButton;
	private Button updateTeamButton;
	private Button updateButton;
	private Button deleteButton;
	private Button returnButton;

	private Label logo;

	private JFrame frame;

	public UpdateMainPanel(JFrame frame) {

		this.frame = frame;

		panel = new Panel(1280, 720);
		
		logo = new Label(30,30,1280,80,"UPDATE",40,20,20,20);
		panel.add(logo);

		updatePlayerButton = new Button(522, 150, 276, 80, "UPDATE PLAYER", 20, 20, 20);
		updatePlayerButton.getJComponent().addActionListener(this);
		panel.add(updatePlayerButton);

		updateTeamButton = new Button(522, 250, 276, 80, "UPDATE TEAM", 20, 20, 20);
		updateTeamButton.getJComponent().addActionListener(this);
		panel.add(updateTeamButton);

		returnButton = new Button(522, 550, 276, 80, "RETURN", 20, 20, 20);
		returnButton.getJComponent().addActionListener(this);
		panel.add(returnButton);

		bg = new JLabel();
		bg.setSize(1280, 720);
		bg.setBackground(Color.black);
		
		panel.getJComponent().add(bg);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == updatePlayerButton.getJComponent()) {
			
		}

		if (e.getSource() == updateTeamButton.getJComponent()) {
		}


		if (e.getSource() == returnButton.getJComponent()) {
			MenuPanel newPanel = new MenuPanel(frame);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(newPanel.getPanel().getJComponent());
			frame.revalidate();
			newPanel.getPanel().getJComponent().repaint();
		}
	}

}