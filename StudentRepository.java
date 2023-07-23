package com.sai.StudentRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.StudentEntity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
 public	List<StudentEntity> findByStudentHallTicket(long studentHallTicket);
 //public	String findByStudentHallTicket(long studentHallTicket);
}
