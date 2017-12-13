package com.assignment_5.calculator.panels;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BasicPanel extends JPanel {

	// Row 1
	private JButton btnSwap = new JButton("\u1F5D8");
	private JButton btnClear = new JButton("C");
	private JButton btnBackspace = new JButton("\u2B05");
	private JButton btnDivision = new JButton("\u00F7");

	// Row 2
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnMultiply = new JButton("\u00D7");

	// Row 3
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btnPlus = new JButton("+");

	// Row 4
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnSubtract = new JButton("-");

	// Row 5
	private JButton btn0 = new JButton("0");
	private JButton btnDot = new JButton(".");
	private JButton btnPlusMinus = new JButton("\u00B1");
	private JButton btnEnter = new JButton("\u21B5");

	public BasicPanel() {
		setBounds(288, 84, 210, 262);
		setLayout(null);
		add(btnEnter);
		add(btn0);
		add(btnDot);
		add(btnPlusMinus);
		add(btn1);
		add(btn4);
		add(btn5);
		add(btnMultiply);
		add(btn3);
		add(btn2);
		add(btnSwap);
		add(btnPlus);
		add(btn6);
		add(btnClear);
		add(btnBackspace);
		add(btnSubtract);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnDivision);

		setButtonFonts();
		setButtonBounds();
		addActionListeners();
	}

	public void setButtonFonts() {
		btnPlusMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDot.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMultiply.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSubtract.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDivision.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEnter.setFont(new Font("Dialog", Font.BOLD, 18));
		btnClear.setFont(new Font("Dialog", Font.BOLD, 18));

	}

	public void setButtonBounds() {
		btnPlusMinus.setBounds(106, 210, 50, 50);
		btn5.setBounds(54, 106, 50, 50);
		btn4.setBounds(2, 106, 50, 50);
		btn1.setBounds(2, 158, 50, 50);
		btn3.setBounds(106, 158, 50, 50);
		btn2.setBounds(54, 158, 50, 50);
		btnMultiply.setBounds(158, 54, 50, 50);
		btnEnter.setBounds(158, 210, 50, 50);
		btn0.setBounds(2, 210, 50, 50);
		btnDot.setBounds(54, 210, 50, 50);
		btnBackspace.setBounds(106, 2, 50, 50);
		btnClear.setBounds(54, 2, 50, 50);
		btnSubtract.setBounds(158, 158, 50, 50);
		btnSwap.setBounds(2, 2, 50, 50);
		btn6.setBounds(106, 106, 50, 50);
		btnPlus.setBounds(158, 106, 50, 50);
		btn7.setBounds(2, 54, 50, 50);
		btn8.setBounds(54, 54, 50, 50);
		btn9.setBounds(106, 54, 50, 50);
		btnDivision.setBounds(158, 2, 50, 50);
	}

	public void addActionListeners() {
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn7.getText();
				// textArea.append(btn7.getText());
			}
		});

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn8.getText();
				// textArea.append(btn8.getText());
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn9.getText();
				// textArea.append(btn9.getText());;
			}
		});

		btnPlus.addActionListener(new ActionListener() {
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

		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// firstNumber = Double.parseDouble(textArea.getText());
				// textArea.setText("");
				// operator = "-";
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn6.getText();
				// textArea.append(btn6.getText());
			}
		});

		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// firstNumber = Double.parseDouble(textArea.getText());
				// textArea.setText("");
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String numberEntered = textArea.getText() + btn3.getText();
				// textArea.setText(numberEntered);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String numberEntered = textArea.getText() + btn2.getText();
				// textArea.setText(numberEntered);
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn5.getText();
				// textArea.append(btn5.getText());
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// numberToInsert += btn4.getText();
				// textArea.append(btn4.getText());
			}
		});

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String numberEntered = textArea.getText() + btn1.getText();
				// textArea.setText(numberEntered);
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
