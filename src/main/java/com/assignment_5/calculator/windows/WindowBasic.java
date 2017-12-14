package com.assignment_5.calculator.windows;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.assignment_5.calculator.panels.AdvancedPanel;
import com.assignment_5.calculator.panels.BasicPanel;
import com.assignment_5.calculator.panels.TextAreaPanel;


import java.util.Stack;
import java.awt.ComponentOrientation;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class WindowBasic{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 4457067577056812423L;

	private Stack<Double> numberStack = new Stack<Double>();
	private TextAreaPanel stacks;
	private JFrame frame = new JFrame();
	private BasicPanel basicPanel = new BasicPanel(stacks);
	private AdvancedPanel advancedPanel = new AdvancedPanel();
	public TextAreaPanel textAreaPanel = new TextAreaPanel();
	
	

	private double firstNumber;
	private double secondNumber;
	private String numberToInsert = "";
	private double result;	

	
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
		frame.setBounds(100, 100, 500, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");

		textAreaPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		basicPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		advancedPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		frame.getContentPane().add(textAreaPanel);
	    frame.getContentPane().add(basicPanel);
	    frame.getContentPane().add(advancedPanel);
	    
	    frame.setVisible(true);
	}
}
