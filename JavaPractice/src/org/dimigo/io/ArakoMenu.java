package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class ArakoMenu {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Writer writer = new BufferedWriter(new FileWriter("C:/Users/임형준/Desktop/IoTest.txt"));
				BufferedReader reader = new BufferedReader(new FileReader("C:/Users/임형준/Desktop/IoTest.txt"))){
			
			
			writer.flush();
			
			String str;
			System.out.println("<<메뉴 출력>>");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
