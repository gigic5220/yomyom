package co.pr.fi.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//모임장 관련 DB (모임 생성, 모임 삭제, 모임 통계, 모임 멤버 관리, 일정 관리 , 게시판 추가/수정/삭제 등)
@Repository
public class GroupMasterDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
}