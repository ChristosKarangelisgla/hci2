import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewHN extends JFrame{
	
	
	String state;
	private JPanel middle,middleCenter;
	private JButton[] gridBtn;
	private String[] btnText = new String[]{"H", "I", "J", "K", "L", "M", "N", "Back"};
	
	
	public ViewHN() {
	

		layoutMiddle();

	}
	
	public void layoutMiddle()
	{


		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		JLabel label = new JLabel("Select Letter Category");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(2,3));

		gridBtn = new JButton[btnText.length];
		for (int i = 0; i < btnText.length; i++) {
			
			gridBtn[i] = new JButton(btnText[i]);
			gridBtn[i].setFont(new Font("Arial", Font.PLAIN, 30));
			middleCenter.add(gridBtn[i]);
		}

		middle.add(middleTop,BorderLayout.NORTH);
		middle.add(middleCenter,BorderLayout.CENTER);
		
		
		
	}
	
		
		
	public String[] getBtnText() {
		return btnText;
	}



	public JButton[] getGridBtn() {
		return gridBtn;
	}


	public JPanel getMiddle() {
		return middle;
	}


	public JPanel getMiddleCenter() {
		return middleCenter;
	}
	

}