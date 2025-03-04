package com.springboot.app;

import com.springboot.app.model.Laptop;
import com.springboot.app.model.Student;
import com.springboot.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SpringbootApplication.class, args);
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
//		student.code();
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap= new Laptop();
		service.add(lap);
	}

}
