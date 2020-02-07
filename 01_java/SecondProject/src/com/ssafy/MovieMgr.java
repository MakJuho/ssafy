package com.ssafy;

import java.util.Arrays;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index=0;
	
	// 싱글 톤
	private static MovieMgr instance;
	
	public static MovieMgr getinstance() {
		if(instance == null) {
			instance = new MovieMgr();
		}
		return instance;
	}
	
	public MovieMgr() {}
		
	public void add(Movie m) {
		movies[index] = m;
		index++;
	}
	
	public Movie[] search() {
		for(int i=0; i<index; i++) {
			System.out.println("======모든 영화 출력======");
			System.out.println(movies[i].getTitle());
			System.out.println(movies[i].getDirector());
			System.out.println(movies[i].getGrade());
			System.out.println(movies[i].getGenre());
			System.out.println(movies[i].getSummary());
		}
		return movies;
	}
	
	public Movie[] search(String title) {
		for(int i=0; i<index; i++) {
			System.out.println("======영화 제목 검색======");
			if(movies[i].getTitle().equals(title)) {
				System.out.println(movies[i].getTitle());
				System.out.println(movies[i].getDirector());
				System.out.println(movies[i].getGrade());
				System.out.println(movies[i].getGenre());
				System.out.println(movies[i].getSummary());
			}
		}
		return movies;
	}
	
	public Movie[] searchGenre(String genre) {
		for(int i=0; i<index; i++) {
			System.out.println("======영화 장르 검색======");
			if(movies[i].getGenre().equals(genre)) {
				System.out.println(movies[i].getTitle());
				System.out.println(movies[i].getDirector());
				System.out.println(movies[i].getGrade());
				System.out.println(movies[i].getGenre());
				System.out.println(movies[i].getSummary());
			}
		}
		return movies;
	}

	public Movie[] searchDirector(String name) {
		for(int i=0; i<index; i++) {
			System.out.println("======영화 감독명 검색======");
			if(movies[i].getDirector().equals(name)) {
				System.out.println(movies[i].getTitle());
				System.out.println(movies[i].getDirector());
				System.out.println(movies[i].getGrade());
				System.out.println(movies[i].getGenre());
				System.out.println(movies[i].getSummary());
			}
		}
		return movies;
	}
	
	
	public void delete(String title) {
	int pick_index=0;
		
		for(int i=0; i<index; i++) {
			if(title.equals(movies[i].getTitle())) {
				pick_index=i;	
			}
		}
		for(int i=pick_index; i<index; i++) {
			movies[i] = movies[i+1];
		}
		index--;
		System.out.println(Arrays.toString(movies));
	}
	
	public int getSize() {
		System.out.println("저장된 영화 수는:"+ index+"입니다.");
		return index;
	}
	
}
