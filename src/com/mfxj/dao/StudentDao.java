package com.mfxj.dao;

import java.util.List;

import com.mfxj.pojo.Student;


public interface StudentDao {
	public List<Student> find();
	
	public int insert(Student s);
	
}
