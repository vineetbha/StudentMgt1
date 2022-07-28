package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.RelativeRepo;
import com.student.dao.StudentDao;
import com.student.util.Relative;
import com.student.util.RelativeModel;
import com.student.util.Student;
import com.student.util.StudentModel;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private RelativeRepo relativeRepo;

	public String addStudent(Student studentDto) {
		StudentModel student = new StudentModel();
		student.setRollNumber(studentDto.getRollNumber());
		student.setName(studentDto.getName());
		student.setEmail(studentDto.getEmail());
		student.setStandard(studentDto.getStandard());
		List<RelativeModel> list = new ArrayList<RelativeModel>();
		for (Relative dto : studentDto.getRelative()) {
			RelativeModel model = new RelativeModel();
			model.setrName(dto.getrName());
			model.setRelation(dto.getRelation());
			model.setAddress(dto.getAddress());
			list.add(model);
		}
		student.setRealtives(list);
		studentDao.save(student);
		return "Record Added Successfully";
	}
	
	public String updateStudent(Student studentupd) {
		StudentModel student = new StudentModel();
		student.setRollNumber(studentupd.getRollNumber());
		student.setName(studentupd.getName());
		student.setEmail(studentupd.getEmail());
		student.setStandard(studentupd.getStandard());
		List<RelativeModel> list = new ArrayList<RelativeModel>();
		for (Relative dto : studentupd.getRelative()) {
			RelativeModel model = new RelativeModel();
			model.setrName(dto.getrName());
			model.setRelation(dto.getRelation());
			model.setAddress(dto.getAddress());
			list.add(model);
		}
		student.setRealtives(list);
		studentDao.save(student);
		return "Record updated Successfully";
	}

	public void deleteRelative(int id) {
		studentDao.deleteById(id);
		
	}
	

}
