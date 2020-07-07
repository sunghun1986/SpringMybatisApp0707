package com.it.model.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired //자동주입
	private NoticeDAO noticeDAO;
	
	public List selectAll() {		
		return noticeDAO.selectAll();
	}

}
