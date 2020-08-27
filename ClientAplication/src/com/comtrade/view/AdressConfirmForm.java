package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AdressConfirmForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfNuber;
	private JTextField tfPostalC;
	private JTextField tfStreet;

	/**
	 * Create the frame.
	 */
	public AdressConfirmForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcity = new JLabel("     Grad");
		lblcity.setBounds(59, 33, 146, 33);
		contentPane.add(lblcity);
		
		JLabel lblRegion = new JLabel("     Region");
		lblRegion.setBounds(59, 162, 146, 33);
		contentPane.add(lblRegion);
		
		JLabel lblStreet = new JLabel("     Ulica");
		lblStreet.setBounds(59, 301, 146, 33);
		contentPane.add(lblStreet);
		
		JLabel lblNuber = new JLabel("    Broj");
		lblNuber.setBounds(45, 412, 78, 33);
		contentPane.add(lblNuber);
		
		JLabel lblPostalC = new JLabel("Po\u0161tanski broj");
		lblPostalC.setBounds(214, 412, 146, 33);
		contentPane.add(lblPostalC);
		
		tfNuber = new JTextField();
		tfNuber.setBounds(59, 476, 71, 33);
		contentPane.add(tfNuber);
		tfNuber.setColumns(10);
		
		tfPostalC = new JTextField();
		tfPostalC.setBounds(214, 476, 184, 33);
		contentPane.add(tfPostalC);
		tfPostalC.setColumns(10);
		
		JComboBox cbCity = new JComboBox();
		cbCity.setBounds(59, 81, 192, 33);
		contentPane.add(cbCity);
		
		JComboBox cbRegion = new JComboBox();
		cbRegion.setBounds(59, 221, 192, 33);
		contentPane.add(cbRegion);
		
		tfStreet = new JTextField();
		tfStreet.setBounds(59, 347, 192, 35);
		contentPane.add(tfStreet);
		tfStreet.setColumns(10);
		
		JButton btnNewButton = new JButton("Nastavite");
		btnNewButton.setBounds(83, 574, 239, 60);
		contentPane.add(btnNewButton);
	}
}
