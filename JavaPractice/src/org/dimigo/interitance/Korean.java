package org.dimigo.interitance;

public class Korean extends Person{

	private String name;
	
	public Korean(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("�ȳ��ϼ���");
	}
	
	public void sayBye(){
		System.out.println("�ȳ��� �輼��");
	}

	public String toString() {
		return "���� �ѱ���� " + name + "�Դϴ�.";
	}

}
