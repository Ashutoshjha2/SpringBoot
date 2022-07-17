package com.test.Teacher.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Teacher.entity.TeacherRecord;

public interface TeacherDao extends JpaRepository<TeacherRecord, Integer> {

}
