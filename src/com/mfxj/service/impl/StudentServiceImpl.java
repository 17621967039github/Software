package com.mfxj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfxj.dao.StudentDao;
import com.mfxj.pojo.Student;
import com.mfxj.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao student;
	//��ѯ������Ա����
	@Override
	public List<Student> find() {
		return student.find();
	}
	
	@Override
	public int insert(Student s) {
		return student.insert(s);
	}

	
		
}
