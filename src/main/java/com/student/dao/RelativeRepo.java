package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.util.RelativeModel;
@Repository
public interface RelativeRepo extends JpaRepository<RelativeModel, Integer> {

}
