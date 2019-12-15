package com.git.test;

public interface ISubject {

	public void registerObserver(Observer oberver);

	public void removeObsersver(Observer observer);

	public void notifyAllObservers(Object object);

}
