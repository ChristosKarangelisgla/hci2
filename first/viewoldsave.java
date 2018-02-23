

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class viewoldsave extends JFrame{

		private Controller cntr;
		private JPanel top,left,right,bottom,middle,middleCenter;
		private JButton[] gridBtn;
		private String[] mainBtnText = new String[]{"Artist", "Song", "Album", "Playlist", "Shuffle", "Home"};
		private String[] selectBtnText = new String[]{"A-G", "H-N", "O-U", "V-Z", "Symbols", "Numbers", "Return", "Back"};
		private String[] agBtnText = new String[]{"A", "B", "C", "D", "E", "F", "G", "Back"};
		private String[] hnBtnText = new String[]{"H", "I", "J", "K", "L", "M", "N", "Back"};
		private String[] ouBtnText = new String[]{"O", "P", "Q", "R", "S", "T", "U", "Back"};
		private String[] vzBtnText = new String[]{"V", "W", "X", "Y", "Z", "Back"};
		private String[] sumbolBtnText = new String[]{"!", "@", "#", "$", "%", "/", "&", "Back"};
		private String[] numBtnText = new String[]{"1", "2", "3", "4", "5", "6", "7","8", "9", "0","Back"};
		private JButton shuffle,previous,play,next,repeate;
		private JLabel myLabel;
		private JTextField myField;

		public viewoldsave (Controller cntr)
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
			layoutMiddle();
			layoutBottom();
			top.setVisible(true);
			
		}
		

		private void layoutTop()
		{

			top = new JPanel();
			top.setBackground(Color.GRAY);
			myField = new JTextField(20);
			top.add(myField);
			add(top,BorderLayout.NORTH);
			top.setVisible(false);
			
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

			buttonState (cntr.getStatee());
			

			middle.add(middleTop,BorderLayout.NORTH);
			middle.add(middleCenter,BorderLayout.CENTER);
			add(middle,BorderLayout.CENTER);
			
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
			repeate = new JButton("Repeate");
			
			bottom.add(shuffle);
			bottom.add(previous);
			bottom.add(play);
			bottom.add(next);
			bottom.add(repeate);


			JLabel label1 = new JLabel("3:40");
			bottom.add(label1);

			add(bottom,BorderLayout.SOUTH);

		}
		
		public void buttonState (String state) {
			
			
			if(state.equals("main")) {
				gridBtn = new JButton[mainBtnText.length];
				for (int i = 0; i < mainBtnText.length; i++) {
					
					gridBtn[i] = new JButton(mainBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			if(state.equals("select")) {
				gridBtn = new JButton[selectBtnText.length];
				for (int i = 0; i < selectBtnText.length; i++) {
					
					gridBtn[i] = new JButton(selectBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			if(state.equals("AG")) {
				gridBtn = new JButton[agBtnText.length];
				for (int i = 0; i < agBtnText.length; i++) {
					
					gridBtn[i] = new JButton(agBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			if(state.equals("HN")) {
				gridBtn = new JButton[hnBtnText.length];
				for (int i = 0; i < hnBtnText.length; i++) {
					
					gridBtn[i] = new JButton(hnBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			if(state.equals("OU")) {
				gridBtn = new JButton[ouBtnText.length];
				for (int i = 0; i < ouBtnText.length; i++) {
					
					gridBtn[i] = new JButton(ouBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			if(state.equals("VZ")) {
				gridBtn = new JButton[vzBtnText.length];
				for (int i = 0; i < vzBtnText.length; i++) {
					
					gridBtn[i] = new JButton(vzBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			if(state.equals("symbol")) {
				gridBtn = new JButton[sumbolBtnText.length];
				for (int i = 0; i < sumbolBtnText.length; i++) {
					
					gridBtn[i] = new JButton(sumbolBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			if(state.equals("num")) {
				gridBtn = new JButton[numBtnText.length];
				for (int i = 0; i < numBtnText.length; i++) {
					
					gridBtn[i] = new JButton(numBtnText[i]);
					middleCenter.add(gridBtn[i]);
				}
			}
			
			
			
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
