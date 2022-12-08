package com.arseeniy.school.group;

import com.arseeniy.school.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> studentList = new ArrayList<>();

    public void initializeGroup(Student...students) {
        for (Student student: students){
            this.studentList.add(student);
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}