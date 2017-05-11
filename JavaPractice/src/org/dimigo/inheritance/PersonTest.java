package org.dimigo.interitance;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Tom");
		Korean k = new Korean("ȫ�浿");
		Japanese j = new Japanese("�ٳ�ī");
		Chinese c = new Chinese("�չ�");
		
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
