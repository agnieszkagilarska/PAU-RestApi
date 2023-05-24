package com.example.demo.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@Entity
//@Data
public class UserData {

//    private static final UserData INSTANCE = new UserData();
//    public Map<String, List<Double>>gradesBySubject = new HashMap<>();
//
//    private String username;
//    private String password;
//    @OneToOne
//    private Student student;
//    @ElementCollection
//    private List<String> subjects = new ArrayList<>();
//    @ElementCollection
//    private List <Double> subjectAverage = new ArrayList<>();
//    private Map<String, SubjectClass> groups = new HashMap<>();
//
//    private UserData() {}
//
//
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//    public List<Double> getSubjectAverage() {
//        for (Map.Entry<String, List<Double>> entry : gradesBySubject.entrySet()) {
//
//            List<Double> grades = entry.getValue();
//            subjectAverage.add(calculateAverage(grades));
//
//        }
//        return subjectAverage;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public UserData(Student student) {
//        this.student = student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public static UserData getInstance() {
//        return INSTANCE;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public void updateStudent(Student student) {
//        UserData.getInstance().setStudent(student);
//
//    }
//    public void addSubject(String subject) {
//        if (!subjects.contains(subject)) {
//            subjects.add(subject);
//        }
//    }
//    public void removeSubject(String subject) {
//        if (subjects.contains(subject)) {
//            subjects.remove(subject);
//        }
//    }
//
//    public void addGrade(String subject, Double grade) {
//        if (!gradesBySubject.containsKey(subject)) {
//            gradesBySubject.put(subject, new ArrayList<>());
//        }
//        gradesBySubject.get(subject).add(grade);
//
//    }
//
//    public List<Double> getGradesBySubject(String subject) {
//        return gradesBySubject.getOrDefault(subject, new ArrayList<>());
//
//    }
//    public double calculateAverage(List<Double> grades) {
//        if (grades.isEmpty()) {
//            return 0.0;
//        }
//
//        double sum = 0.0;
//        for (Double grade : grades) {
//            sum += grade;
//        }
//
//        return sum / grades.size();
//    }
//    public double calculateOverallAverage() {
//        double sum = 0;
//        int count = 0;
//        for (Map.Entry<String, List<Double>> entry : gradesBySubject.entrySet()) {
//
//            List<Double> grades = entry.getValue();
//            subjectAverage.add(calculateAverage(grades));
//            sum += subjectAverage.get(count);
//            count++;
//        }
//        double overallAverage = sum / count;
//        return overallAverage;
//    }
//
//    public Map<String, SubjectClass> getGroup() {
//        return groups;
//    }
//
//    public void setGroup(Map<String, SubjectClass> groups) {
//        this.groups = groups;
//    }
//
//    public void changeGroup(String selected, SubjectClass nowa){
//        groups.remove(selected);
//        groups.put(selected,nowa);
//    }

}
