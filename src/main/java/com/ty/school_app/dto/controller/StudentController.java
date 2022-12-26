package com.ty.school_app.dto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.school_app.dao.Studentdao;
import com.ty.school_app.dto.Student;
import com.ty.school_app.dto.repositry.StudentRepositroy;

@RestController
public class StudentController {

	@Autowired
	Studentdao studentdao;

	@PostMapping("savestudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentdao.saveStudent(student);
	}
	
	
	@GetMapping("get")
	public Student getStudent(@RequestParam int id) {
	   return studentdao.getStudent(id);
	}

	
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentdao.deleteStudent(id);
	}
	
	
	@PutMapping("update")
	public Student updateStudent(@RequestBody Student student,@RequestParam  int id) {
		Student student2 = studentdao.getStudent(id);
		
		if(student2!=null) {
			student.setId(id);
			return studentdao.saveStudent(student);
		}
		return null;
	}
}
