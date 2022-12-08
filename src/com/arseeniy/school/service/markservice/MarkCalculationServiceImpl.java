package com.arseeniy.school.service.markservice;

import com.arseeniy.school.group.Group;
import com.arseeniy.school.student.Student;

public class MarkCalculationServiceImpl implements MarkCalculationService {

    @Override
    public String getGroupAverageMark(Group group) {
        int studentAverageMark = 0;
        for (Student student : group.getStudentList()) {
            studentAverageMark += getIntStudentAverageMark(student);
        }
        return "Средний балл учебной группы: " + studentAverageMark / group.getStudentList().size();
    }

    @Override
    public Integer getIntStudentAverageMark(Student student) {
        int sum = 0;
        for (Integer mark : student.getStudentProgress().getStudentMarks()) {
            sum += mark;
        }
        return sum / student.getStudentProgress().getStudentMarks().length;
    }

    @Override
    public String getStrStudentAverageMark(Student student) {
        int sum = 0;
        for (Integer mark : student.getStudentProgress().getStudentMarks()) {
            sum += mark;
        }
        return "Средний балл студента " + student.getName() + ": " + sum / student.getStudentProgress().getStudentMarks().length;
    }

    @Override
    public String getExcellentStudentCount(Group group) {
        int excellentStudentCount = 0;
        for (Student student : group.getStudentList()) {
            if (getIntStudentAverageMark(student) == 5) {
                excellentStudentCount++;
            }
        }
        return "Количество студентов, имеющих \"отлично\": " + excellentStudentCount;
    }


    @Override
    public String getBadStudentCount(Group group) {
        int badStudentCount = 0;
        for (Student student : group.getStudentList()) {
            if (getIntStudentAverageMark(student) == 3) {
                badStudentCount++;
            }
        }
        return "Количество студентов, имеющих \"неудовлитворительно\": " + badStudentCount;
    }
}
