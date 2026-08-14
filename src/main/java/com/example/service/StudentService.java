package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
     public void addStudent() {
        System.out.println("Adding Student...");
    }

     public void deleteStudent() {
        System.out.println("Deleting Student...");
    }

}
