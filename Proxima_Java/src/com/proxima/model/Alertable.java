package com.proxima.model;

public interface Alertable {

	
	public Alert sendAlert(int priority, String message);
	public Alert sendAlert(String message);
	public Alert sendReply(int acknoledgement);
	public Alert sendReply(int acknoledgement, int priority, String message);
	
}
