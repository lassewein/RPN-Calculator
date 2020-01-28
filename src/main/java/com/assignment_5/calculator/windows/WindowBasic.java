package com.assignment_5.calculator.windows;

import java.awt.Color;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import com.assignment_5.calculator.panels.AdvancedPanel;
import com.assignment_5.calculator.panels.BasicPanel;
import com.assignment_5.calculator.panels.TextAreaPanel;

public class WindowBasic{

	private Stack<Double> numberStack = new Stack<Double>();
	private TextAreaPanel textArea = new TextAreaPanel();
	private JFrame frame = new JFrame();
	private BasicPanel basicPanel = new BasicPanel(numberStack, textArea);
	private AdvancedPanel advancedPanel = new AdvancedPanel(numberStack, textArea);
	
	/**
	 * Create the application.
	 */
	public WindowBasic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() { 
		frame.setBounds(100, 100, 518, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");

		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		basicPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		advancedPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		
		frame.getContentPane().add(textArea);
	    frame.getContentPane().add(basicPanel);
	    frame.getContentPane().add(advancedPanel);
	    
	    frame.setVisible(true);
	}
}
