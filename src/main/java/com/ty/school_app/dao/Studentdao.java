package com.ty.school_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.school_app.dto.Student;
import com.ty.school_app.dto.repositry.StudentRepositroy;

@Repository
public class Studentdao {
	
	@Autowired
	StudentRepositroy repositroy;

	public Student saveStudent(Student student) {
     return		repositroy.save(student);
	}
	
	
	public Student getStudent(int id) {
		return repositroy.findById(id).get();
		
	}
	
	
	
	public String deleteStudent(int id) {
		 repositroy.deleteById(id);
		
		return "deleted";
	}

}
