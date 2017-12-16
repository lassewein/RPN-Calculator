package com.assignment_5.calculator.panels;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.assignment_5.calculator.operations.CalculatorAdvanceOperations;
import com.assignment_5.calculator.operations.CalculatorBasicOperations;

public class AdvancedPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8970194930053662758L;
	
	private TextAreaPanel textArea = new TextAreaPanel();
	private Stack<Double> numberStack = new Stack<Double>();
	private CalculatorAdvanceOperations calculateAdvance = new CalculatorAdvanceOperations();
	
	// Row 1, left to right
		private JButton btnSquare = new JButton("x\u00B2");
		private JButton btnPowerOf = new JButton("x^y");
		private JButton btnSquareRoot = new JButton("\u221A x");
		private JButton btnNthRoot = new JButton("x\u221A y");
		private JButton btnLog = new JButton("Log");
		private JButton btnTensPower = new JButton("10^x");
		
		public AdvancedPanel(Stack<Double> numberStack, TextAreaPanel textArea) {
			this.numberStack = numberStack;
			this.textArea = textArea;
			
			setBounds(2, 84, 284, 262);
			setLayout(null);
			
			add(btnSquare);
			add(btnPowerOf);
			add(btnSquareRoot);
			add(btnNthRoot);
			add(btnLog);
			add(btnTensPower);
			
			setButtonFonts();
			setButtonBounds();
			setToolTipsText();
			addActionListeners();
		}
		public void setButtonFonts() {
			String dialog = "Dialog";
			int fontSize = 12;
			
			btnSquare.setFont(new Font(dialog, Font.BOLD, fontSize));
			btnPowerOf.setFont(new Font(dialog, Font.BOLD, fontSize));
			btnSquareRoot.setFont(new Font(dialog, Font.BOLD, fontSize));
			btnNthRoot.setFont(new Font(dialog, Font.BOLD, fontSize));
			btnLog.setFont(new Font(dialog, Font.BOLD, fontSize));
			btnTensPower.setFont(new Font(dialog, Font.BOLD, fontSize));
		}

		public void setButtonBounds() {
			int buttonSizeX = 70;
			int buttonSizeY = 50;
			
			btnSquare.setBounds(212, 2, buttonSizeX, buttonSizeY);
			btnPowerOf.setBounds(212, 54, buttonSizeX, buttonSizeY);
			btnSquareRoot.setBounds(212, 106, buttonSizeX, buttonSizeY);
			btnNthRoot.setBounds(212, 158, buttonSizeX, buttonSizeY);
			btnLog.setBounds(212, 210, buttonSizeX, buttonSizeY);
			btnTensPower.setBounds(140, 210, buttonSizeX, buttonSizeY);
		}
		
		public void setToolTipsText() {
			btnSquare.setToolTipText("Calculate the base \"x\" to the power of 2.");
			btnPowerOf.setToolTipText("Calculate the base \"x\" to the power of \"y\".");
			btnSquareRoot.setToolTipText("Calculate the square root of \"x\".");
			btnNthRoot.setToolTipText("Calculate the N:th root of \"x\", e.g \"x\" to thepower of 1 devided by \"y\"");
			btnLog.setToolTipText("Calculate the logaritm of \"x\".");
			btnTensPower.setToolTipText("Calculate the base 10 to the power of \"x\".");
		}


		public void addActionListeners() {
			btnSquare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			btnPowerOf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// numberToInsert += btn7.getText();
					// textArea.append(btn7.getText());
				}
			});

			btnSquareRoot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// numberToInsert += btn8.getText();
					// textArea.append(btn8.getText());
				}
			});

			btnNthRoot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// numberToInsert += btn9.getText();
					// textArea.append(btn9.getText());;
				}
			});

			btnLog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// if(numberToInsert != "") {
					// firstNumber = numberStack.pop();
					// secondNumber = Double.parseDouble(numberToInsert);
					// textArea.removeAll();
					// }else {
					// secondNumber = numberStack.pop();
					// firstNumber = numberStack.pop();
					// }
					// result = firstNumber + secondNumber;
					// numberStack.push(result);
					// textArea.append(result + "\n");
				}
			});

			btnTensPower.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// firstNumber = Double.parseDouble(textArea.getText());
					// textArea.setText("");
					// operator = "-";
				}
			});
		}

}
