/**
 * 
 */
package com.assignment_5.calculator.panels;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author lars
 *
 */
public class TextAreaPanel extends JPanel{
	private JTextArea stacks;// = new JTextArea();
	/**
	 * 
	 */
	private static final long serialVersionUID = -8331732502392928910L;
	
	private JTextArea textArea = new JTextArea();
	
	public TextAreaPanel() {
		stacks = new JTextArea();
		stacks = createTextArea();
		stacks.setText(" ");
		createTextAreaPanel();
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void createTextAreaPanel() {
		textArea.setDisabledTextColor(Color.BLACK);
		textArea.setEnabled(false);
		textArea.setColumns(8);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
	    setBounds(2, 2, 496, 80);
	    setLayout(null);
	    add(textArea);
	    
	    textArea.setBounds(2, 2, 492, 76);
	}
	
/*	public void addToTextArea(String value) {
		textArea.append();
	}
*/	
	private static JTextArea createTextArea() {

        JTextArea text = new JTextArea();
  //      text.setHorizontalAlignment(SwingConstants.RIGHT);
        text.setEditable(false);
        text.setFont(new Font("Helvetica", Font.PLAIN, 20));
        return text;

    }

    public void setText(String x) {
        stacks.setText(x);
        
    }

    public void getFocus() {
        stacks.requestFocus();
    }

    public String get() {
        return stacks.getText();
    }

    public JTextArea getArea() {
        return stacks;
    }
}

