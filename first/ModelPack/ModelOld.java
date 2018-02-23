package ModelPack;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ModelOld {

	private ViewOld view;
	
	//ModelFile
	private String textContext;
	private FileDialog dialog;
	private boolean newTxt;
	private boolean changed;
	private FileReader reader;
	private FileWriter writer;
	File path;

	//ModelFormat
	private String typefaceText;
	private int sizeText;
	private Color colorText;
	
	private Font font;
	
	
	public ModelOld(ViewOld view) {
		
		this.view = view;

		
	}
	
	public void updateFont(Font font) {
		view.changeFontStyle(font);
	}
	
	public void updateColor(Color color) {
		System.err.println("TEST3");
		view.changeColor(color);
	}

	
	
	//ModelFile
	public void newFile() {

		int response = 0;

		if (!changed) {
			response = 1;
		} else if (newTxt) {
			System.err.println("new True");
			String[] options = new String[] { "Yes", "No", "Cancel" };
			response = JOptionPane.showOptionDialog(null, "Do you want to save changes to Untitled", "Title",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		} else {
			System.err.println("new False");
			String[] options = new String[] { "Yes", "No", "Cancel" };
			response = JOptionPane.showOptionDialog(null,
					"Do you want to save changes to \n" + dialog.getDirectory() + dialog.getFile(), "Title",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		}

		switch (response) {
		case 0:
			saveAs();
			view.getArea().setText("");
			view.setTitle("Untitled-Notepad");
			changed = false;
			break;
		case 1:
			view.getArea().setText("");
			view.setTitle("Untitled-Notepad");
			changed = false;
			break;
		default:
			;
			break;
		}
		System.err.println("NEW");
		
	}

	public void open() {
		boolean firstLine = true;

		dialog = new FileDialog(view, "Open");
		dialog.setVisible(true);

		File path = new File(dialog.getDirectory() + dialog.getFile());
		try {
			reader = new FileReader(path);
			// create a Scanner object from the reader

			Scanner in = new Scanner(reader);
			while (in.hasNextLine()) { // more lines to read
				// read next line from the input file
				String line = in.nextLine();
				if (firstLine) {
					textContext += line;
					firstLine = false;
				} else {
					textContext += "\n" + line;
				}
			}
			reader.close();
		} catch (IOException ex) {
			// Problem with the file
		}

		if (dialog.getFile() != null) {
			view.getArea().setText(textContext);
			textContext = "";
			view.setTitle(dialog.getFile());
			newTxt = false;
		}
		System.err.println("OPEN");
	}

	public void saveAs() {

		dialog = new FileDialog(view, "Save As", FileDialog.SAVE);
		dialog.setVisible(true);

		path = new File(dialog.getDirectory() + dialog.getFile() + ".txt");
		try {
			FileWriter writer = new FileWriter(path);

			writer.write(view.getArea().getText());
			writer.close();
		} catch (IOException ex) {
			// Problem with the file
		}
		System.err.println("SAVE AS");
	}

	public void exit() {
		System.exit(0);
		System.err.println("EXIT");
	}
	
	
	//ModelFormat
	
	public Font font() {
		font = new Font(getTypefaceText(), Font.PLAIN, getSizeText());
		return font;
	}

	public void changeSize(String size) {

		if (size.equals("12"))
			setSizeText(12);
		else if (size.equals("14"))
			setSizeText(14);
		else if (size.equals("18"))
			setSizeText(18);
		else if (size.equals("14"))
			setSizeText(20);
		
		
		updateFont(font());
	}

	//color

	public void changeColor(String color) {

		if (color.equals("BLACK"))
			setColorText(Color.BLACK);
		else if (color.equals("RED"))
			setColorText(Color.RED);
		else if (color.equals("BLUE"))
			setColorText(Color.BLUE);
		else if (color.equals("GREEN"))
			setColorText(Color.GREEN);
		
		
		updateColor(colorText);
	}
	
	
	
	//font
	
	public void changeTypeface(String typeface) {
		
		if (typeface.equals("Courier"))
			setFontText("Courier");
		else if (typeface.equals("Palatino"))
			setFontText("Palatino Linotype");
		else if (typeface.equals("Prestige"))
			setFontText("Prestige Elite");
		else if (typeface.equals("Lucida"))
			setFontText("Lucida Handwriting");
		
		updateFont(font());
	}
	
	
	//ModelFontStyle
	public void SaveFontStyle() {
		getColorText();
		getColorText();
		getTypefaceText();
		
	}
	
	public void LoadFontStyle() {
		
		
		Font font = new Font("Courier", Font.PLAIN, 20);
		
		updateFont(font);
		updateColor(Color.YELLOW);
		
	}

	
	
	//getters setters
	
	public String getTypefaceText() {
		return typefaceText;
	}

	public void setFontText(String fontText) {
		this.typefaceText = fontText;
	}

	public int getSizeText() {
		return sizeText;
	}

	public void setSizeText(int sizeText) {
		this.sizeText = sizeText;
	}

	public Color getColorText() {
		return colorText;
	}

	public void setColorText(Color colorText) {
		this.colorText = colorText;
	}

}
