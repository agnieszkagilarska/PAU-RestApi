package com.example.demo;

import com.example.demo.entities.Student;
import com.example.demo.entities.StudentCondition;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        context.getBean(StudentRepository.class).save(new Student("Jan", "Kowalski", StudentCondition.ODRABIAJACY, 1990, 100, "adwas33@wp.pl"));
        context.getBean(StudentRepository.class).save(new Student("Jan", "Kowalski", StudentCondition.ODRABIAJACY, 1990, 100, "adwas33@wp.pl"));
    }

}
