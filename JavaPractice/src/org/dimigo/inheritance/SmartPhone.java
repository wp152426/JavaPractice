package org.dimigo.inheritance;

public abstract class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "�� ������ �մϴ�.");
	}
	
	public void turnOff(){
		System.out.println(model + "�� ������ ���ϴ�.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(){
		if(this instanceof IPhone){
			((IPhone) this).useAirDrop();
		}
		
		else if(this instanceof Galaxy){
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "�𵨸� : " + model + ", ������ : " + company + ", ���� : " + String.format("%,d", price) + "��";
	}
	
	
	
}
