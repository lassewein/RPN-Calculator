package com.assignment_5.calculator.windows;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.assignment_5.calculator.panels.BasicPanel;

import java.util.Stack;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class WindowBasic {
	private Stack<Double> numberStack = new Stack<Double>();
	
	private JFrame frame = new JFrame();
	private BasicPanel numberPanel = new BasicPanel();
	private JPanel textAreaPanel = new JPanel();

	private JTextArea textArea = new JTextArea();
	
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
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textArea.setDisabledTextColor(Color.BLACK);
		
		textArea.setEnabled(false);
		textArea.setColumns(8);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		textAreaPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		numberPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
	    frame.getContentPane().add(numberPanel);
	    frame.getContentPane().add(textAreaPanel);
	    
	    textAreaPanel.setBounds(2, 2, 496, 80);
	    textAreaPanel.setLayout(null);
	    textAreaPanel.add(textArea);
	    
	    textArea.setBounds(2, 2, 492, 76);

	    frame.setVisible(true);
	}
}

	


	

