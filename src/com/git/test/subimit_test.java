package com.git.test;

import java.util.ArrayList;
import java.util.List;

public class subimit_test {
	
	static List<String> observerList = new ArrayList<String>(); 
	
	private String getObserver(int index) {
	
		return observerList.get(index);
		
	}

	private boolean addObserver(String observer) {
		return observerList.add(observer);
	}
	
	private boolean removeObserver(String observer) {
		return observerList.remove(observer);
	}

}