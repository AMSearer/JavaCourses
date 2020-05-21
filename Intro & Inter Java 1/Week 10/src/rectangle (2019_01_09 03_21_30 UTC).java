import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class rectangle {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g.fillRect(0, 0, 150, 200);
	}
	
	
	
	
	public static void main(String args[]) {
		JFrame rectFrame = new JFrame();
		rectFrame.setSize(300, 400);
		rectFrame.setTitle("ReCtaNgLe");
		rectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rectFrame.setVisible(true);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(0, 0, 150, 200);
		rectFrame.add(g);
	}
}
