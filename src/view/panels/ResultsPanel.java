package view.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.entties.Player;
import view.components.Button;
import view.components.Label;
import view.components.Panel;

public class ResultsPanel implements ActionListener {

	private Panel panel;

	public Panel getPanel() {
		return panel;
	}

	private JLabel bg;

	private Button returnButton;

	private Label logo;

	private JFrame frame;

	public ResultsPanel(JFrame frame) {

		this.frame = frame;

		panel = new Panel(1280, 720);

		logo = new Label(30, 30, 1280, 80, "SEARCH RESULT", 40, 20, 20, 20);
		panel.add(logo);

		returnButton = new Button(522, 550, 276, 80, "RETURN", 20, 20, 20);
		returnButton.getJComponent().addActionListener(this);
		panel.add(returnButton);

		bg = new JLabel();
		bg.setSize(1280, 720);
		bg.setBackground(Color.black);

		panel.getJComponent().add(bg);

	}

	public void printResults(List<?> list) {
		int y = 100;
		for (Object obj : list) {
			Label label = new Label(30, y, 1280, 30, obj.toString(), 20, 20, 20, 20);
			panel.add(label);
			y += 30;
		}
	}

	public void printResults(Player p) {
		Label label = new Label(30, 100, 1280, 30, p.toString(), 20, 20, 20, 20);
		panel.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == returnButton.getJComponent()) {
			MenuPanel newPanel = new MenuPanel(frame);
			frame.getContentPane().removeAll();
			frame.getContentPane().add(newPanel.getPanel().getJComponent());
			frame.revalidate();
			newPanel.getPanel().getJComponent().repaint();
		}
	}

}