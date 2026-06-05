package com.ssafy.ws.step5;

public class CommentManager {

	private static final int MAX = 100;
	private Comment[] comments = new Comment[MAX];
	private int size = 0;

	// 댓글 추가
	public boolean addComment(Comment comment) {

		if (size >= MAX) {
			System.out.println("댓글 저장 공간이 가득 찼습니다.");
			return false;
		}

		comments[size++] = comment;
		System.out.println("댓글 등록 완료");
		return true;
	}

	// 특정 게시글 댓글 조회
	public void printComments(int articleId) {

		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (comments[i].getArticleId() == articleId) {
				System.out.println(comments[i]);
				found = true;
			}
		}

		if (!found) {
			System.out.println("댓글이 없습니다.");
		}
	}
}