package com.ssafy;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		MovieMgr mm = MovieMgr.getinstance();
		
		String title, director, Summary, Genre;
		int grade;
		
		
		
		while(true) {
			System.out.println("<<< 영화 관리 프로그램 >>>");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 선택하세요.");
			int num = sc.nextInt();
			switch (num) {
				case 1:
					System.out.print("영화 제목을 입력해주세요:");
					title = sc.next();
					System.out.print("영화 감독을 입력해주세요:");
					director = sc.next();
					System.out.print("영화 평점을 입력해주세요:");
					grade = sc.nextInt();
					System.out.print("영화 장르를 입력해주세요:");
					Genre = sc.next();
					System.out.print("영화를 요약해주세요:");
					Summary = sc.next();
					
					mm.add(new Movie(title,director, grade,Genre,Summary));
		//			mm.add(new Movie("트랜스포머","감독-2",4,"SF","자동차 로봇"));
					break;
				case 2:

					mm.search();
					break;
				case 3:
					System.out.println("검색할 영화 제목을 입력해주세요:");
					title = sc.next();
					mm.search(title);
					break;
					
				case 4:
					
					System.out.println("검색할 영화 장르를 입력해주세요:");
					Genre = sc.next();
					mm.searchGenre(Genre);
					break;
					
				case 5:
					System.out.println("삭제할 영화 제목을 입력해주세요:");
					Genre = sc.next();
					mm.delete(Genre);
					break;
					
				case 0:
					System.out.print("종료합니다.!\n");
					System.exit(0);
					break;
			
				default:
					break;
				}
		
		}
		
	}
	
	
	
	
}
