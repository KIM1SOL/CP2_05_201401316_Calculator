package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator extends JFrame {
	static JButton btnC;
	static JButton button;
	static JButton button_1;
	static JButton button_2;
	static JButton button_3;
	static JButton button_4;
	static JButton button_5;
	static JButton button_6;
	static JButton button_7;
	static JButton button_8;
	static JButton button_9;
	static JButton button_10;
	static JButton button_11;
	static JButton button_12;
	static JButton button_13;
	static JButton button_14;
	static JButton button_15;

	static JPanel contentPane;
	static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(44, 66, 423, 70);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Verdana", Font.BOLD, 30));
		btnC.setBounds(44, 167, 95, 52);
		contentPane.add(btnC);
		btnC.addActionListener(new ClearListener());
		
		button = new JButton("1");
		button.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button.setBounds(44, 241, 95, 52);
		contentPane.add(button);
		button.addActionListener(new PutNumberListener());
		
		button_1 = new JButton("4");
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_1.setBounds(44, 303, 95, 52);
		contentPane.add(button_1);
		button_1.addActionListener(new PutNumberListener());
		
		
		button_2 = new JButton("7");
		button_2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_2.setBounds(44, 365, 95, 52);
		contentPane.add(button_2);
		button_2.addActionListener(new PutNumberListener());
		
		
		button_3 = new JButton("2");
		button_3.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_3.setBounds(151, 241, 95, 52);
		contentPane.add(button_3);
		button_3.addActionListener(new PutNumberListener());
		
		button_4 = new JButton("5");
		button_4.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_4.setBounds(151, 303, 95, 52);
		contentPane.add(button_4);
		button_4.addActionListener(new PutNumberListener());
		
		button_5 = new JButton("8");
		button_5.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_5.setBounds(151, 365, 95, 52);
		contentPane.add(button_5);
		button_5.addActionListener(new PutNumberListener());
		
		button_6 = new JButton("3");
		button_6.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_6.setBounds(258, 241, 95, 52);
		contentPane.add(button_6);
		button_6.addActionListener(new PutNumberListener());
		
		button_7 = new JButton("6");
		button_7.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_7.setBounds(258, 303, 95, 52);
		contentPane.add(button_7);
		button_7.addActionListener(new PutNumberListener());
		
		button_8 = new JButton("9");
		button_8.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_8.setBounds(258, 365, 95, 52);
		contentPane.add(button_8);
		button_8.addActionListener(new PutNumberListener());
		
		button_9 = new JButton("0");
		button_9.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_9.setBounds(44, 427, 95, 52);
		contentPane.add(button_9);
		button_9.addActionListener(new PutNumberListener());
		
		button_10 = new JButton("00");
		button_10.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		button_10.setBounds(151, 427, 95, 52);
		contentPane.add(button_10);
		button_10.addActionListener(new PutNumberListener());
		
		button_11 = new JButton("=");
		button_11.setFont(new Font("±¼¸²", Font.BOLD, 30));
		button_11.setBounds(258, 427, 95, 52);
		contentPane.add(button_11);
		button_11.addActionListener(new FinalOPListener());
		
		button_12 = new JButton("+");
		button_12.setFont(new Font("±¼¸²", Font.BOLD, 30));
		button_12.setBounds(372, 427, 95, 52);
		contentPane.add(button_12);
		button_12.addActionListener(new OperationListener());
		
		button_13 = new JButton("-");
		button_13.setFont(new Font("±¼¸²", Font.BOLD, 30));
		button_13.setBounds(372, 365, 95, 52);
		contentPane.add(button_13);
		button_13.addActionListener(new OperationListener());
		
		button_14 = new JButton("*");
		button_14.setFont(new Font("±¼¸²", Font.BOLD, 30));
		button_14.setBounds(372, 303, 95, 52);
		contentPane.add(button_14);
		button_14.addActionListener(new OperationListener());
		
		button_15 = new JButton("/");
		button_15.setFont(new Font("±¼¸²", Font.BOLD, 30));
		button_15.setBounds(372, 241, 95, 52);
		contentPane.add(button_15);
		button_15.addActionListener(new OperationListener());
	}
	
	// button = 1, 1 = 4, 2= 7, 3 = 2, 4 = 5, 5 = 8, 6 = 3, 7 = 6, 8 = 9 button_9 = 0, 
	//10 = 00, btnC = C, 11 = =,
	
	static String num = "0";
	static int temp;
	static int temp2;
	static int fin;
	static String OP = "=";
	
	private class PutNumberListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
				
			if(num.equals("0")||num.equals("")) {
				if(e.getSource() == Calculator.button_10 || e.getSource() == Calculator.button_9) {
					num = "0";
				}
				else {
					if(e.getSource() == Calculator.button) { num = "1"; }
					if(e.getSource() == Calculator.button_1) { num = "4"; }
					if(e.getSource() == Calculator.button_2) { num = "7"; }
					if(e.getSource() == Calculator.button_3) { num = "2"; }
					if(e.getSource() == Calculator.button_4) { num = "5"; }
					if(e.getSource() == Calculator.button_5) { num = "8"; }
					if(e.getSource() == Calculator.button_6) { num = "3"; }
					if(e.getSource() == Calculator.button_7) { num = "6"; }
					if(e.getSource() == Calculator.button_8) { num = "9"; }
				}
			
			}
			else {
				if(e.getSource() == Calculator.button) { num = num + "1"; }
				else if(e.getSource() == Calculator.button_1) { num = num + "4"; }
				else if(e.getSource() == Calculator.button_2) { num = num + "7"; }
				else if(e.getSource() == Calculator.button_3) { num = num + "2"; }
				else if(e.getSource() == Calculator.button_4) { num = num + "5"; }
				else if(e.getSource() == Calculator.button_5) { num = num + "8"; }
				else if(e.getSource() == Calculator.button_6) { num = num + "3"; }
				else if(e.getSource() == Calculator.button_7) { num = num + "6"; }
				else if(e.getSource() == Calculator.button_8) { num = num + "9"; }
				else if(e.getSource() == Calculator.button_9) {	num = num + "0";}
				else if(e.getSource() == Calculator.button_10){ num = num + "00";}
			}
						
			Calculator.textField.setText(num);
		}
	}
	
	private class ClearListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == Calculator.btnC) {
				num = "0";
				fin = 0;
			}
			Calculator.textField.setText(num);
		}
		
	}
	
	// 11 = =, 12 = +, 13 = -, 14 = *, 15 = /
	private class OperationListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp = Integer.valueOf(num);
		
		
			if(e.getSource() == Calculator.button_12) { //+
				num = "0";
				Calculator.textField.setText(num);
				
				OP = "+";
						
			}
			else if(e.getSource() == Calculator.button_13) { //-
				num = "0";
				Calculator.textField.setText(num);
				
				OP = "-";
				
			}
			else if(e.getSource() == Calculator.button_14) { //*
				num = "0";
				Calculator.textField.setText(num);
				
				OP = "*";
				
			}
			else if(e.getSource() == Calculator.button_15) { // /
				num = "0";
				Calculator.textField.setText(num);
				
				OP = "/";
				
			}
			else {
				OP = "=";
			}
			
		}
		
	}
	
	private class FinalOPListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp2 = Integer.valueOf(num);
			
			if(e.getSource() == Calculator.button_11) {
				if(OP.equals("+")) {
					fin  = temp + temp2;
					num = fin+"";
					Calculator.textField.setText(num);
					num = "0";
				}
				else if(OP.equals("-")) {
					fin =  temp - temp2;
					if( fin < 0) {
						fin = 0;
					}
					num = fin+"";
					Calculator.textField.setText(num);
					num = "0";
				}
				else if(OP.equals("*")) {
					fin = temp * temp2;
					num = fin+"";
					Calculator.textField.setText(num);
					num = "0";
				}
				
				else if(OP.equals("/")) {
					fin =  temp / temp2;
					num = fin+"";
					Calculator.textField.setText(num);
					num = "0";
				}
				else {
					Calculator.textField.setText(num);
				
				}
			}
		}
	}
	
	

}
