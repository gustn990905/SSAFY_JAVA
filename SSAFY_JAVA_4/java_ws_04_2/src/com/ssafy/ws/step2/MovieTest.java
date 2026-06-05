package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {
		//코드를 작성해주세요. 
		
		Movie movie = new Movie(1, "A", "B", "C", 2);
		 System.out.println("id: "+movie.id);
		 System.out.println("title: "+movie.title);
		 System.out.println("director: "+movie.director);
		 System.out.println("genre: "+movie.genre);
		 System.out.println("runningTime: "+movie.runningTime);
	}

}
