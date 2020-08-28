package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.TransferObject;
import com.comtrade.frontcontroller.FrontController;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FirstForm1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtInsertYourAdress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm1 frame = new FirstForm1();
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
	public FirstForm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "name_401272373799000");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		layeredPane.add(panel1, "name_401283191595900");
		panel1.setLayout(null);
		
		JTextPane txtpnNaruiDostavuZa = new JTextPane();
		txtpnNaruiDostavuZa.setText("Naru\u010Di dostavu\r\n\r\nza manje od 1 minuta!");
		txtpnNaruiDostavuZa.setForeground(Color.BLACK);
		txtpnNaruiDostavuZa.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnNaruiDostavuZa.setBounds(29, 222, 315, 77);
		panel1.add(txtpnNaruiDostavuZa);
		
		textField = new JTextField();
		textField.setText("            Unesite va\u0161u adresu");
		textField.setColumns(10);
		textField.setBounds(29, 335, 347, 41);
		panel1.add(textField);
		
		JButton btnOrder = new JButton("Naru\u010Di");
		btnOrder.setBounds(373, 335, 74, 41);
		panel1.add(btnOrder);
		
		JButton btnNewButton = new JButton("Login/Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginRegisterForm loginRegisterForm = new LoginRegisterForm();
				loginRegisterForm.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(490, 28, 195, 33);
		panel1.add(btnNewButton);
		
		JPanel panel2 = new JPanel();
		layeredPane.add(panel2, "name_401295476839600");
		panel2.setLayout(null);
		
		JTextPane txtpnNaruiDostavuZa_1 = new JTextPane();
		txtpnNaruiDostavuZa_1.setText("Naru\u010Di dostavu\r\n\r\nza manje od 1 minuta!");
		txtpnNaruiDostavuZa_1.setForeground(Color.BLACK);
		txtpnNaruiDostavuZa_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnNaruiDostavuZa_1.setBounds(32, 220, 315, 77);
		panel2.add(txtpnNaruiDostavuZa_1);
		
		textField_1 = new JTextField();
		textField_1.setText("            Unesite va\u0161u adresu");
		textField_1.setColumns(10);
		textField_1.setBounds(32, 327, 347, 41);
		panel2.add(textField_1);
		
		JButton btnOrder_1 = new JButton("Naru\u010Di");
		btnOrder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adress = txtInsertYourAdress.getText();
				HomeAdress homeAdress = new HomeAdress();
				TransferObject tObject = TransferObject.create(homeAdress, ConstantesFC.HOME_ADRESS, ConstantesBL.POST);
				try {
					TransferObject tr1 = FrontController.getInstance().execute(tObject);
					String message1 = tr1.getMessage();
					JOptionPane.showMessageDialog(null, message1);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				AdressConfirmForm adrConfirmForm = new AdressConfirmForm();
				adrConfirmForm.setVisible(true);
			}
			
		});
		btnOrder_1.setBounds(377, 327, 74, 41);
		panel2.add(btnOrder_1);
	}
}
