package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phones = new SmartPhone[2];
		phones[0] = new IPhone("iPhone 7", "����", 900000);
		phones[1] = new Galaxy("������ S8", "�Ｚ", 800000);
		
		for(SmartPhone s : phones){
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			System.out.println();
		}

	}

}
