package com.arseeniy.school.student;

public class StudentProgress {
    private int[] studentMarks = new int[5];

    public StudentProgress(int[] studentMarks) {
        this.studentMarks = studentMarks;
    }

    public int[] getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int[] studentMarks) {
        this.studentMarks = studentMarks;
    }
}