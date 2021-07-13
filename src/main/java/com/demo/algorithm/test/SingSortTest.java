package com.demo.algorithm.test;

import com.demo.algorithm.sort.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class SingSortTest {
    static Integer length  =100;
    static Student[] students = new Student[length];

    @BeforeClass
    public static void beforeClass() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int level = random.nextInt(500);
            Student student = new Student(level+"年级学生",level);
            students[i] = student;
        }
        System.out.println(Arrays.stream(students).map(student -> student.getAge().toString()).collect(Collectors.joining(",")));
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(Arrays.stream(students).map(student -> student.getAge().toString()).collect(Collectors.joining(",")));
    }

    @Test
    public void bubble(){
        SingleSort<Student> studentBubble = new Bubble(false);
        studentBubble.sort(students);
    }

    @Test
    public void select(){
        SingleSort<Student> studentBubble = new Selection();
        studentBubble.sort(students);
    }

    @Test
    public void insert(){
        SingleSort<Student> studentBubble = new Insertion<Student>();
        studentBubble.sort(students);
    }

    @Test
    public void shell(){
        SingleSort<Student> studentBubble = new ShellSort();
        studentBubble.sort(students);

    }

    @Test
    public void merge(){
        SingleSort<Student> studentBubble = new MergeSort(false);
        studentBubble.sort(students);
    }

    @Test
    public void quick(){
        SingleSort<Student> studentBubble = new QuickSort(false);
        studentBubble.sort(students);
    }
}
