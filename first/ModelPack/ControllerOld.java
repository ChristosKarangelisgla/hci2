package ModelPack;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerOld implements ActionListener{

	private ViewOld view;
	private ModelOld model;

	public ControllerOld() {

		view = new ViewOld();
		model = new ModelOld(view);

		view.getFileItemNew().addActionListener(this);
		view.getFileItemOpen().addActionListener(this);
		view.getFileItemSaveAs().addActionListener(this);
		view.getFileItemExit().addActionListener(this);

		view.getTypeface1().addActionListener(this);
		view.getTypeface2().addActionListener(this);
		view.getTypeface3().addActionListener(this);
		view.getTypeface4().addActionListener(this);

		view.getColorMenuItem1().addActionListener(this);
		view.getColorMenuItem2().addActionListener(this);
		view.getColorMenuItem3().addActionListener(this);
		view.getColorMenuItem4().addActionListener(this);

		view.getSizeMenuItem1().addActionListener(this);
		view.getSizeMenuItem2().addActionListener(this);
		view.getSizeMenuItem3().addActionListener(this);
		view.getSizeMenuItem4().addActionListener(this);
		
		view.getFontStyleMenuItem1().addActionListener(this);
		view.getFontStyleMenuItem2().addActionListener(this);



	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//File Operations
		if(e.getSource() == view.getFileItemNew())
		{
			model.newFile();
		}


		if(e.getSource() == view.getFileItemOpen())
		{
			model.open();
		}

		if(e.getSource() == view.getFileItemSaveAs())
		{
			model.saveAs();
		}

		if(e.getSource() == view.getFileItemExit())
		{
			model.exit();
		}

		//Typeface Listeners
		if(e.getSource() == view.getTypeface1())
		{
			model.changeTypeface("Courier");
			
		}

		if(e.getSource() == view.getTypeface2())
		{
			model.changeTypeface("Palatino");
		}

		if(e.getSource() == view.getTypeface3())
		{
			model.changeTypeface("Prestige");
		}

		if(e.getSource() == view.getTypeface4())
		{
			model.changeTypeface("Lucida");
		}

		//Size Listeners

		if(e.getSource() == view.getSizeMenuItem1())
		{
			model.changeSize("12");
		}


		if(e.getSource() == view.getSizeMenuItem2())
		{
			model.changeSize("14");
		}

		if(e.getSource() == view.getSizeMenuItem3())
		{
			model.changeSize("18");
		}

		if(e.getSource() == view.getSizeMenuItem4())
		{
			model.changeSize("20");
		}

		//color

		if(e.getSource() == view.getColorMenuItem1())
		{
			model.changeColor("BLACK");
		}

		if(e.getSource() == view.getColorMenuItem2())
		{
			model.changeColor("RED");
		}

		if(e.getSource() == view.getColorMenuItem3())
		{
			model.changeColor("BLUE");
		}

		if(e.getSource() == view.getColorMenuItem4())
		{
			model.changeColor("GREEN");
		}
		
		//font Styling
		
		if(e.getSource() == view.getFontStyleMenuItem1())
		{
			model.SaveFontStyle();
		}

		if(e.getSource() == view.getFontStyleMenuItem2())
		{
			model.LoadFontStyle();
		}

	}
}
