package org.dimigo.inheritance;

public class Galaxy extends SmartPhone{
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("�Ｚ ���̷� �����մϴ�.");
	}
	
	public void useWirelessCharging(){
		System.out.println("���� ���� ����� ����մϴ�.");
	}
	
}
