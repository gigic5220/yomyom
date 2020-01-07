package co.pr.fi.domain;

import java.sql.Date;

//모임게시글댓글 
public class GComment {

	// 댓글키값
	private int commnetNum;

	// 모임게시글키값참조
	private int postKey;

	// 유저키값
	private int userKey;

	// 댓글내용
	private String commentContent;

	// 댓글참조번호
	private int commemtReRef;

	// 댓글레벨
	private int commentReLev;

	// 댓글순서
	private int commentReSeq;

	// 댓글등록날짜
	private Date commentDate;

	// 모임키값
	private int groupKey;

	public int getCommnetNum() {
		return commnetNum;
	}

	public void setCommnetNum(int commnetNum) {
		this.commnetNum = commnetNum;
	}

	public int getPostKey() {
		return postKey;
	}

	public void setPostKey(int postKey) {
		this.postKey = postKey;
	}

	public int getUserKey() {
		return userKey;
	}

	public void setUserKey(int userKey) {
		this.userKey = userKey;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getCommemtReRef() {
		return commemtReRef;
	}

	public void setCommemtReRef(int commemtReRef) {
		this.commemtReRef = commemtReRef;
	}

	public int getCommentReLev() {
		return commentReLev;
	}

	public void setCommentReLev(int commentReLev) {
		this.commentReLev = commentReLev;
	}

	public int getCommentReSeq() {
		return commentReSeq;
	}

	public void setCommentReSeq(int commentReSeq) {
		this.commentReSeq = commentReSeq;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getGroupKey() {
		return groupKey;
	}

	public void setGroupKey(int groupKey) {
		this.groupKey = groupKey;
	}

	// GComment 모델 복사
	public void CopyData(GComment param) {
		this.commnetNum = param.getCommnetNum();
		this.postKey = param.getPostKey();
		this.userKey = param.getUserKey();
		this.commentContent = param.getCommentContent();
		this.commemtReRef = param.getCommemtReRef();
		this.commentReLev = param.getCommentReLev();
		this.commentReSeq = param.getCommentReSeq();
		this.commentDate = param.getCommentDate();
		this.groupKey = param.getGroupKey();
	}
}
