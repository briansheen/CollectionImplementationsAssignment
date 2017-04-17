package com.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class Main {
    private static int scount = 0;
    private static int tcount = 0;
    private static List<Student> studentList = new ArrayList<>();
    private static List<Teacher> teacherList = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 60; ++i) {
            Student student = new Student();
            student.setGrade(1);
            student.setFirstName(RandomStringUtils.randomAlphabetic(3, 8));
            student.setLastName(RandomStringUtils.randomAlphabetic(3, 8));
            student.setId(++scount);
            studentList.add(student);
        }
        System.out.println(studentList);

        for (int i = 0; i < 3; ++i) {
            Teacher teacher = new Teacher();
            teacher.setGrade(1);
            teacher.setFirstName(RandomStringUtils.randomAlphabetic(3, 8));
            teacher.setLastName(RandomStringUtils.randomAlphabetic(3, 8));
            teacher.setId(++tcount);
            teacherList.add(teacher);
        }
        System.out.println(teacherList);

        Map<Teacher, List<Student>> classMap = new HashMap<>();
        classMap.put(teacherList.get(0), studentList.subList(0,20));
        classMap.put(teacherList.get(1),studentList.subList(20,40));
        classMap.put(teacherList.get(2),studentList.subList(40,60));

        System.out.println("Map Keyset: ");
        for(Teacher key : classMap.keySet()){
            System.out.println(key + ", ");
        }

        System.out.println("Map Values: ");
        for(List<Student> value : classMap.values()){
            System.out.println(value + ", ");
        }

        System.out.println("Map Entries: ");
        for(Map.Entry<Teacher, List<Student>> entry : classMap.entrySet()){
            System.out.println(entry + ", ");
        }

    }
}
