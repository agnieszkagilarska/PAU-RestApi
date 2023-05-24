package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.*;
@Entity
public class SubjectClass implements Comparator<String> {


    @Id
    public String groupName;
    @ManyToMany
    public  List<Student> students = new ArrayList<Student>();

    @OneToMany
    public List<StudentWithGrade> grades = new ArrayList<>();
    public int maxStudents = 20;
    public SubjectClass() {
    }
    public SubjectClass(String groupName, int maxStudents) {
        this.groupName = groupName;
        this.maxStudents = maxStudents;
    }

    public SubjectClass(String groupName, List<Student> students, int maxStudents) {
        this.groupName = groupName;
        this.students = students;
        this.maxStudents = maxStudents;
    }


    public void addStudent(Student nowy) {

        if (students.size() == maxStudents) {
            System.err.println("Nie można dodać nowego studenta - grupa jest pełna");
        } else {
            if (students.contains(nowy)) {
                System.out.println("Student jest już obceny w grupie");
            } else students.add(nowy);
        }
    }
    public void removeStudent(Student stary) {
        students.remove(stary);
    }


    public void addPoints(Student istniejacy, double punkty) {
        istniejacy.iloscPunktow = punkty;
    }

    public void getStudent(Student istniejacy) {
        if (istniejacy.iloscPunktow == 0) {
            students.remove(istniejacy);
        }
    }
    @Deprecated
    public void addGrade(Student student, double grade) {

//        if (grades.containsKey(student)) {
//            grades.get(student).add(grade);
//        } else {
//            List<Double> gradesList = new ArrayList<>();
//            gradesList.add(grade);
//            grades.put(student, gradesList);
//        }
    }
    public double averGrade(Student student){
        int suma = 0;
        for (Double liczba : this.getGrades(student)) {
            suma += liczba;
        }
        student.iloscPunktow = suma/this.getGrades(student).size();
        return student.iloscPunktow;
    }

    public List<Double> getGrades(Student student) {
        return grades.get(student.id).getGrades();
    }

    public void changeCondition(Student istniejacy, StudentCondition zmiana) {
        istniejacy.stanStudenta = zmiana;
    }

    public void removePoints(Student istniejacy, double points) {
        istniejacy.iloscPunktow -= points;
    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }

    public Student search(String nazwisko) {
        Student pomocniczy = null;
        for (Student student : students) {
            if (compare(student.nazwisko, nazwisko) == 0) pomocniczy = student;
        }
        return pomocniczy;
    }

    public List<Student> searchPartial(String naz) {
        List OsobyzNaz = new ArrayList<Student>();
        for (Student student : students) {
            if (student.nazwisko.startsWith(naz) || student.imie.startsWith(naz)) {
                OsobyzNaz.add(student);
            }
        }
        return OsobyzNaz;
    }

    public int countByCondition(StudentCondition condition) {
        int count = 0;
        for (Student student : students) {
            if (student.stanStudenta == condition) count++;
        }
        return count;
    }

    public void summary() {
        for (Student student : students) {
            student.print();
        }
    }

    public List<Student> sortByName() {
        Collections.sort(students);
        return students;
    }
    public List<Student> sortByPoints(){
        Collections.sort(students, Comparator.comparingDouble(s -> s.iloscPunktow));
        return students;
    }
    public void max(){
        System.out.print(Collections.max(students, Comparator.comparingDouble(s -> s.iloscPunktow))) ;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}


