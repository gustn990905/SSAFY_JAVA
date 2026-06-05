package com.ssafy.ws.step5;

import java.util.Date;

public class Article {

	protected int articleId;
	protected String title;
	protected String content;
	protected int userSeq;
	protected int viewCnt;
	protected Date regDate;

	public Article(int articleId, String title, String content, int userSeq) {
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = 0;
		this.regDate = new Date();
	}

	public int getArticleId() {
		return articleId;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void increaseView() {
		viewCnt++;
	}

	@Override
	public String toString() {
		return articleId + " | " + title + " | 조회수:" + viewCnt;
	}
}