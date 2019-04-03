package com.krishantha.sms.service;

import java.util.List;
import com.krishantha.sms.model.Student;
import com.krishantha.sms.repository.HibernateStudentRepositoryImpl;
import com.krishantha.sms.repository.StudentRepository;

public class StudentServiceImpl implements StudentService  {
	StudentRepository repository; //= new HibernateStudentRepositoryImpl();
	
	public StudentServiceImpl() {
		
	}
	
	public StudentRepository getRepository() {
		return repository;
	}


	public StudentServiceImpl(StudentRepository repository) {
		System.out.println("constructor fired");
		this.repository = repository;
	}

	public void setStudentRepository(StudentRepository repository) {
		System.out.println("setter fired");
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see com.krishantha.sms.service.StudentService#fetchAllStudents()
	 */
	@Override
	public List<Student> fetchAllStudents(){
		return repository.fetchAllStudent();
	}

}
