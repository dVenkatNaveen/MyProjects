package com.springjdbc.app;

import com.springjdbc.app.model.Student;
import com.springjdbc.app.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);
//		Student student=context.getBean(Student.class);
//		student.setRollno(1);
//		student.setName("Naveen");
//		student.setMarks(70);

		Student student2=context.getBean(Student.class);
		student2.setRollno(2);
		student2.setName("Manish");
		student2.setMarks(80);

		StudentService studentService = context.getBean(StudentService.class);
		//studentService.addStudent(student2);

		List<Student> students = studentService.getAllStudent();
		System.out.println(students);

	}

}
