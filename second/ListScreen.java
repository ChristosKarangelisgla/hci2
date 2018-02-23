import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListScreen extends JFrame{
	
	Controller contr;
	
	String state;
	public JPanel middle,middleCenter, middleleft, middleRight;
	private JButton[] gridBtn;
	private String[] listOfSongs = {"Song1", "Song2", "Song3", "Song4", "Song5"};
	private String[] btnText = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "Back"};
	public JList list;
	//private JComboBox comboBox;
	
	public ListScreen (Controller contr) {
		this.contr = contr;
		layoutMiddle();
		
		

	}
	
	public void layoutMiddle()
	{


		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		JLabel label = new JLabel("List");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(1,2));
		middleRight = new JPanel();
		middleleft = new JPanel();
		 
//		comboBox = new JComboBox(listOfSongs);
		
		gridBtn = new JButton[btnText.length];
		
		
		 
		 //middleCenter.add(scrollableList);
		
		 middleleft.setLayout(new GridLayout(3,3));
		 for (int i = 0; i < btnText.length; i++) {
				
				gridBtn[i] = new JButton(btnText[i]);
				gridBtn[i].setFont(new Font("Arial", Font.PLAIN, 30));
				middleleft.add(gridBtn[i]);
		 }
		 middleCenter.add(middleleft);

		
		middle.add(middleTop,BorderLayout.NORTH);
		middle.add(middleCenter,BorderLayout.CENTER);
		
		
		
		
		middle.revalidate();
	}
	
	
	
	public void createBoxList(String[] theList) {
		
		 list = new JList(theList);
		 JScrollPane scrollableList = new JScrollPane(list);
		 list.setFont(new Font("Arial", Font.PLAIN, 40));
		 list.setFixedCellWidth(500);
		 list.setFixedCellHeight(70);
		 
		 middleRight.add(scrollableList);
		 middleCenter.add(middleRight);
		 middle.revalidate();
		 
		 list.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent evt) {
		         String value = list.getSelectedValue().toString();
		         contr.player(value);
		        }
		  });

		 
		
		
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

	public JPanel getMiddleRight() {
		return middleRight;
	}
	

}