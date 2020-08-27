package com.comtrade.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class ClockThread extends Thread {
	private JLabel clock;

	public ClockThread(JLabel clock) {
		this.clock = clock;
		start();
		
	}
	@Override
	public void run() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		while(true) {
			clock.setText(dateFormat.format(new Date()));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
