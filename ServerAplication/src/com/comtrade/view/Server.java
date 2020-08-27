package com.comtrade.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.comtrade.thread.ClockThread;
import com.comtrade.thread.ThreadServer;

public class Server extends JFrame {

	private JPanel contentPane;
	private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ThreadServer server = new ThreadServer();
				ClockThread clockThread = new ClockThread(lblClock);
				server.start();
		
			}
		});
		btnRun.setBounds(159, 182, 97, 25);
		contentPane.add(btnRun);
		
		lblClock = new JLabel("");
		lblClock.setBounds(236, 32, 140, 32);
		contentPane.add(lblClock);
	}
}
