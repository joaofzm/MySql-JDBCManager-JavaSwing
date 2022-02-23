package view.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import view.components.Button;
import view.components.Label;
import view.components.Panel;

public class ConsultMainPanel implements ActionListener {

	private Panel panel;

	public Panel getPanel() {
		return panel;
	}

	private JLabel bg;

	private Button findPlayerByIdButton;
	private Button findPlayerByTeamButton;
	private Button findAllPlayersButton;
	
	private Button findTeamById;
	private Button findAllTeams;
	
	private Button returnButton;

	private Label logo;

	private JFrame frame;

	public ConsultMainPanel(JFrame frame) {

		this.frame = frame;

		panel = new Panel(1280, 720);
		
		logo = new Label(30,30,1280,80,"CONSULT",40,20,20,20);
		panel.add(logo);

		findPlayerByIdButton = new Button(522, 150, 276, 50, "FIND PLAYER BY ID", 20, 20, 20);
		findPlayerByIdButton.getJComponent().addActionListener(this);
		panel.add(findPlayerByIdButton);

		findPlayerByTeamButton = new Button(522, 230, 276, 50, "FIND PLAYER BY TEAM", 20, 20, 20);
		findPlayerByTeamButton.getJComponent().addActionListener(this);
		panel.add(findPlayerByTeamButton);

		findAllPlayersButton = new Button(522, 310, 276, 50, "FIND ALL PLAYERS", 20, 20, 20);
		findAllPlayersButton.getJComponent().addActionListener(this);
		panel.add(findAllPlayersButton);
		
		findTeamById = new Button(522, 390, 276, 50, "FIND TEAM BY ID", 20, 20, 20);
		findTeamById.getJComponent().addActionListener(this);
		panel.add(findTeamById);
		
		findAllTeams = new Button(522, 470, 276, 50, "FIND ALL TEAMS", 20, 20, 20);
		findAllTeams.getJComponent().addActionListener(this);
		panel.add(findAllTeams);

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

		if (e.getSource() == findPlayerByIdButton.getJComponent()) {
			
		}

		if (e.getSource() == findPlayerByTeamButton.getJComponent()) {
		}

		if (e.getSource() == findAllPlayersButton.getJComponent()) {
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