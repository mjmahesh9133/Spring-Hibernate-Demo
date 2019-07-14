package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.entity.Student;
import com.work.service.StudentService;

@Controller
public class StudentController
{
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/addstudent")
	public String displayAddStudentForm(Model model) 
	{
		
		Student student=new Student();
		model.addAttribute("student",student);
		return "AddStudent";
		
		
	}
	@RequestMapping(value="/saveProcess")
	public String saveProcess(@ModelAttribute("student") Student student)
	{
		studentService.saveStudentObj(student);
		return "ListStudents";
	}
}
