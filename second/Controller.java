import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener{

	View view;

	String statee;

	ViewM viewM;
	ViewS viewS;
	ViewAG viewAG;
	ViewHN viewHN;
	ViewOU viewOU;
	ViewVZ viewVZ;
	ViewNUM viewNUM;
	ViewSMB viewSMB;
	ListScreen listScreen;
	Model model;
	Player player;


	public Controller () {

		statee = "main";

		view = new View(this);
		viewM = new ViewM();
		view.add(viewM.getMiddle(),BorderLayout.CENTER);
		revalidateView();

		viewS = new ViewS();
		viewAG = new ViewAG();
		viewHN = new ViewHN();
		viewHN = new ViewHN();
		viewOU = new ViewOU();
		viewVZ = new ViewVZ();
		viewNUM = new ViewNUM();
		viewSMB = new ViewSMB();
		listScreen = new ListScreen(this);
		model = new Model(listScreen);
		player = new Player(this);



		for (int i = 0; i < viewM.getBtnText().length; i++) {

			viewM.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewS.getBtnText().length; i++) {

			viewS.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewAG.getBtnText().length; i++) {

			viewAG.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewHN.getBtnText().length; i++) {

			viewHN.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewOU.getBtnText().length; i++) {

			viewOU.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewVZ.getBtnText().length; i++) {

			viewVZ.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewNUM.getBtnText().length; i++) {

			viewNUM.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewSMB.getBtnText().length; i++) {

			viewSMB.getGridBtn()[i].addActionListener(this);

		}

		
		for (int i = 0; i < listScreen.getBtnText().length; i++) {

			listScreen.getGridBtn()[i].addActionListener(this);

		}
		
		player.backBtn.addActionListener(this);
		
		 
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		//-------------------------1. MAIN MENU BUTTONS (Artist, Song, Album, Play List, Shuffle, Home)--------------------------------------------------------------

		if(e.getSource() == viewM.getGridBtn()[0]){

			view.remove(viewM.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		
		if(e.getSource() == viewM.getGridBtn()[1]){

			view.remove(viewM.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		
		if(e.getSource() == viewM.getGridBtn()[2]){

			view.remove(viewM.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		

		//--------------------------2. SELLECTION BUTTONS--------------------------------------------------------------


		//AH category
		if(e.getSource() == viewS.getGridBtn()[0]){

			view.remove(viewS.getMiddle());

			view.add(viewAG.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//HN category
		if(e.getSource() == viewS.getGridBtn()[1]){

			view.remove(viewS.getMiddle());

			view.add(viewHN.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}



		//OU category
		if(e.getSource() == viewS.getGridBtn()[2]){

			view.remove(viewS.getMiddle());

			view.add(viewOU.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//VZ category
		if(e.getSource() == viewS.getGridBtn()[3]){

			view.remove(viewS.getMiddle());

			view.add(viewVZ.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//NUM category
		if(e.getSource() == viewS.getGridBtn()[4]){

			view.remove(viewS.getMiddle());

			view.add(viewNUM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//SMB category
		if(e.getSource() == viewS.getGridBtn()[5]){

			view.remove(viewS.getMiddle());

			view.add(viewSMB.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//Return
		if(e.getSource() == viewS.getGridBtn()[6]){

			view.remove(viewS.getMiddle());

			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//Back
		if(e.getSource() == viewS.getGridBtn()[7]){

			view.remove(viewS.getMiddle());

			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}






		//---------------------------3. AG CATEGORY BUTTONS--------------------------------------------------------------

		
		if(e.getSource() == viewAG.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "A");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			System.err.println(view.getLetterField().getText());
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "B");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		if(e.getSource() == viewAG.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "C");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "D");
			
			view.remove(viewAG.getMiddle());
			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "E");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[5]){

			view.getLetterField().setText(view.getLetterField().getText() + "F");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[6]){

			view.getLetterField().setText(view.getLetterField().getText() + "G");
			
			view.remove(viewAG.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
			
		}
		
		if(e.getSource() == viewAG.getGridBtn()[7]){

			view.remove(viewAG.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


//		//---------------------------4 HN CATEGORY BUTTONS--------------------------------------------------------------

		if(e.getSource() == viewHN.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "H");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "I");
			
			view.remove(viewHN.getMiddle());
			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "J");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		
		if(e.getSource() == viewHN.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "K");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "L");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[5]){

			view.getLetterField().setText(view.getLetterField().getText() + "M");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[6]){

			view.getLetterField().setText(view.getLetterField().getText() + "N");
			
			view.remove(viewHN.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewHN.getGridBtn()[7]){

			view.remove(viewHN.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			
		}


//		//---------------------------5 OU CATEGORY BUTTONS--------------------------------------------------------------
		
		if(e.getSource() == viewOU.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "O");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewOU.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "P");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewOU.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "Q");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		
		if(e.getSource() == viewOU.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "R");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewOU.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "S");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewOU.getGridBtn()[5]){

			view.getLetterField().setText(view.getLetterField().getText() + "T");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewOU.getGridBtn()[6]){

			view.getLetterField().setText(view.getLetterField().getText() + "U");
			
			view.remove(viewOU.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		if(e.getSource() == viewOU.getGridBtn()[7]){

			view.remove(viewOU.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}



//		//---------------------------6 VZ CATEGORY BUTTONS--------------------------------------------------------------

		if(e.getSource() == viewVZ.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "V");
			
			view.remove(viewVZ.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewVZ.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "W");
			
			view.remove(viewVZ.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewVZ.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "X");
			
			view.remove(viewVZ.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		
		if(e.getSource() == viewVZ.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "Y");
			
			view.remove(viewVZ.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewVZ.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "Z");
			
			view.remove(viewVZ.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewVZ.getGridBtn()[5]){

			view.remove(viewVZ.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


//		//---------------------------7 NUM CATEGORY BUTTONS--------------------------------------------------------------
		if(e.getSource() == viewNUM.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "1");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewNUM.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "2");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewNUM.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "3");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		
		if(e.getSource() == viewNUM.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "4");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewNUM.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "5");
			
			view.remove(viewNUM.getMiddle());
			model.findLetter(view.getLetterField().getText(), 0); 

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewNUM.getGridBtn()[5]){

			view.getLetterField().setText(view.getLetterField().getText() + "6");
			
			view.remove(viewNUM.getMiddle());
			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewNUM.getGridBtn()[6]){

			view.getLetterField().setText(view.getLetterField().getText() + "7");
			
			view.remove(viewNUM.getMiddle());
			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		
		if(e.getSource() == viewNUM.getGridBtn()[7]){

			view.getLetterField().setText(view.getLetterField().getText() + "8");
			
			view.remove(viewNUM.getMiddle());
			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		
		if(e.getSource() == viewNUM.getGridBtn()[8]){

			view.getLetterField().setText(view.getLetterField().getText() + "9");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		if(e.getSource() == viewNUM.getGridBtn()[9]){

			view.getLetterField().setText(view.getLetterField().getText() + "0");
			
			view.remove(viewNUM.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		if(e.getSource() == viewNUM.getGridBtn()[10]){

			view.remove(viewNUM.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


//		//---------------------------8 SMB CATEGORY BUTTONS

		if(e.getSource() == viewSMB.getGridBtn()[0]){

			view.getLetterField().setText(view.getLetterField().getText() + "!");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);

			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewSMB.getGridBtn()[1]){

			view.getLetterField().setText(view.getLetterField().getText() + "@");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		if(e.getSource() == viewSMB.getGridBtn()[2]){

			view.getLetterField().setText(view.getLetterField().getText() + "#");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		
		if(e.getSource() == viewSMB.getGridBtn()[3]){

			view.getLetterField().setText(view.getLetterField().getText() + "$");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewSMB.getGridBtn()[4]){

			view.getLetterField().setText(view.getLetterField().getText() + "%");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewSMB.getGridBtn()[5]){

			view.getLetterField().setText(view.getLetterField().getText() + "/");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}

		
		if(e.getSource() == viewSMB.getGridBtn()[6]){

			view.getLetterField().setText(view.getLetterField().getText() + "&");
			
			view.remove(viewSMB.getMiddle());

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			model.findLetter(view.getLetterField().getText(), 0); 
		}
		
		
		if(e.getSource() == viewSMB.getGridBtn()[7]){

			view.remove(viewSMB.getMiddle());

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}
		
		//-------------------------------LIST------------------------------
		
		if(e.getSource() == listScreen.getGridBtn()[8]){
			listScreen.middleRight.removeAll();
			view.getLetterField().setText("");
			view.remove(listScreen.getMiddle());

			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
			
		}
		
		
		//--------------Player--------------------------------
		
		
		if(e.getSource() == player.backBtn){
			view.add(view.top);
			view.getLetterField().setText("");
			view.remove(player.getMiddle());
//
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}
	}
	
	
	public void player (String song) {
		listScreen.middleRight.removeAll();
		view.remove(view.top);
		view.remove(listScreen.getMiddle());
		player.label.setText("Playing - " + song);
		revalidateView();
		
		view.add(player.getMiddle(),BorderLayout.CENTER);
		revalidateView();
		
	}



	public void revalidateView() {
		view.revalidate();
		view.repaint();
	}

	public String getStatee() {
		return statee;
	}


	public void setStatee(String statee) {
		this.statee = statee;
	}

}
