package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.util.StudentModel;
@Repository
public interface StudentDao extends JpaRepository<StudentModel, Integer> {

}
