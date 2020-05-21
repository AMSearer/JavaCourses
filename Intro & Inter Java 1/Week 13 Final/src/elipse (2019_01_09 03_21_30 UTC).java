import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class elipse {
	
	public class ellipseComp extends JComponent{
		public void paintComponent(java.awt.Graphics g) {
			g.fillRect(5, 5, 150, 200);
		}
	}
	
	
	public static void main(String args[]) {
		JFrame elipFrame = new JFrame();
		elipFrame.setSize(300, 400);
		elipFrame.setTitle("Ellipse");
		elipFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent elip = new ellipseComp();
		elipFrame.add(elip);
		
		elipFrame.setVisible(true);
		
		
	}

}
