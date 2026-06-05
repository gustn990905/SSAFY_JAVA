package com.ssafy.ws.step5;

import java.util.Arrays;

public class ArticleManager {
	private static final int MAX_ARTICLE_SIZE = 1000;
	private Article[] articles = new Article[MAX_ARTICLE_SIZE];
	private int articleSize = 0;

	public Article[] getArticleList() {
		Article[] result = new Article[articleSize];
		for (int i = 0; i < articleSize; i++) {
			result[i] = articles[i];
		}
		return result;
	}

	public Article getArticle(int articleId) {
		for (int i = 0; i < articleSize; i++) {
			if (articles[i].getArticleId() == articleId) {
				return articles[i];
			}
		}
		return null;
	}

	public void addArticle(Article article) {
		if (articleSize < MAX_ARTICLE_SIZE) {
			articles[articleSize++] = article;
		}
	}

	public void removeArticle(int articleId) {
		for (int i = 0; i < articleSize; i++) {
			if (articles[i].getArticleId() == articleId) {
				for (int j = i; j < articleSize - 1; j++) {
					articles[j] = articles[j + 1];
				}
				articles[articleSize - 1] = null;
				articleSize--;
				return;
			}
		}
	}
}