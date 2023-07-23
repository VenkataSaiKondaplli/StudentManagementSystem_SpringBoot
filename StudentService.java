package com.sai.StudentService;
import java.util.List;
import java.util.Optional;

import com.sai.StudentEntity.StudentEntity;

public interface StudentService {
	
  
   public StudentEntity updateStudent(StudentEntity studentEntity);
   public void deleteStudent(long studentHallTicket); 
   public Iterable<StudentEntity> getAllStudents();
   public StudentEntity saveStudent(StudentEntity student, String firstName, String lastName); 
   public Optional<StudentEntity> getSigleRecord(long studentHallTicket);
  
   public List<StudentEntity> getStudentById(long hallTicketNumber);
  
  
 
}
