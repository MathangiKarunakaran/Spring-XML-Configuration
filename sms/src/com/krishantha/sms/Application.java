package com.krishantha.sms;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.sms.model.Student;
import com.krishantha.sms.service.StudentService;
import com.krishantha.sms.service.StudentServiceImpl;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationcontext= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//StudentService service = new StudentServiceImpl();
		
		StudentService service = applicationcontext.getBean("StudentService", StudentService.class);
		List<Student> students = service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println(student.getName() + " studied at " + student.getCollege());
		}
	}
}
