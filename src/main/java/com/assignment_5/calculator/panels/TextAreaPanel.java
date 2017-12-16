/**
 * 
 */
package com.assignment_5.calculator.panels;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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
	private JScrollPane scrollPane = new JScrollPane(textArea);
	
	public TextAreaPanel() {
        textArea.setEditable(false);
        textArea.setFont(new Font("Helvetica", Font.PLAIN, 20));
		textArea.setText("");
		textArea.setAutoscrolls(true);
	
		textArea.setDisabledTextColor(Color.BLACK);
		textArea.setEnabled(false);
		textArea.setColumns(8);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    setBounds(2, 2, 496, 80);
	    setLayout(null);
	    textArea.setBounds(2, 2, 492, 76);
	//    scrollPane.setBounds(r);
	    add(scrollPane);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}	

    public void append(String x) {
    	textArea.append(x);
        
    }

    public void getFocus() {
    	textArea.requestFocus();
    }

    public String get() {
        return textArea.getText();
    }

    public JTextArea getTextArea1() {
        return textArea;
    }
}

