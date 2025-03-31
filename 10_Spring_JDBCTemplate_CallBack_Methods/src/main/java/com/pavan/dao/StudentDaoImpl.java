package com.pavan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pavan.bo.StudentBo;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private JdbcTemplate template;
	
	
	@Override
	public StudentBo getStudentByNo(int sNo) {
		return null;
	}

	@Override
	public List<StudentBo> getStudentsByNames(String name1, String name2) {
		return null;
	}

}
