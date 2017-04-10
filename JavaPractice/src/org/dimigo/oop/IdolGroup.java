/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * IdolGroup
 *
 * 1. Outline :
 * 2. Date : 2017. 4. 10.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] groupName = {"BigBang", "2NE1", "Girl's Day"};
		String[][] memberName = {
				{"GD", "TOP", "TaeYang", "DaeSung", "SengLi"},
				{"CL", "Sandara", "ParkBom", "MinG"},
				{"YuRa", "HaeLi", "SoJin", "MinAh"}
		};
		
		for (int i = 0; i < 3; i++){
			System.out.println("<< " + groupName[i] + " >>");
			for(int j = 0; j < memberName[i].length; j++)
				System.out.println(memberName[i][j]);
			System.out.println();
		}
	}

}
