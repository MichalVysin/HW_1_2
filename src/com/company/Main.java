package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Josef", "Vomajda", LocalDate.of(2003, 2, 18),
                "4A", Subject.CZECH, Subject.ENGLISH, Subject.ECONOMY, Subject.HISTORY);
        Student student2 = new Student("Bohuslav", "Krecek", LocalDate.of(2002, 12, 25),
                "4A", Subject.CZECH, Subject.MATH, Subject.ECONOMY, Subject.HISTORY);
        Student student3 = new Student("Sarah", "Mala", LocalDate.of(2003, 4, 14),
                "4B", Subject.CZECH, Subject.MATH, Subject.ECONOMY, Subject.HISTORY);
        Student student4 = new Student("Lenka", "Velka", LocalDate.of(2002, 11, 1),
                "4A", Subject.CZECH, Subject.ENGLISH, Subject.ECONOMY, Subject.HISTORY);
        Student student5 = new Student("Petr", "Smrtak", LocalDate.of(2002, 11, 7),
                "4A", Subject.CZECH, Subject.MATH, Subject.ECONOMY, Subject.HISTORY);

        student1.setGradeOne(1);
        student1.setGradeTwo(1);
        student1.setGradeThree(5);
        student1.setGradeFour(2);

        student2.setGradeOne(1);
        student2.setGradeTwo(1);
        student2.setGradeThree(2);
        student2.setGradeFour(2);

        student3.setGradeOne(3);
        student3.setGradeTwo(2);
        student3.setGradeThree(3);
        student3.setGradeFour(6);

        student4.setGradeOne(1);
        student4.setGradeTwo(3);
        student4.setGradeThree(1);

        student5.setGradeOne(3);
        student5.setGradeTwo(4);
        student5.setGradeThree(2);
        student5.setGradeFour(2);

        showStudent(student1);
        showStudent(student2);
        showStudent(student3);
        showStudent(student4);
        showStudent(student5);

    }

    public static String howStudentPassedHisExam(Student student) {
        float diameter = (student.getGradeOne() + student.getGradeTwo() + student.getGradeThree() + student.getGradeFour()) / 4;
        if ((student.getGradeOne() > 5 || student.getGradeOne() < 1 ||
                student.getGradeTwo() > 5 || student.getGradeTwo() < 1 ||
                student.getGradeThree() > 5 || student.getGradeThree() < 1 ||
                student.getGradeFour() > 5 || student.getGradeFour() < 1)) {
            return "Známka není validní";

        } else if ((student.getGradeOne() == 5 || student.getGradeTwo() == 5 ||
                student.getGradeThree() == 5 || student.getGradeFour() == 5)) {
            return "Student neprospěl";

        } else if (diameter <= 1.5) {
            return "Student prospěl s vyznamenáním";

        } else if (diameter > 1.5 && diameter < 5) {
            return "Student prospěl";
        }
        return "Známka není validní";

    }

    public static String isStudentDone(Student student) {
        if (student.getGradeOne() > 0 && student.getGradeTwo() > 0 && student.getGradeThree() > 0 && student.getGradeFour() > 0) {
            return howStudentPassedHisExam(student);
        }
        return "Student ještě maturitu nedokončil!";
    }

    public static void showStudent(Student student) {
        System.out.print("Jméno: " + student.getName() + "\t" + "Příjmení: " + student.getSurname() + "\n" +
                "Datum narození: " + student.getBorn() + "\n" +
                "Třída: " + student.getStudentsClass() + "\n" +
                "________________________\n" +
                student.getSubjectOne().getDescription() + String.format("%.0f", student.getGradeOne()) + "\n" +
                student.getSubjectTwo().getDescription() + String.format("%.0f", student.getGradeTwo()) + "\n" +
                student.getSubjectThree().getDescription() + String.format("%.0f", student.getGradeThree()) + "\n" +
                student.getSubjectFour().getDescription() + String.format("%.0f", student.getGradeFour()) + "\n" +
                "________________________\n" +
                isStudentDone(student) + "\n" +
                "\n\n");


    }
}
