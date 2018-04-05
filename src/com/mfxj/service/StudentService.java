package com.mfxj.service;

import java.util.List;

import com.mfxj.pojo.Student;

public interface StudentService {
	//��ѯ������Ա����
	public List<Student> find();
	
	public int insert(Student s);

}
