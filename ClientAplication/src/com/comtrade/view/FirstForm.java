package com.comtrade.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.TransferObject;
import com.comtrade.frontcontroller.FrontController;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class FirstForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtInsertYourAdress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
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
	public FirstForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInsertYourAdress = new JTextField();
		txtInsertYourAdress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtInsertYourAdress.setText("");
			}
		});
		txtInsertYourAdress.setText("            Unesite va\u0161u adresu");
		txtInsertYourAdress.setBounds(12, 335, 347, 41);
		contentPane.add(txtInsertYourAdress);
		txtInsertYourAdress.setColumns(10);
		
		JButton btnOrder = new JButton("Naru\u010Di");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		btnOrder.setBounds(355, 335, 74, 41);
		contentPane.add(btnOrder);
		
		JTextPane txtpnNaruiDostavuZa = new JTextPane();
		txtpnNaruiDostavuZa.setText("Naru\u010Di dostavu\r\n\r\nza manje od 1 minuta!");
		txtpnNaruiDostavuZa.setForeground(Color.BLACK);
		txtpnNaruiDostavuZa.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnNaruiDostavuZa.setBounds(12, 222, 315, 77);
		contentPane.add(txtpnNaruiDostavuZa);
		
		JButton btnNewButton = new JButton("Login/Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginRegisterForm loginRegisterForm = new LoginRegisterForm();
				loginRegisterForm.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(453, 33, 195, 33);
		contentPane.add(btnNewButton);
	}
}
