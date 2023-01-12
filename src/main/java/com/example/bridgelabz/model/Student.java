package com.example.bridgelabz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id ;
    private String name;
    private String city;
    private String college ;
}
