package com.example.bridgelabz.repository;

import com.example.bridgelabz.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
