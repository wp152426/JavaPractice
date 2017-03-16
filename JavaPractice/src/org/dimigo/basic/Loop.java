/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * Loop
 *
 * 1. Outline :
 * 2. Date : 2017. 3. 15.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] charac = {"Magician", "Lord", "Knight", "Farmer"};
		int n, dam = 100;
		boolean out = true;
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("  <<Game Menu>>");
			System.out.println("1. Damage increase");
			System.out.println("2. Damage decrease");
			System.out.println("3. Set character");
			System.out.println("9. End");
			System.out.println("--------------------------------------");
			
			System.out.print("Select : ");
			n = sc.nextInt();
			
			switch (n)
			{
			case 1 :
				dam += 10;
				System.out.println("Damage has been increased. Now your damage : " + dam);
				break;
			case 2 :
				dam -= 10;
				System.out.println("Damage has been decreased. Now your damage : " + dam);
				break;
			case 3 :
				int k = new Random().nextInt(4);
				System.out.println("Now you are a(n) " + charac[k]);
				break;
			case 9 :
				out = false;
				sc.close();
				break;
			default :
				System.out.println("You chose wrong number!");
			}
		} while (out);

	}

}
