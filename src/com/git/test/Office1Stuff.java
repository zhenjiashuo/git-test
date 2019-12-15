package com.git.test;

public class Office1Stuff implements Observer{
	
	public void update() {
		System.out.println("CustomerA receive the notification");
	}

	@Override
	public void update(String msg) {
		System.out.println("Office 1 notification: " + msg);			
	}
}
