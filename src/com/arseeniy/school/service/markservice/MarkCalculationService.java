package com.arseeniy.school.service.markservice;

import com.arseeniy.school.group.Group;
import com.arseeniy.school.student.Student;

public interface MarkCalculationService {
    public String getGroupAverageMark(Group group);

    public Integer getIntStudentAverageMark(Student student);

    public String getStrStudentAverageMark(Student student);

    public String getExcellentStudentCount(Group group);

    public String getBadStudentCount(Group group);
}
