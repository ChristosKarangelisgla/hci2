import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Player extends JFrame{
	
	Controller contr;
	
	String state;
	private JPanel middle,middleCenter;
	public JButton backBtn;
	public JLabel label;
	
	public Player(Controller contr) {
		
		this.contr = contr;
		layoutMiddle();
	
	}
	
	public void layoutMiddle()
	{

		
		label = new JLabel("Song Playing");
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		backBtn = new JButton("Back");
		backBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		//JLabel label = new JLabel("Player");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(2,3));
		middleCenter.add(label);
		middleCenter.add(backBtn);


		middle.add(middleTop,BorderLayout.NORTH);
		middle.add(middleCenter,BorderLayout.CENTER);
		

	}
	
	
	public JPanel getMiddle() {
		return middle;
	}

}