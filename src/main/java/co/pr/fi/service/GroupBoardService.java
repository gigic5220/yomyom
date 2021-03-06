package co.pr.fi.service;

import java.util.List;
import java.util.Map;

import co.pr.fi.domain.GComment;
import co.pr.fi.domain.Maps;
import co.pr.fi.domain.Post;

//그룹 장 처리
public interface GroupBoardService {
	Post detailBoard (Map<String, Object> keys);				// 게시글 상세 정보 가져오기
	int uploadMap(List<Maps> list);
	List<Maps> getMap(int postkey);
	int deleteAllMap();
	List<GComment> getBoardComment(Map<String, Object> keys);	// 게시글의 댓글 가져오기
	int isLiked(Map<String, Object> keys);						// 회원의 게시글 좋아요 여부
	int revokeLike(Map<String, Object> keys);					// 좋아요 취소
	int doLike(Map<String, Object> keys);						// 좋아요
	int likeCount(Map<String, Object> keys);
	int getCommentCount(Map<String, Object> data);				// 현재 글에 대한 댓글수
}
