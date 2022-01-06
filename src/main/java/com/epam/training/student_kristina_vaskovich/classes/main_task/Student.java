package com.epam.training.student_kristina_vaskovich.classes.main_task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Student { //!!создание списка студентов, а также вывод данных по заданию в классе Main
    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private Date dateOfBirth;
    private String address;
    private int phone;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public Student(int id, String surname, String address, int phone) {
        this.id = id;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    public Student(int id, String faculty, String course, String group) {
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String firstName, String patronymic, Date dateOfBirth, String address, int phone, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public static List<Student> listOfStudentsOfFaculty(ArrayList<Student> students, String faculty) {
        return students.stream().filter(s -> s.getFaculty() != null && s.getFaculty().equals(faculty)).collect(Collectors.toList());
    }

    public static List<Student> listOfStudentsOfFacultyAndCourse(ArrayList<Student> students, String faculty, String course) {
        return students.stream().filter(s -> s.getFaculty() != null && s.getCourse() != null &&
                s.getFaculty().equals(faculty) && s.getCourse().equals(course)).collect(Collectors.toList());
    }

    public static List<Student> listOfStudentsWhoWereBornAfterDate(ArrayList<Student> students, Date date) {
        return students.stream().filter(s -> s.getDateOfBirth() != null && s.getDateOfBirth().after(date)).collect(Collectors.toList());
    }

    public static List<Student> listOfStudentsOfGroup(ArrayList<Student> students, String group) {
        return students.stream().filter(s -> s.getGroup() != null && s.getGroup().equals(group)).collect(Collectors.toList());
    }
}
