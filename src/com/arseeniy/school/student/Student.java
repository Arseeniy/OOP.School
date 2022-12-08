package com.arseeniy.school.student;

public class Student {

    private StudentProgress studentProgress;
    private String name;

    public Student(String name, StudentProgress studentProgress) {
        this.name = name;
        this.studentProgress = studentProgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentProgress getStudentProgress() {
        return studentProgress;
    }

    public void setStudentProgress(StudentProgress studentProgress) {
        this.studentProgress = studentProgress;
    }
}