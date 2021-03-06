package co.pr.fi.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.pr.fi.domain.GUsers;
import co.pr.fi.domain.UserMessage;

@Repository
public class MessageDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public int sendMessage(UserMessage message) {
		return sqlSession.insert("message.sendMessage", message);
	}





	public List<UserMessage> getMyMessage(int key) {
		
		return sqlSession.selectList("message.getMyMessage",key);
	}



	public void readMessage(int userKey) {
		sqlSession.update("message.readMessage",userKey);
		
	}





	public int sendMessage(Map<String, Object> list) {
		return sqlSession.insert("message.sendMessageAll", list);
	}

}
