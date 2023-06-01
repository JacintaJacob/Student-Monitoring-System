package com.hpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.hpe.studentcoursemanagementsystem.entity.Student;
import com.hpe.studentcoursemanagementsystem.repository.StudentRepository;


@SpringBootApplication
public class StudentcoursemanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentcoursemanagementsystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception{
		
		/*Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		 studentRepository.save(student1);
		 
		 Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		 studentRepository.save(student2);
		 
		 Student student3 = new Student("tony", "stark", "tony@gmail.com");
		 studentRepository.save(student3);
		*/
	}

}
