/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * SnackTest
 *
 * 1. Outline :
 * 2. Date : 2017. 4. 6.
 * </pre>
 *
 * @author 임형준
 * @version : 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		
		Snack[] s = new Snack[3];
		s[0] = new Snack("새우깡", "농심", 1100, 2);
		s[1] = new Snack("콘칲", "크라운", 1200, 1);
		s[2] = new Snack("허니버터칩", "해태", 1500, 4);
		
		int sum = 0;
		
		for(Snack v : s){
			System.out.println(v.toString());
			System.out.println();
			sum += v.calcPrice();
		}
		
		System.out.println("총합 : " + String.format("%,d", sum) + "원");
	}

}
