package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAccountForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public MyAccountForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Ime");
		lblName.setBounds(28, 13, 109, 23);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Prezime");
		lblLastName.setBounds(269, 16, 109, 23);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(38, 65, 150, 23);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
