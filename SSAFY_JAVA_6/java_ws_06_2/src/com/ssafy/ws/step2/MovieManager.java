package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * @author 
 *
 */
public class MovieManager {
	private static final int MAX_SIZE =100; 
	private Movie[] movieList = new Movie[MAX_SIZE];
	int size = 0;
	
	public void add(Movie movie) {
		if(size<MAX_SIZE) {
			movieList[size++] = movie;
 		}
	}
	
	public Movie[] getList() {
		Movie[] result = new Movie[size];
		
		for(int i=0;i<size;i++) {
			result[i] = movieList[i];
		}
		return result;
	}
	
	public Movie[] getMovies() {
		int cnt = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i] instanceof Movie && !(movieList[i] instanceof SeriesMovie)) {
				cnt++;
			}
		}
		Movie[] originalMovie = new Movie[cnt];
		int idx=0;
		for(int i=0; i<size;i++) {
			if(movieList[i] instanceof Movie && !(movieList[i] instanceof SeriesMovie)) {
				originalMovie[idx++] = movieList[i];
			}
		}
		return originalMovie;
	}
	
	public SeriesMovie[] getSeriesMovie() {
		int cnt = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}
		
		SeriesMovie[] series = new SeriesMovie[cnt];
		int idx = 0;
		for(int i=0;i<size;i++) {
			if(movieList[i] instanceof SeriesMovie) {
				series[idx++] = (SeriesMovie)movieList[i];
			}
		}
		return series;
	}
	
	public Movie[] searchByTitle(String title) {
		int cnt = 0;
		
		for(int i=0; i<size;i++) {
			if(movieList[i] != null && movieList[i].getTitle().contains(title)) {
				cnt++;
			}
		}
		
		Movie[] result = new Movie[cnt];
		int idx =0;
		for(int i=0; i<size;i++) {
			if(movieList[i] != null && movieList[i].getTitle().contains(title)) {
				result[idx++] = movieList[i];
			}
		}
		return result;
	}
	
	public double getRunningTimeAvg() {
		int total = 0;
		
		for(int i=0; i<size; i++) {
			total += movieList[i].getRunningTime();
		}
		return (double) total/size;
	}
	
}
