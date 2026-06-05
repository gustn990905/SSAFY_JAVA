package com.ssafy.ws.step5;

public class CommentManager {
	private static final int MAX_COMMENT_SIZE = 1000;
	private Comment[] comment = new Comment[MAX_COMMENT_SIZE];
	private int commentSize;

	public void addComment(Comment comment) {
		if (commentSize < MAX_COMMENT_SIZE) {
			this.comment[commentSize++] = comment;
		}
	}

	public void removeComment(int commentId) {
		for (int i = 0; i < commentSize; i++) {
			if (comment[i].getCommentId() == commentId) {
				for (int j = i; j < commentSize - 1; j++) {
					comment[j] = comment[j + 1];
				}
				comment[commentSize - 1] = null;
				commentSize--;
				return;
			}
		}
	}

	public void removeArticle(int articleId) {
		for (int i = 0; i < commentSize; i++) {
			if (comment[i].getArticleId() == articleId) {
				for (int j = i; j < commentSize - 1; j++) {
					comment[j] = comment[j + 1];
				}
				comment[commentSize - 1] = null;
				commentSize--;
				i--;
			}
		}
	}

	public Comment[] getCommentList(int articleId) {
		int count = 0;
		for (int i = 0; i < commentSize; i++) {
			if (comment[i].getArticleId() == articleId) {
				count++;
			}
		}

		Comment[] result = new Comment[count];
		int idx = 0;
		for (int i = 0; i < commentSize; i++) {
			if (comment[i].getArticleId() == articleId) {
				result[idx++] = comment[i];
			}
		}

		return result;
	}
}