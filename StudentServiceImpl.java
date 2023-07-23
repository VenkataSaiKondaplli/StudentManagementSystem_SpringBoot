package com.sai.StudentServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.StudentEntity.StudentEntity;
import com.sai.StudentRepository.StudentRepository;
import com.sai.StudentService.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentEntity saveStudent(@ModelAttribute StudentEntity student, @RequestParam String firstName,
			@RequestParam String lastName) {

		String fullName = firstName + " " + lastName;
		float percentage = 0.0f;
		int totalMarks = 0;
		student.setFullName(fullName);

		totalMarks = student.getSubject1() + student.getSubject2() + student.getSubject3() + student.getSubject4()
				+ student.getSubject5();
		percentage = totalMarks / 5;
		student.setTotalMarks(totalMarks);
		student.setAvgMarks(percentage);

		if (student.getSubject1() < 35 || student.getSubject2() < 35 || student.getSubject3() < 35
				|| student.getSubject4() < 35 || student.getSubject5() < 35) {
			student.setGrade("Fail");
		} else if (totalMarks >= 485) {
			student.setGrade("A+ grade");
		} else if (totalMarks >= 450 && totalMarks < 485) {
			student.setGrade("A grade");
		} else if (totalMarks >= 400 && totalMarks < 450) {
			student.setGrade("B+ grade");
		} else if (totalMarks >= 350 && totalMarks < 400) {
			student.setGrade("B grade");
		} else if (totalMarks >= 300 && totalMarks < 350) {
			student.setGrade("C grade");
		} else if (totalMarks >= 240 && totalMarks < 300) {
			student.setGrade("D grade");
		} else {
			student.setGrade("Fail");
		}

		return studentRepository.save(student);

	}

	@Override
	public StudentEntity updateStudent(@ModelAttribute StudentEntity student) {
		// TODO Auto-generated method stub
		// StudentEntity student=new StudentEntity();
		// float percentage = 0.0f;
		// int totalMarks = 0;
		// student.setFullName(fullName);

		int totalMarks = student.getSubject1() + student.getSubject2() + student.getSubject3() + student.getSubject4() + student.getSubject5();
		float percentage = totalMarks / 5;
		student.setTotalMarks(totalMarks);
		student.setAvgMarks(percentage);

		if (student.getSubject1() < 35 || student.getSubject2() < 35 || student.getSubject3() < 35
				|| student.getSubject4() < 35 || student.getSubject5() < 35) {
			student.setGrade("Fail");
		} else if (totalMarks >= 485) {
			student.setGrade("A+ grade");
		} else if (totalMarks >= 450 && totalMarks < 485) {
			student.setGrade("A grade");
		} else if (totalMarks >= 400 && totalMarks < 450) {
			student.setGrade("B+ grade");
		} else if (totalMarks >= 350 && totalMarks < 400) {
			student.setGrade("B grade");
		} else if (totalMarks >= 300 && totalMarks < 350) {
			student.setGrade("C grade");
		} else if (totalMarks >= 240 && totalMarks < 300) {
			student.setGrade("D grade");
		} else {
			student.setGrade("Fail");
		}

		return studentRepository.save(student);

	}

	@Override
	public void deleteStudent(long studentHallTicket) {
		/*
		 * Optional<StudentEntity> studentdelete =
		 * studentRepository.findById(studentHallTicket);
		 * 
		 * if (studentdelete.isPresent()) { StudentEntity student = studentdelete.get();
		 * studentRepository.delete(student); }
		 */
		studentRepository.deleteById(studentHallTicket);

	}

	@Override
	public Iterable<StudentEntity> getAllStudents() {
		Iterable<StudentEntity> allstudents = studentRepository.findAll();
		return allstudents;
	}

	@Override
	public Optional<StudentEntity> getSigleRecord(long studentHallTicket) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentHallTicket);
	}


	@Override
	public List<StudentEntity> getStudentById(long hallTicketNumber) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentHallTicket(hallTicketNumber);
	}

}
