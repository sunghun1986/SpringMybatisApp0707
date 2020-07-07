package com.it.model.notice;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//spring에서는 CRUD를 수행하는 객체를 가리켜 repository라 한다.
//아래의 어노테이션이 붙으면 auto component scan의 대상이 될수 있다!
@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public List selectAll() {		
		List list = null;
		list = sessionTemplate.selectList("Notice.selectAll");
		return list;
	}
	
}
