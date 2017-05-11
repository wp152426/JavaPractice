package org.dimigo.interitance;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Person[] people = new Person[4];
		people[1] = new Korean("ȫ�浿");
		people[2] = new Japanese("�ٳ�ī");
		people[3] = new Chinese("�չ�");
		people[0] = new Person("Tom");
		
		for(Person p : people){
			greeting(p);
		}

	}

	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
