package com.example.bridgelabz.controller;

import com.example.bridgelabz.model.Student;
import com.example.bridgelabz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")

public class MyController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudents")
    public ResponseEntity<?> addStudents(@RequestBody Student student){
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save) ;
    }

   @GetMapping("/get")
    public ResponseEntity<?> getStudents(){
       return ResponseEntity.ok(this.studentRepository.findAll());
   }
}
