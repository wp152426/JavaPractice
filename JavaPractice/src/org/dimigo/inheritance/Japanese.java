package org.dimigo.interitance;

public class Japanese extends Person{

	private String name;
	
	public Japanese(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("���Ͽ��");
	}
	
	public void sayBye(){
		System.out.println("��䳪��");
	}

	public String toString() {
		return "���� �Ϻ���� " + name + "�Դϴ�.";
	}
	
	

}
