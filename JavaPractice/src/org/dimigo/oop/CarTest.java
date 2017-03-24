/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * CarTest
 *
 * 1. Outline :
 * 2. Date : 2017. 3. 23.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setCompany("Hyundai");
		c1.setModel("Genesis");
		c1.setColor("Black");
		c1.setMaxSpeed(225);
		c1.setPrice(50000000);
		
		System.out.println("<< Car List >>");
		System.out.println("Company : " + c1.getCompany());
		System.out.println("Model : " + c1.getModel());
		System.out.println("Color : " + c1.getColor() );
		System.out.println("Max Speed : " + c1.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won\n\n", c1.getPrice());
		
		c2.setCompany("Kia");
		c2.setModel("K7");
		c2.setColor("White");
		c2.setMaxSpeed(246);
		c2.setPrice(40000000);
		
		System.out.println("Company : " + c2.getCompany());
		System.out.println("Model : " + c2.getModel());
		System.out.println("Color : " + c2.getColor() );
		System.out.println("Max Speed : " + c2.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won\n\n", c2.getPrice());
		
		c3.setCompany("Samsung");
		c3.setModel("SM7");
		c3.setColor("Gray");
		c3.setMaxSpeed(200);
		c3.setPrice(38000000);
		
		System.out.println("Company : " + c3.getCompany());
		System.out.println("Model : " + c3.getModel());
		System.out.println("Color : " + c3.getColor() );
		System.out.println("Max Speed : " + c3.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won", c3.getPrice());
		
		c1.dummy();
		
	}

}
