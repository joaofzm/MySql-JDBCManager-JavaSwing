package view.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import view.components.Button;
import view.components.Label;
import view.components.Panel;

public class DeleteMainPanel implements ActionListener {

	private Panel panel;

	public Panel getPanel() {
		return panel;
	}

	private JLabel bg;

	private Button deletePlayerButton;
	private Button deleteTeamButton;
	private Button updateButton;
	private Button deleteButton;
	private Button returnButton;

	private Label logo;

	private JFrame frame;

	public DeleteMainPanel(JFrame frame) {

		this.frame = frame;

		panel = new Panel(1280, 720);
		
		logo = new Label(30,30,1280,80,"DELETE",40,20,20,20);
		panel.add(logo);

		deletePlayerButton = new Button(522, 150, 276, 80, "DELETE PLAYER", 20, 20, 20);
		deletePlayerButton.getJComponent().addActionListener(this);
		panel.add(deletePlayerButton);

		deleteTeamButton = new Button(522, 250, 276, 80, "DELETE TEAM", 20, 20, 20);
		deleteTeamButton.getJComponent().addActionListener(this);
		panel.add(deleteTeamButton);

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

		if (e.getSource() == deletePlayerButton.getJComponent()) {
			
		}

		if (e.getSource() == deleteTeamButton.getJComponent()) {
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