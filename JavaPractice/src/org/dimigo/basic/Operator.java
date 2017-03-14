/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * Operator
 *
 * 1. Outline :
 * 2. Date : 2017. 3. 14.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long money = 1700000;
		long employee = 3;
		long store = 1500;
		long annual = money*12*employee*store;
		
		System.out.println("<< Dimibene Annual Labour Cost >>");
		System.out.println("Monthly average wage : " + String.format("%,d", money) + " Won");
		System.out.println("Number of employees : " + String.format("%,d", employee));
		System.out.println("Number of stores : " + String.format("%,d", store)+"\n");
		System.out.println("Annual labour cost : " + String.format("%,d", annual) + " Won");
		
	}

}
