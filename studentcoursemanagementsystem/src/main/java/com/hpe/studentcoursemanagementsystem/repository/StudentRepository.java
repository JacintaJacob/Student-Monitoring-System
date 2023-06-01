package com.hpe.studentcoursemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpe.studentcoursemanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
