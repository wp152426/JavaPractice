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
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car3 c1 = new Car3("Hyundai", "Genesis", "Black", 225, 50000000);
		Car3 c2 = new Car3("Kia", "K7", "White", 246);
		Car3 c3 = new Car3("Samsung", "SM7", "Gray");
		
		System.out.println("<< Car List >>");
		System.out.println("Company : " + c1.getCompany());
		System.out.println("Model : " + c1.getModel());
		System.out.println("Color : " + c1.getColor() );
		System.out.println("Max Speed : " + c1.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won\n\n", c1.getPrice());
		
		System.out.println("Company : " + c2.getCompany());
		System.out.println("Model : " + c2.getModel());
		System.out.println("Color : " + c2.getColor() );
		System.out.println("Max Speed : " + c2.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won\n\n", c2.getPrice());
		
		System.out.println("Company : " + c3.getCompany());
		System.out.println("Model : " + c3.getModel());
		System.out.println("Color : " + c3.getColor() );
		System.out.println("Max Speed : " + c3.getMaxSpeed() + " km");
		System.out.printf("Price : %,d won", c3.getPrice());
		
	}

}
