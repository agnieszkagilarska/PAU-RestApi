package com.example.demo.entities;

import jakarta.persistence.*;

@Entity

public class Student implements Comparable<Student> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;

    String imie;
    String nazwisko;
    @Enumerated
    StudentCondition stanStudenta;
    int rokUrodzenia;
    double iloscPunktow;
    String email;

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStanStudenta(StudentCondition stanStudenta) {
        this.stanStudenta = stanStudenta;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public void setIloscPunktow(double iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public Student(String imie, String nazwisko, StudentCondition stanStudenta, int rokUrodzenia, double iloscPunktow, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanStudenta = stanStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.iloscPunktow = iloscPunktow;
        this.email = email;
    }


    public void print() {
        System.out.println("Imię: " + imie + " nazwisko: " + nazwisko + " stan studenta: " + stanStudenta.toString() + " rok urodzenia: " + rokUrodzenia + " ilosc punktow: " + iloscPunktow);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie: " + imie +
                " nazwisko: " + nazwisko +
                " stan studenta: " + stanStudenta +
                " rok urodzenia: " + rokUrodzenia +
                " ilość punktów: " + iloscPunktow +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.nazwisko.equals(o.nazwisko)) return 0;
        else return -1;
    }

    public String getImie() {
        return imie;
    }

    public StudentCondition getStanStudenta() {
        return stanStudenta;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getRokUrodzeniaString() {
        return String.valueOf(rokUrodzenia);
    }

    public double getIloscPunktow() {
        return iloscPunktow;
    }
}
