package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie(1, "제목1", "감독1", "장르1", 60);
		Movie movie2 = new Movie(2, "제목2", "감독2", "장르2", 80);
		
		System.out.println(movie1);
		System.out.println(movie2);
		
		MovieManager manager = new MovieManager();
		
		manager.add(movie1);
		manager.add(movie2);
		
		Movie[] list = manager.getList();
		for(Movie m : list) {
			System.out.println(m);
		}
		
		Movie[] searchList = manager.searchByTitle("제목");
		for(Movie m: searchList) {
			System.out.println(m);
		}
		
	}
}
