/**
 * 
 */
package com.assignment_5.calculator.panels;

import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author lars
 *
 */
public class TextAreaPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8331732502392928910L;
	
	private JTextArea textArea = new JTextArea();

	public TextAreaPanel() {
		textArea.setDisabledTextColor(Color.BLACK);
		textArea.setEnabled(false);
		textArea.setColumns(8);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
//	    textAreaPanel.setBounds(2, 2, 496, 80);
//	    textAreaPanel.setLayout(null);
//	    textAreaPanel.add(textArea);
	    setBounds(2, 2, 496, 80);
	    setLayout(null);
	    add(textArea);
	    
	    textArea.setBounds(2, 2, 492, 76);
	}
}
