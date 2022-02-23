package view.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button implements FrameComponent, MouseListener {

	private JButton button;
	public JButton getJComponent() {
		return button;
	}

	public Button(int x, int y, int xSize, int ySize, String text, int red, int green, int blue) {
		button = new JButton();
		button.addMouseListener(this);
		button.setBounds(x,y,xSize,ySize);
		button.setContentAreaFilled(true);
		button.setText(text);
		button.setForeground(new Color(red, green, blue));
		button.setFont(new Font("Impact", Font.PLAIN, 20));
		button.setFocusable(false);
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		button.setBorderPainted(true);
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		button.setForeground(new Color(0,80,255));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		button.setForeground(Color.BLACK);
	}
}
