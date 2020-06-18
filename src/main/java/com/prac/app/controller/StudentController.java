package com.prac.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.app.domain.Student;
import com.prac.app.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@PostMapping("/v1/students")
	public ResponseEntity<?> addStudents(@RequestBody Student student){
		return ResponseEntity.ok(studentService.addStudent(student));
	}
}
