package com.ssafy.ws.step5;

public class ArticleManager {

	private static final int MAX = 100;
	private Article[] articles = new Article[MAX];
	private int size = 0;

	// 게시글 추가
	public boolean addArticle(Article article) {

		if (size >= MAX) {
			System.out.println("게시글 저장 공간이 가득 찼습니다.");
			return false;
		}

		articles[size++] = article;
		System.out.println("게시글 등록 완료");
		return true;
	}

	// 전체 게시글 반환
	public Article[] getAllArticles() {
		return articles;
	}

	// 게시글 개수
	public int getSize() {
		return size;
	}

	// ID로 게시글 찾기
	public Article getArticleById(int id) {
		for (int i = 0; i < size; i++) {
			if (articles[i].getArticleId() == id) {
				return articles[i];
			}
		}
		return null;
	}

	// 제목 검색
	public Article[] searchByTitle(String keyword) {

		Article[] result = new Article[size];
		int idx = 0;

		for (int i = 0; i < size; i++) {
			if (articles[i].getTitle().contains(keyword)) {
				result[idx++] = articles[i];
			}
		}

		return result;
	}

	// 일반 게시글 출력
	public void printNormalArticles() {
		for (int i = 0; i < size; i++) {
			if (!(articles[i] instanceof ImageArticle)) {
				System.out.println(articles[i]);
			}
		}
	}

	// 이미지 게시글 출력
	public void printImageArticles() {
		for (int i = 0; i < size; i++) {
			if (articles[i] instanceof ImageArticle) {
				System.out.println(articles[i]);
			}
		}
	}
}