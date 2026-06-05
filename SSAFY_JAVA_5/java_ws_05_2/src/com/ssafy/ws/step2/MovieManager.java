package com.ssafy.ws.step2;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * 
 * @author
 *
 */
public class MovieManager {
	private Movie[] movieList = new Movie[100];
	private int size = 0;
	
	public boolean add(Movie movie) {
		if(size < 100) {
			movieList[size] = movie;
			size++;
			return true;
		}else {
			return false;
		}
	}
	
	public Movie[] getList() {
		Movie[] result = new Movie[size];
		
		for(int i=0; i<size; i++) {
			result[i] = movieList[i];
		}
		return result;
	}
	
	public Movie[] searchByTitle(String title) {
		int cnt = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i].getTitle().equals(title)) {
				cnt++;
			}
		}
		
		Movie[] result = new Movie[cnt];
		int idx = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i].getTitle().equals(title)) {
				result[idx++] = movieList[i];
			}
		}
		return result;
	}
}
