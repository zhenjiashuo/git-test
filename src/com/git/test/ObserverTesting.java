package com.git.test;

import java.util.Observable;

public class ObserverTesting {

	public static void main(String[] args) {

		Office office1 = new Office();
		Office office2 = new Office();


		Office1Stuff obv1 = new Office1Stuff();
		Office1Stuff obv2 = new Office1Stuff();
		Office1Stuff obv3 = new Office1Stuff();
		Office1Stuff obv4 = new Office1Stuff();

		Office2Stuff stuff1 = new Office2Stuff();
		Office2Stuff stuff2 = new Office2Stuff();
		Office2Stuff stuff3 = new Office2Stuff();
		Office2Stuff stuff4 = new Office2Stuff();


		office1.registerObserver(obv1);
		office1.registerObserver(obv2);
		office1.registerObserver(obv3);
		office1.registerObserver(obv4);
		
		office2.registerObserver(stuff1);
		office2.registerObserver(stuff2);
		office2.registerObserver(stuff3);
		office2.registerObserver(stuff4);

		office1.notifyStuff("Office1 customer, welcome");
		office2.notifyStuff("Office2 customer, welcome");
		
		//  java implemention 
		Observable test = new Observable();
		

	}

}
