package com.ssafy.ws.step5;

import java.util.Date;

/**
 * 댓글 정보를 나타내는 클래스
 */
public class Comment {
	int commentId;
	int articleId;
	int iserSeq;
	String content;
	Date regDate;
	public Comment() {

	}
	public Comment(int commentId, int articleId, int iserSeq, String content, Date regDate) {

		this.commentId = commentId;
		this.articleId = articleId;
		this.iserSeq = iserSeq;
		this.content = content;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", articleId=" + articleId + ", iserSeq=" + iserSeq + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
	
}
