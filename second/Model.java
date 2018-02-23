import java.awt.List;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Model {
	String[] artists = {"The Beatles","Michael Jackson","Madonna","Elton John","Led Zeppelin","Pink", 
			"Floyd,Rihanna","Mariah Carey","Celine Dion","Queen","Whitney Houston","AC/DC","The Rolling Stones","ABBA",
			"Taylor Swift","Garth Brooks","Eminem","Eagles","U2","Billy Joel","Phil Collins","Aerosmith","Frank Sinatra",
			"Barbra Streisand","Bruno Mars","Kanye West","Bruce Springsteen","Bee Gees"};

	String[] selectionList;
	String[] tempList;
	ListScreen listScreen;

	public Model(ListScreen listScreen) {
		this.listScreen = listScreen;
	}

	public void findLetter(String letter, int position) {

		tempList = new String[artists.length];
		int z = 0;
		for (int i = 0; i < artists.length; i++) {

			if (letter.equals(String.valueOf(artists[i].charAt(position)))){
				tempList[z] =  artists[i];
				z++;
			}
		}

		selectionList = new String[z];
		for (int i = 0; i < artists.length; i++) {
			if(tempList[i] != null) {
				selectionList[i] = tempList[i];
	
			}
		}
		
		for (int i = 0; i < 8; i++) {
			//System.err.println(selectionList[i].charAt(position+1));
			listScreen.getGridBtn()[i].setText("");

	}
		
		for (int i = 0; i < selectionList.length; i++) {
				//System.err.println(selectionList[i].charAt(position+1));
			char temp = selectionList[i].charAt(position+1);
			listScreen.getGridBtn()[i].setText(Character.toString(temp).toUpperCase());
	
		}
		
		if(z == 0) {
			selectionList = new String[1];
			selectionList[0] = "Item Not Found";
		}
		
		//System.err.println(Arrays.toString(tempList));
		System.err.println(Arrays.toString(selectionList));
		listScreen.createBoxList(selectionList);
	}

	//	public void read() {
	//		boolean firstLine = true;
	//
	//		
	//		File path = 
	//		try {
	//			FileReader reader = new FileReader(path);
	//			// create a Scanner object from the reader
	//
	//			Scanner in = new Scanner(reader);
	//			while (in.hasNextLine()) { // more lines to read
	//				// read next line from the input file
	//				String line = in.nextLine();
	//				
	//			}
	//			reader.close();
	//		} catch (IOException ex) {
	//			// Problem with the file
	//		}
	//
	//		if (dialog.getFile() != null) {
	//			model.getView().getArea().setText(textContext);
	//			textContext = "";
	//			model.getView().setTitle(dialog.getFile());
	//			newTxt = false;
	//		}
	//		System.err.println("OPEN");
	//	}


}
