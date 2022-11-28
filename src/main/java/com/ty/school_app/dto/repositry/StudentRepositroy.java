package com.ty.school_app.dto.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.school_app.dto.Student;



public interface StudentRepositroy extends JpaRepository<Student,Integer> {

}
