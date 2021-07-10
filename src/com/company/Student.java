package com.company;

import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private LocalDate born;
    private String studentsClass;
    Subject subjectOne;
    Subject subjectTwo;
    Subject subjectThree;
    Subject subjectFour;
    private float gradeOne;
    private float gradeTwo;
    private float gradeThree;
    private float gradeFour;

    public Student(String name, String surname, LocalDate born, String studentsClass, Subject subjectOne, Subject subjectTwo, Subject subjectThree, Subject subjectFour) {
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.studentsClass = studentsClass;
        this.subjectOne = subjectOne;
        this.subjectTwo = subjectTwo;
        this.subjectThree = subjectThree;
        this.subjectFour = subjectFour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public String getStudentsClass() {
        return studentsClass;
    }

    public void setStudentsClass(String studentsClass) {
        this.studentsClass = studentsClass;
    }

    public Subject getSubjectOne() {
        return subjectOne;
    }

    public void setSubjectOne(Subject subjectOne) {
        this.subjectOne = subjectOne;
    }

    public Subject getSubjectTwo() {
        return subjectTwo;
    }

    public void setSubjectTwo(Subject subjectTwo) {
        this.subjectTwo = subjectTwo;
    }

    public Subject getSubjectThree() {
        return subjectThree;
    }

    public void setSubjectThree(Subject subjectThree) {
        this.subjectThree = subjectThree;
    }

    public Subject getSubjectFour() {
        return subjectFour;
    }

    public void setSubjectFour(Subject subjectFour) {
        this.subjectFour = subjectFour;
    }

    public float getGradeOne() {
        return gradeOne;
    }

    public void setGradeOne(float gradeOne) {
        this.gradeOne = gradeOne;
    }

    public float getGradeTwo() {
        return gradeTwo;
    }

    public void setGradeTwo(float gradeTwo) {
        this.gradeTwo = gradeTwo;
    }

    public float getGradeThree() {
        return gradeThree;
    }

    public void setGradeThree(float gradeThree) {
        this.gradeThree = gradeThree;
    }

    public float getGradeFour() {
        return gradeFour;
    }

    public void setGradeFour(float gradeFour) {
        this.gradeFour = gradeFour;
    }


}
