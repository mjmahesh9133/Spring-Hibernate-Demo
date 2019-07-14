package com.work.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.work.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveStudentObj(Student student) {
	
		sessionFactory.getCurrentSession().save(student);
	}
	
	
}
