package com.naver.myhome5.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.myhome5.app.LogAdvice;
import com.naver.myhome5.dao.CommentDAO;
import com.naver.myhome5.domain.Comment;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDAO dao;
	
	@Autowired
	private LogAdvice log;
	
//	@Autowired
//	public CommentServiceImpl(CommentDAO dao) {
//		this.dao = dao;
//	}

	@Override
	public int getListCount(int board_num) {
		log.beforeLog();
		return dao.getListCount(board_num);
	}

	@Override
	public List<Comment> getCommentList(int board_num, int page) {
		log.beforeLog();
		int startrow=1;
		int endrow=page*3;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("board_num",board_num );
		map.put("start",startrow);
		map.put("end", endrow);
		
		return dao.getCommentList(map);
	}

	@Override
	public int commentsInsert(Comment c) {
		return dao.commentInsert(c);
	}

	@Override
	public int commentsDelete(int num) {
		return dao.commentDelete(num);
	}

	@Override
	public int commentsUpdate(Comment co) {
		return dao.commentUpdate(co);
	}
	
	

}
