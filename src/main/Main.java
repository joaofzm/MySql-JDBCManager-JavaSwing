package main;

import view.components.Frame;
import view.panels.MenuPanel;

public class Main {
	public static void main(String[] args) {
		Frame frame = new Frame(1280, 720);
		MenuPanel initialPanel = new MenuPanel(frame.getJFrame());
		frame.getJFrame().getContentPane().removeAll();
		frame.getJFrame().getContentPane().add(initialPanel.getPanel().getJComponent());
		frame.getJFrame().revalidate();
		initialPanel.getPanel().getJComponent().repaint();
	}
}
