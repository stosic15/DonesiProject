package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyAccountForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfLastName;
	private JTextField tfUserName;
	private JTextField tfEmail;
	private JTextField tfMobileNo;

	

	/**
	 * Create the frame.
	 */
	public MyAccountForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Ime");
		lblName.setBounds(419, 117, 109, 23);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Prezime");
		lblLastName.setBounds(671, 117, 109, 23);
		contentPane.add(lblLastName);
		
		tfName = new JTextField();
		tfName.setBounds(418, 149, 190, 30);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(671, 149, 190, 30);
		contentPane.add(tfLastName);
		
		JLabel lblUserName = new JLabel("Korisni\u010Dko ime");
		lblUserName.setBounds(419, 212, 109, 23);
		contentPane.add(lblUserName);
		
		tfUserName = new JTextField();
		tfUserName.setColumns(10);
		tfUserName.setBounds(419, 253, 190, 30);
		contentPane.add(tfUserName);
		
		JLabel lblEmail = new JLabel("elektronska po\u0161ta");
		lblEmail.setBounds(419, 312, 109, 23);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(419, 358, 190, 30);
		contentPane.add(tfEmail);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setBounds(419, 424, 109, 23);
		contentPane.add(lblMobileNumber);
		
		tfMobileNo = new JTextField();
		tfMobileNo.setColumns(10);
		tfMobileNo.setBounds(419, 470, 190, 30);
		contentPane.add(tfMobileNo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(419, 563, 189, 36);
		contentPane.add(btnNewButton);
	}
}
