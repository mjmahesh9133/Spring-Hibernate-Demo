package com.work.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.StudentDAO;
import com.work.entity.Student;

@Service
public class StudentServiceImplo implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	@Transactional
	public void saveStudentObj(Student student) {
		
		studentDao.saveStudentObj(student);
	}

	
}
