package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {

		MovieManager manager = new MovieManager();

		// 일반 영화
		Movie m1 = new Movie(1, "인셉션", "놀란","genre1", 148);
		Movie m2 = new Movie(2, "인터스텔라", "놀란", "genre2", 169);

		// 시리즈 영화
		SeriesMovie s1 = new SeriesMovie(3, "해리포터", "크리스콜럼버스", "genre3",152, 1, "1");
		SeriesMovie s2 = new SeriesMovie(4, "어벤져스", "루소형제", "genre4",143, 4, "2");

		// 영화 추가
		manager.add(m1);
		manager.add(m2);
		manager.add(s1);
		manager.add(s2);

		// 전체 영화 목록
		System.out.println("===== 전체 영화 목록 =====");
		System.out.println(Arrays.toString(manager.getList()));

		// 일반 영화만
		System.out.println("===== 일반 영화 =====");
		System.out.println(Arrays.toString(manager.getMovies()));

		// 시리즈 영화만
		System.out.println("===== 시리즈 영화 =====");
		System.out.println(Arrays.toString(manager.getSeriesMovie()));

		// 제목 검색
		System.out.println("===== 제목에 '터' 포함 =====");
		System.out.println(Arrays.toString(manager.searchByTitle("터")));

		// 평균 상영 시간
		System.out.println("===== 평균 상영 시간 =====");
		System.out.println(manager.getRunningTimeAvg());
	}
}
