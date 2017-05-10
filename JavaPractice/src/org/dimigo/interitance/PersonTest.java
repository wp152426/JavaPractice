package org.dimigo.interitance;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Tom");
		Korean k = new Korean("È«±æµ¿");
		Japanese j = new Japanese("´Ù³ªÄ«");
		Chinese c = new Chinese("¿Õ¹Ö");
		
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
		System.out.println();
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();

	}

}
