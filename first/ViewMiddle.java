import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewMiddle extends JFrame{
	
	View view;
	
	String state;
	private Controller cntr;
	private JPanel middle,middleCenter;
	private JButton[] gridBtn;
	private JButton gridBtn1;
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
	
	private JPanel panel;
	
	public ViewMiddle (Controller cntr, View view, String state) {
		this.cntr = cntr;
	
		this.view = view;
		
		this.state = state;

		layoutMiddle(state);
		
		System.err.println("new view created");
	
	}
	
	public void layoutMiddle(String state)
	{


		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		JLabel label = new JLabel("Select Letter Category");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(2,3));

		buttonState (state);
		

		middle.add(middleTop,BorderLayout.NORTH);
		middle.add(middleCenter,BorderLayout.CENTER);
		view.add(middle,BorderLayout.CENTER);
		
		
		
	}
	
	public void buttonState (String state) {
			 gridBtn = null;
		
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
