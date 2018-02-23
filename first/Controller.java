import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{

	View view;
	
	String statee;
	
	ViewMiddle viewM;

	public Controller () {
		
		statee = "main";

		view = new View(this);
		viewM = new ViewMiddle(this, view, getStatee());
		view.revalidate();
		
		try {
			for (int i = 0; i < 12; i++) {
				
				viewM.getGridBtn()[i].addActionListener(this);
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {if(e.getSource() == viewM.getGridBtn()[0]){
				if(statee.equals("main")) {
					setStatee("select");

					viewM.getMiddle().removeAll();
					view.repaint();
					view.revalidate();
					viewM = new ViewMiddle(this, view, statee);
					view.repaint();
					view.revalidate();
					System.err.println("1");
					return;
				}
				
				System.err.println("2");
				
				if(statee.equals("select")) {
					System.err.println("3");
					setStatee("AG");

					viewM.getMiddle().removeAll();
					view.repaint();
					view.revalidate();
					viewM = new ViewMiddle(this, view, statee);
					view.revalidate();
					view.repaint();
					view.revalidate();
					System.err.println("4");
					return;
				}
				
				
			
				}} catch (ArrayIndexOutOfBoundsException e1) {}
		
		try {if(e.getSource() == viewM.getGridBtn()[1]){
			//view.getViewM().remove(view.getViewM().getMiddleCenter());
			
			System.err.println("sadsad");
			}} catch (ArrayIndexOutOfBoundsException e1) {}

//		try {if(e.getSource() == view.getViewM().getGridBtn()[2]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[3]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[4]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[5]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[6]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[7]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[8]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[9]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[10]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
//		
//		try {if(e.getSource() == view.getViewM().getGridBtn()[11]){
//			System.err.println("sadsad");
//			}} catch (ArrayIndexOutOfBoundsException e1) {}
	}
	
	public String getStatee() {
		return statee;
	}


	public void setStatee(String statee) {
		this.statee = statee;
	}

}
