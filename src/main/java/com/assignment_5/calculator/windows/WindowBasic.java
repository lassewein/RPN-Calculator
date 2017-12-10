package com.assignment_5.calculator.windows;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;

public class WindowBasic {
	private Stack<Double> numberStack = new Stack<Double>();
	private JFrame frame = new JFrame();;
	private JTextArea textArea = new JTextArea();
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnPlus = new JButton("+");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btnSubtract = new JButton("-");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnMultiply = new JButton("*");
	private JButton btnEnter = new JButton("Enter");
	
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
		frame.setBounds(100, 100, 243, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textArea.setDisabledTextColor(Color.BLACK);
		
		textArea.setEnabled(false);
		textArea.setColumns(8);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textArea.setBounds(12, 34, 218, 63);
		frame.getContentPane().add(textArea);
		
/*		if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			btn7
		}
	*/		
		setMnemonic();
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn7.getText();
				textArea.append(btn7.getText());
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(22, 111, 50, 50);
		frame.getContentPane().add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn8.getText();
				textArea.append(btn8.getText());
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(73, 111, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn9.getText();
				textArea.append(btn9.getText());;
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(124, 111, 50, 50);
		frame.getContentPane().add(btn9);
		
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numberToInsert != "") {
					firstNumber = numberStack.pop();
					secondNumber = Double.parseDouble(numberToInsert);
					textArea.removeAll();
				}else {
					secondNumber = numberStack.pop();
					firstNumber = numberStack.pop();
				}
	//			System.out.println(textArea.getLineCount()); 
				
	//			textArea.remove(textArea.getLineCount()-1);
	//			System.out.println(textArea.getLineCount()); 
				
//				textArea.remove(textArea.getLineCount()-1);
				result = firstNumber + secondNumber;
				numberStack.push(result);
				textArea.append(result + "\n");
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setBounds(175, 111, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn4.getText();
				textArea.append(btn4.getText());
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(22, 163, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn5.getText();
				textArea.append(btn5.getText());
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(73, 163, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberToInsert += btn6.getText();
				textArea.append(btn6.getText());
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(124, 163, 50, 50);
		frame.getContentPane().add(btn6);
		
	
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
//				operator = "-";
			}
		});
		btnSubtract.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSubtract.setBounds(175, 163, 50, 50);
		frame.getContentPane().add(btnSubtract);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberEntered = textArea.getText() + btn1.getText();
				textArea.setText(numberEntered);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(22, 215, 50, 50);
		frame.getContentPane().add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberEntered = textArea.getText() + btn2.getText();
				textArea.setText(numberEntered);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(73, 215, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberEntered = textArea.getText() + btn3.getText();
				textArea.setText(numberEntered);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(124, 215, 50, 50);
		frame.getContentPane().add(btn3);
		
	
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
//				operator = "*";
			}
		});
		btnMultiply.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMultiply.setBounds(175, 215, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberStack.push(Double.parseDouble(numberToInsert + "\n"));
				numberToInsert = "";
				textArea.append("\n");
//				textArea.append(numberStack.toString());
			}
		});
		btnEnter.setBounds(124, 289, 117, 50);
		frame.getContentPane().add(btnEnter);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAutoscrolls(true);
		menuBar.setName("Menu");
		menuBar.setBounds(14, 10, 129, 21);
		frame.getContentPane().add(menuBar);
		
		// File Menu, F - Mnemonic
	    JMenu fileMenu = new JMenu("Calculator");
	    fileMenu.setMnemonic(KeyEvent.VK_C);
	    menuBar.add(fileMenu);
	    
	 // File->New, N - Mnemonic
	    JMenuItem basicCalculatorMenuItem = new JMenuItem("Basic calculator", KeyEvent.VK_B);
	    fileMenu.add(basicCalculatorMenuItem);
	    
		 // File->New, N - Mnemonic
	    JMenuItem advancedCalculatorMenuItem = new JMenuItem("Advanced calculator", KeyEvent.VK_A);
	    fileMenu.add(advancedCalculatorMenuItem);


	    frame.setVisible(true);
	}
	
	public void setMnemonic() {
//		btn7.setMnemonic(KeyEvent.VK_1);
	}
}
