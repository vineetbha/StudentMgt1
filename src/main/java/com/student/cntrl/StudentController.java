package com.student.cntrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dao.RelativeRepo;
import com.student.service.StudentService;
import com.student.util.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	

	@PostMapping("/add")
	public String addStudent(@Valid @RequestBody Student studentDto) throws Exception {
      System.out.println("Calledddd");
		return studentService.addStudent(studentDto);
	}
	
	
	@PutMapping("/update")
	public String upadateStudent(@RequestBody Student studentupd) {
		return studentService.updateStudent(studentupd);
		}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRelative(@PathVariable("id")int id) {
		 studentService.deleteRelative(id);
		 return null;
	}
	
	
}
