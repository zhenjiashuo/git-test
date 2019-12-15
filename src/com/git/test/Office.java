package com.git.test;

import java.util.ArrayList;
import java.util.List;

public class Office implements ISubject {

	private List<Observer> stuffs = new ArrayList<Observer>();

	private void addStuff(Observer observer) {
		this.stuffs.add(observer);
	}

	public void removeStuff(Observer observer) {
		this.stuffs.remove(observer);
	}

	public void notifyStuff(String msg) {
		for (Observer observer : stuffs) {
			observer.update(msg);
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		this.addStuff(observer);
	}

	@Override
	public void notifyAllObservers(Object object) {
		this.notifyStuff(object.toString());
	}

	@Override
	public void removeObsersver(Observer observer) {
		this.removeStuff(observer);
	}

}
