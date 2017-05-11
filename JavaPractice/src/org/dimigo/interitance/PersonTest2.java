package org.dimigo.interitance;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Person[] people = new Person[4];
		people[1] = new Korean("È«±æµ¿");
		people[2] = new Japanese("´Ù³ªÄ«");
		people[3] = new Chinese("¿Õ¹Ö");
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
