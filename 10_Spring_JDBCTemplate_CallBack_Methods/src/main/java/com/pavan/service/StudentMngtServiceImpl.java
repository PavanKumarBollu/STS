package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dao.IStudentDao;
import com.pavan.dto.StudentDto;

@Service
public class StudentMngtServiceImpl implements IStudentMngtService{

	@Autowired
	private IStudentDao dao;
	
	
	
	@Override
	public StudentDto getStudentByNo(int sNo) {
		return null;
	}

	@Override
	public List<StudentDto> getStudentsByNames(String name1, String name2) {
		return null;
	}

	
}
