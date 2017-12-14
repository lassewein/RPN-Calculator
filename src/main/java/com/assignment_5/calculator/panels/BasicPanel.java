package com.assignment_5.calculator.panels;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.assignment_5.calculator.windows.WindowBasic;


public class BasicPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1771103321800945207L;
	/**
	 * 
	 */
	String numberToInsert = "";
	private TextAreaPanel stacks;
	
	// Row 1, left to right
	private JButton btnSwap = new JButton("\u21F3");
	private JButton btnClear = new JButton("C");
	private JButton btnBackspace = new JButton("\u2B05");
	private JButton btnDivide = new JButton("\u00F7");

	// Row 2, left to right
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnMultiply = new JButton("\u00D7");

	// Row 3, left to right
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btnAdd = new JButton("+");

	// Row 4, left to right
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnSubtract = new JButton("-");

	// Row 5, left to right
	private JButton btn0 = new JButton("0");
	private JButton btnDot = new JButton(".");
	private JButton btnPlusMinus = new JButton("\u00B1");
	private JButton btnEnter = new JButton("\u21B5");


	public BasicPanel(final TextAreaPanel stacks) {
		this.stacks = stacks;
		setBounds(288, 84, 210, 262);
		setLayout(null);
		
		//Row 1, left to right	
		add(btnSwap);
		add(btnClear);
		add(btnBackspace);
		add(btnDivide);
		
		//Row 2, left to right
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnMultiply);
		
		//Row 3, left to right
		add(btn4);
		add(btn5);
		add(btn6);
		add(btnAdd);
		
		//Row 4, left to right
		add(btn0);
		add(btnDot);
		add(btnPlusMinus);
		add(btnEnter);
		
		//Row 5, left to right
		add(btn1);
		add(btn2);
		add(btn3);
		add(btnSubtract);

		setButtonFonts();
		setButtonBounds();
		setToolTipsText();
		addActionListeners();
	}

	public void setButtonFonts() {
		String dialog = "Dialog";
		int fontSize = 18;
		
		//Row 1, left to right
		btnSwap.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnClear.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnBackspace.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnDivide.setFont(new Font(dialog, Font.BOLD, fontSize));
		
		//Row 2, left to right
		btn7.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn8.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn9.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnMultiply.setFont(new Font(dialog, Font.BOLD, fontSize));
		
		//Row 3, left to right
		btn4.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn5.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn6.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnAdd.setFont(new Font(dialog, Font.BOLD, fontSize));
		
		//Row 4, left to right
		btn1.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn2.setFont(new Font(dialog, Font.BOLD, fontSize));
		btn3.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnSubtract.setFont(new Font(dialog, Font.BOLD, fontSize));
		
		//Row 5, left to right
		btn0.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnDot.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnPlusMinus.setFont(new Font(dialog, Font.BOLD, fontSize));
		btnEnter.setFont(new Font(dialog, Font.BOLD, fontSize));
	}

	public void setButtonBounds() {
		int buttonSize = 50;
		
		//Row 1, left to right	
		btnSwap.setBounds(2, 2, buttonSize, buttonSize);
		btnClear.setBounds(54, 2, buttonSize, buttonSize);
		btnBackspace.setBounds(106, 2, buttonSize, buttonSize);
		btnDivide.setBounds(158, 2, buttonSize, buttonSize);
		
		//Row 2, left to right
		btn7.setBounds(2, 54, buttonSize, buttonSize);
		btn8.setBounds(54, 54, buttonSize, buttonSize);
		btn9.setBounds(106, 54, buttonSize, buttonSize);
		btnMultiply.setBounds(158, 54, buttonSize, buttonSize);
		
		//Row 3, left to right
		btn4.setBounds(2, 106, buttonSize, buttonSize);
		btn5.setBounds(54, 106, buttonSize, buttonSize);
		btn6.setBounds(106, 106, buttonSize, buttonSize);
		btnAdd.setBounds(158, 106, buttonSize, buttonSize);
		
		//Row 4, left to right
		btn1.setBounds(2, 158, buttonSize, buttonSize);
		btn2.setBounds(54, 158, buttonSize, buttonSize);
		btn3.setBounds(106, 158, buttonSize, buttonSize);
		btnSubtract.setBounds(158, 158, buttonSize, buttonSize);
		
		//Row 5, left to right
		btn0.setBounds(2, 210, buttonSize, buttonSize);
		btnDot.setBounds(54, 210, buttonSize, buttonSize);
		btnPlusMinus.setBounds(106, 210, buttonSize, buttonSize);
		btnEnter.setBounds(158, 210, 52, 52);
	}

	public void setToolTipsText() {
		btnPlusMinus.setToolTipText("Change the operator sign between \"+\" and \"-\".");
		btnSwap.setToolTipText("Swap the two latest values in the stack.");
		btnClear.setToolTipText("Clear the stack from all values.");
		btnBackspace.setToolTipText("Delete the value on the left of the cursor.");
		btnEnter.setToolTipText("Store the value tothe stack.");
	}
	
	public void addActionListeners() {
		
		btnSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stacks.setText(btn7.getText());
//				textArea.getTextArea().setText("7gfdgjhfjgjhgjgfjhgfjhfjfhgf");
//				JOptionPane.showMessageDialog(null, textArea.getTextArea().getText().toString());
//				TextAreaPanel.text
//				numberToInsert += btn7.getText();
//				textArea.addToTextArea(btn7.getText());
			}
		});
		

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn8.getText();
				//textArea.append(btn8.getText());
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn9.getText();
				//textArea.append(btn9.getText());;
			}
		});

		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// firstNumber = Double.parseDouble(textArea.getText());
				// textArea.setText("");
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numberToInsert += btn4.getText();
				//textArea.append(btn4.getText());
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numberToInsert += btn5.getText();
				//textArea.append(btn5.getText());
			}
		});
	
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numberToInsert += btn6.getText();
				//textArea.append(btn6.getText());
			}
		});

		btnAdd.addActionListener(new ActionListener() {
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

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn1.getText();
				//textArea.append(btn1.getText());
				// String numberEntered = textArea.getText() + btn1.getText();
				// textArea.setText(numberEntered);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn2.getText();
				//textArea.append(btn2.getText());
				// String numberEntered = textArea.getText() + btn2.getText();
				// textArea.setText(numberEntered);
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn3.getText();
				//textArea.append(btn3.getText());
				// String numberEntered = textArea.getText() + btn3.getText();
				// textArea.setText(numberEntered);
			}
		});
		
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// firstNumber = Double.parseDouble(textArea.getText());
				// textArea.setText("");
				// operator = "-";
			}
		});
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn0.getText();
				//textArea.append(btn0.getText());
			}
		});
		
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btnDot.getText();
				//textArea.append(btnDot.getText());
			}
		});
		
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberStack.push(Double.parseDouble(numberToInsert + "\n"));
				// numberToInsert = "";
				// textArea.append("\n");
			}
		});

	}
}
