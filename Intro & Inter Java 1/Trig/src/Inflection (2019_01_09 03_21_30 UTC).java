import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
public class Inflection {
	public static void main(String argsl[]) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Inflection");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton button = new JButton("Click Please");
		JLabel label = new JLabel("I'm a label");
		
		ClickListener listen = new ClickListener();
		button.addActionListener(listen);
		
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		
		frame.add(panel);
	
	}

public class ClickListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("I've been clicked!");
	}




}







}
