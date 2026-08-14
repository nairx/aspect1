package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.StudentService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class,args);
        StudentService service = context.getBean(StudentService.class);
        service.addStudent();
    }
}