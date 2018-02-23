

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{

		ViewM viewM;
	
		private Controller cntr;
		public JPanel top,left,right,bottom,middle,middleCenter;
		private JButton shuffle,previous,play,next,repeate;
		public JLabel myLabel;
		private JTextField letterField;

		public View (Controller cntr)
		{
			
			this.cntr = cntr;
			this.setSize(1200,800);
			this.setVisible(true);
			this.setLocation(0, 100);
			this.setTitle("HCI");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			layoutComponents();
			
			
		}


		public void layoutComponents()
		{
			
			

			left = new JPanel();
			left.setBackground(Color.GRAY);

			add(left,BorderLayout.WEST);


			right = new JPanel();
			right.setBackground(Color.GRAY);
			add(right,BorderLayout.EAST);

			layoutTop();
			layoutBottom();
			layoutMiddle();
			top.setVisible(true);
			
			
			
		}
		

		private void layoutTop()
		{

			top = new JPanel();
			top.setBackground(Color.GRAY);
			letterField = new JTextField(20);
			top.add(letterField);
			
			add(top,BorderLayout.NORTH);
			top.setVisible(false);
			
		}
		
		private void layoutMiddle()
		{
			
		}


		private void layoutBottom()
		{

			bottom = new JPanel();
			bottom.setBackground(Color.GRAY);

			myLabel = new JLabel("Song - artist");
			bottom.add(myLabel);

			
			shuffle = new JButton("Shuffle");
			previous = new JButton("<<");
			play = new JButton("Pause");
			next = new JButton(">>");
			repeate = new JButton("Repeat");
			
			bottom.add(shuffle);
			bottom.add(previous);
			bottom.add(play);
			bottom.add(next);
			bottom.add(repeate);


			JLabel label1 = new JLabel("3:40");
			bottom.add(label1);

			add(bottom,BorderLayout.SOUTH);

		}
		
		
		public ViewM getViewM() {
			return viewM;
		}


		public JTextField getLetterField() {
			return letterField;
		}


		public void setLetterField(JTextField letterField) {
			this.letterField = letterField;
		}

		
		
}
