package com.example.demo.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class StudentWithGrade {
    @Id
    public Integer studentId;
    @ElementCollection
    List<Double> grades;

    public StudentWithGrade(Integer studentId) {
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public StudentWithGrade() {
    }
}
