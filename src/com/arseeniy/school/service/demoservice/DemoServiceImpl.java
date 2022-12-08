package com.arseeniy.school.service.demoservice;

import com.arseeniy.school.group.Group;
import com.arseeniy.school.service.markservice.MarkCalculationServiceImpl;
import com.arseeniy.school.student.Student;
import com.arseeniy.school.student.StudentProgress;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService{

    private static List<Group> groupList = new ArrayList<>();

    private static MarkCalculationServiceImpl markCalculationService = new MarkCalculationServiceImpl();

    public static void startTest() {
        Student student1 = new Student("Ivan", new StudentProgress(new int[]{4,5,4,3,4}));
        Student student2 = new Student("Aleksey", new StudentProgress(new int[]{5,5,5,5,5}));
        Student student3 = new Student("Anastasia", new StudentProgress(new int[]{4,3,4,3,4}));
        Student student4 = new Student("Anton", new StudentProgress(new int[]{5,4,4,4,4}));
        Student student5 = new Student("Daria", new StudentProgress(new int[]{3,3,3,3,3}));
        Group group1 = new Group();
        groupList.add(group1);
        group1.initializeGroup(student1, student2, student3, student4, student5);
        System.out.println(markCalculationService.getGroupAverageMark(group1));
        System.out.println(markCalculationService.getStrStudentAverageMark(student1));
        System.out.println(markCalculationService.getStrStudentAverageMark(student2));
        System.out.println(markCalculationService.getExcellentStudentCount(group1));
        System.out.println(markCalculationService.getBadStudentCount(group1));
    }

}
