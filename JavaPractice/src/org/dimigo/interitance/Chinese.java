package org.dimigo.interitance;

public class Chinese extends Person{
	
	public String name;
	
	public Chinese(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("���Ͽ�");
	}
	
	public void sayBye(){
		System.out.println("¥���");
	}

	public String toString() {
		return "���� �߱���� " + name + "�Դϴ�.";
	}
	
}
