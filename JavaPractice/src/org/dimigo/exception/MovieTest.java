package org.dimigo.exception;

public class MovieTest {

	public static void main(String[] args) {
		Movie[] movies = {new Movie("Alien : Covenant", 15), new Movie("Guardians of galaxy", 12)};
		int age = 13;
		
		for(Movie m : movies){
			try{
			m.buyTicket(age);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}

}
