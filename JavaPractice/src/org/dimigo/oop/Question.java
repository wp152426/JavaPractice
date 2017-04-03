package org.dimigo.oop;
import java.util.Scanner;

public class Question {
	
	static class QnA{
	private String questions[] = new String[3];
	private String answers[] = new String[3];
	
	public void add(String s1, String s2){
		for(int i=0; i<3; i++){
			if(questions[i] == null){
				questions[i] = s1;
				answers[i] = s2;
				break;
			}
		}
	}
	
	public String getQ(int n){
		return questions[n];
	}
	
	public String getA(int n){
		return answers[n];
	}
	
	public void compare(String s, int n){
		if(answers[n].toLowerCase().equals(s.toLowerCase()))
			System.out.println("Correct answer!");
		else System.out.println("Wrong answer..");
	}
		
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QnA st = new QnA();
		st.add("Favorite singer?", "IU");
		st.add("Favorite actor?", "Hyun Bin");
		st.add("Favorite subject?", "Calculus");
		
		String s;
		
		for(int i = 0; i<3; i++){
			System.out.println(st.getQ(i));
			s = sc.nextLine();
			st.compare(s, i);
		}
		
		sc.close();
		System.out.println();
		
		System.out.println("<<Result>>");
		for(int i=0; i<3; i++)
			System.out.println(new StringBuilder(st.getQ(i)).append(" " + st.getA(i)));

	}

}
