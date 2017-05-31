package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getLimitAge(){
		return limitAge;
	}
	
	public void buyTicket(int age) throws Exception{
		if(age < limitAge){
			throw new Exception(title + "�� " + limitAge + "�� �̻� �������Դϴ�.");
		}
		
		else System.out.println(title + " ���ϼ���");
		
	}
}
