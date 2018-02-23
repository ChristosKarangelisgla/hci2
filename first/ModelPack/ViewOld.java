package ModelPack;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewOld extends JFrame {

	private JTextArea area;
	private MenuBar mbar;
	
	//ViewFIle
	private Menu fileM;
	private MenuItem fileItemNew,fileItemOpen,fileItemSaveAs,fileItemExit;
	
	//ViewFontStyle
	private Menu fontStyleMenu;
	private MenuItem fontStyleMenuItem1,fontStyleMenuItem2;
	
	//ViewFormat
	private Menu formatMenu,typefaceMenu,sizeMenu,colourMenu;
	private MenuItem typefaceMenuItem1,typefaceMenuItem2,typefaceMenuItem3,typefaceMenuItem4;
	private MenuItem sizeMenuItem1,sizeMenuItem2,sizeMenuItem3,sizeMenuItem4;
	private MenuItem colorMenuItem1,colorMenuItem2,colorMenuItem3,colorMenuItem4;

	

	public ViewOld() 
	{

		this.setSize(800,700);
		this.setVisible(true);
		this.setTitle("Untitled-Notepad");

		area = new JTextArea(20,20);

		area.setFont(new Font("Monospaced",Font.PLAIN,12));
		JScrollPane scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(scroll,BorderLayout.CENTER);

		mbar=new MenuBar();
		setMenuBar(mbar);
		
		//VewFile
		fileM=new Menu("File");
		fileM.add(fileItemNew=new MenuItem("New..."));
		fileM.add(fileItemOpen=new MenuItem("Open"));
		fileM.add(fileItemSaveAs=new MenuItem("Save As..."));
		fileM.add(fileItemExit=new MenuItem("Exit"));
		mbar.add(fileM);
		
		//ViewFontStyle
		fontStyleMenu=new Menu("Font Styles");
		
		fontStyleMenu.add(fontStyleMenuItem1=new MenuItem("Save FontStyle"));
		fontStyleMenu.add(fontStyleMenuItem2=new MenuItem("Load FontStyle"));
		
		//ViewFormat
		formatMenu=new Menu("Format");
		typefaceMenu=new Menu("Font");
		sizeMenu=new Menu("Size");
		colourMenu=new Menu("Colour");
		
		formatMenu.add(typefaceMenu);
		formatMenu.add(sizeMenu);
		formatMenu.add(colourMenu);

		typefaceMenu.add(typefaceMenuItem1=new MenuItem("Courier"));
		typefaceMenu.add(typefaceMenuItem2=new MenuItem("Palatino Linotype"));
		typefaceMenu.add(typefaceMenuItem3=new MenuItem("Prestige Elite Std"));
		typefaceMenu.add(typefaceMenuItem4=new MenuItem("Lucida Handwriting"));


		sizeMenu.add(sizeMenuItem1=new MenuItem("12"));
		sizeMenu.add(sizeMenuItem2=new MenuItem("14"));
		sizeMenu.add(sizeMenuItem3=new MenuItem("18"));
		sizeMenu.add(sizeMenuItem4=new MenuItem("20"));

		colourMenu.add(colorMenuItem1=new MenuItem("Black"));
		colourMenu.add(colorMenuItem2=new MenuItem("Red"));
		colourMenu.add(colorMenuItem3=new MenuItem("Blue"));
		colourMenu.add(colorMenuItem4=new MenuItem("Green"));

		mbar.add(formatMenu);
		mbar.add(fontStyleMenu);
		
	}

	public void changeFontStyle(Font font) {

	
		area.setFont(font);
	}
	
	public void changeColor(Color color) {
		area.setForeground(color);
	}

	public JTextArea getArea() {
		return area;
	}

	public MenuBar getMenuBar() {
		System.err.println("WHAT?");
		return mbar;
	}
	
	//ViewFile
	public MenuItem getFileItemNew() {
		return fileItemNew;
	}

	public MenuItem getFileItemOpen() {
		return fileItemOpen;
	}

	public MenuItem getFileItemSaveAs() {
		return fileItemSaveAs;
	}

	public MenuItem getFileItemExit() {
		return fileItemExit;
	}
	
	
	//ViewFontStyle
	
	public MenuItem getFontStyleMenuItem1() {
		return fontStyleMenuItem1;
	}

	public MenuItem getFontStyleMenuItem2() {
		return fontStyleMenuItem2;
	}
	
	//ViewFormat
	public MenuItem getSizeMenuItem1() {
		return sizeMenuItem1;
	}

	public MenuItem getSizeMenuItem2() {
		return sizeMenuItem2;
	}

	public MenuItem getSizeMenuItem3() {
		return sizeMenuItem3;
	}

	public MenuItem getSizeMenuItem4() {
		return sizeMenuItem4;
	}
	
	//color
	
	public MenuItem getColorMenuItem1() {
		return colorMenuItem1;
	}

	public MenuItem getColorMenuItem2() {
		return colorMenuItem2;
	}

	public MenuItem getColorMenuItem3() {
		return colorMenuItem3;
	}

	public MenuItem getColorMenuItem4() {
		return colorMenuItem4;
	}
	
	//font
	
	public MenuItem getTypeface1() {
		return typefaceMenuItem1;
	}

	public MenuItem getTypeface2() {
		return typefaceMenuItem2;
	}

	public MenuItem getTypeface3() {
		return typefaceMenuItem3;
	}

	public MenuItem getTypeface4() {
		return typefaceMenuItem4;
	}
	
	
}
