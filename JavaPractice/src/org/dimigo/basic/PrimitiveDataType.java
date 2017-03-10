/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * PrimitiveDataType
 *
 * 1. Outline : IU Profile Output
 * 2. Date : 2017. 3. 9.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "IU";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< IU Profile >>");
		System.out.println("Name : " + name);
		
		if(isMale)
			System.out.println("Gender : Male");
		else
			System.out.println("Gender : Female");
		
		System.out.println("Age : " + age);
		System.out.println("Height : " + height + " cm");
		System.out.println("Weight : " + weight + " kg");
		System.out.println("BloodType : " + bloodType);

	}

}
