package com.assignment_5.calculator.windows;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.assignment_5.calculator.panels.AdvancedPanel;
import com.assignment_5.calculator.panels.BasicPanel;
import com.assignment_5.calculator.panels.TextAreaPanel;

import java.util.Stack;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class WindowBasic {
	private Stack<Double> numberStack = new Stack<Double>();
	
	private JFrame frame = new JFrame();
	private BasicPanel numberPanel = new BasicPanel();
	private AdvancedPanel advancedPanel = new AdvancedPanel();
	private TextAreaPanel textAreaPanel= new TextAreaPanel();
	
	
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
	private void initialize() { 
		frame.setBounds(100, 100, 500, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("RPN Calculator");

		textAreaPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		numberPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		advancedPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		frame.getContentPane().add(textAreaPanel);
	    frame.getContentPane().add(numberPanel);
	    frame.getContentPane().add(advancedPanel);
	    frame.getContentPane().add(textAreaPanel);
	    

	    frame.setVisible(true);
	}
}

	


	

