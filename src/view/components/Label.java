package view.components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Label implements FrameComponent {

	private JLabel label;

	public Label(int x, int y, int xSize, int ySize, String text, int fontSize, int red, int green, int blue) {
		label = new JLabel();
		label.setBounds(x,y,xSize,ySize);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setText(text);
		label.setFont(new Font("Impact", Font.PLAIN, fontSize));
		label.setForeground(new Color(red,green,blue));
		
//		label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
	}

	public JLabel getJComponent() {
		return label;
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}
}
