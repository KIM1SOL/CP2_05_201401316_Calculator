package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Interest_Calculator extends JFrame {

	static JPanel contentPane;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interest_Calculator frame = new Interest_Calculator();
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
	public Interest_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("원금을 입력하시오 ");
		label.setBounds(43, 44, 164, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("이율을 입력하시오 ");
		label_1.setBounds(43, 105, 164, 38);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(245, 44, 164, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(245, 105, 164, 38);
		contentPane.add(textField_1);
		
		
		button = new JButton("변환");
		
		button.addActionListener(new CalculateListener());
		
		button.setBounds(146, 162, 95, 23);
		contentPane.add(button);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(43, 215, 366, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		textField_1.addKeyListener(new KeyListener() {
			private int originMoney;
			private float interest;
			private float cal_fin;

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(Interest_Calculator.textField.getText().equals("")) {
						originMoney = 0;
					}
					else {
						originMoney = Integer.valueOf(Interest_Calculator.textField.getText());
					}
					
					if(Interest_Calculator.textField_1.getText().equals("")) {
						interest = 1;
					}else {
						interest = Float.valueOf(Interest_Calculator.textField_1.getText());
					}
					
					//연이자 = 원금 * (이율/100)
					cal_fin = originMoney * (interest/100);
					Interest_Calculator.textField_2.setText("이자는 연 "+cal_fin+"원 입니다.");
				}
			}
			

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	
	private class CalculateListener implements ActionListener {
		private int originMoney;
		private float interest;
		private float cal_fin;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == Interest_Calculator.button) {
				if(Interest_Calculator.textField.getText().equals("")) {
					originMoney = 0;
				}
				else {
					originMoney = Integer.valueOf(Interest_Calculator.textField.getText());
				}
				
				if(Interest_Calculator.textField_1.getText().equals("")) {
					interest = 1;
				}else {
					interest = Float.valueOf(Interest_Calculator.textField_1.getText());
				}
				
				//연이자 = 원금 * (이율/100)
				cal_fin = originMoney * (interest/100);
				
				Interest_Calculator.textField_2.setText("이자는 연 "+cal_fin+"원 입니다.");
			}
		}
		
	}
}
