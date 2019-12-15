package com.git.test;

public class Office2Stuff implements Observer{
	
	public void update() {
		System.out.println("CustomerB receive the notification");
	}

	@Override
	public void update(String msg) {
		System.out.println("Office 2 notification: " + msg);	
	}
}
