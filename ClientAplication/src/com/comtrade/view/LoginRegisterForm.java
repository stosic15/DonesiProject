package com.comtrade.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;
import com.comtrade.frontcontroller.FrontController;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JPasswordField;

public class LoginRegisterForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;
	private JLayeredPane layeredPane;
	private JTextField tfAdress;
	private JTextField tfEmail;
	private JTextField tfPassword;
	private JTextField tfUserName;
	private JPasswordField pfPassword;

	
	
	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public LoginRegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(12, 67, 420, 508);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		 panel1 = new JPanel();
		layeredPane.add(panel1, "name_85502955487400");
		panel1.setLayout(null);
		
		tfAdress = new JTextField();
		tfAdress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tfAdress.setText(null);
			}
		});
		tfAdress.setText("  E-adresa ili korisni\u010Dko ime");
		tfAdress.setBounds(24, 191, 253, 30);
		panel1.add(tfAdress);
		tfAdress.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Prijavi se ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adress = tfAdress.getText();
				String password = String.copyValueOf(pfPassword.getPassword());
		//treba logika za konekciju u FirstForm
				
				
				dispose();
				
				
			}
		});
		btnNewButton_2.setBounds(83, 306, 175, 35);
		panel1.add(btnNewButton_2);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(24, 248, 253, 31);
		panel1.add(pfPassword);
		
		panel2 = new JPanel();
		layeredPane.add(panel2, "name_85506011147400");
		panel2.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfEmail.setText(null);
			}
		});
		tfEmail.setText("  Va\u0161a e -adresa");
		tfEmail.setColumns(10);
		tfEmail.setBounds(26, 100, 253, 30);
		panel2.add(tfEmail);
		
		tfPassword = new JTextField();
		tfPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPassword.setText(null);
			}
		});
		tfPassword.setText("  Va\u0161a lozinka");
		tfPassword.setColumns(10);
		tfPassword.setBounds(26, 187, 253, 30);
		panel2.add(tfPassword);
		
		tfUserName = new JTextField();
		tfUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfUserName.setText(null);
			}
		});
		tfUserName.setText("Korisni\u010Dko ime koje \u017Eelite da imate");
		tfUserName.setColumns(10);
		tfUserName.setBounds(26, 322, 253, 30);
		panel2.add(tfUserName);
		
		JButton brnRegistration = new JButton("Registruj se");
		brnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = tfEmail.getText();
				String password = tfPassword.getText();
				String userName = tfUserName.getText();
				User user = new User();
				TransferObject object = TransferObject.create(user, ConstantesFC.USER_REGISTRATION, ConstantesBL.POST);
				
				try {
					TransferObject tO= FrontController.getInstance().execute(object);
					String message = tO.getMessage();
					JOptionPane.showMessageDialog(null, message);
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		brnRegistration.setBounds(63, 413, 191, 25);
		panel2.add(brnRegistration);
		
		JButton btnLogovanje = new JButton("Uloguj se");
		btnLogovanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanel(panel1);
			}
		});
		btnLogovanje.setBounds(12, 29, 186, 25);
		contentPane.add(btnLogovanje);
		
		JButton btnPrijava = new JButton("Prijavi se");
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel2);
				
			}
		});
		btnPrijava.setBounds(205, 29, 201, 25);
		contentPane.add(btnPrijava);
	}
}
