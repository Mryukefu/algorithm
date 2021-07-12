package com.demo.algorithm.test;

import com.demo.algorithm.sort.Student;
import org.junit.Test;

public class TestComparable {

    /**
     * 测试comparable 类
     */
    @Test
    public void testComparable(){
        Student parent = new Student("三年级学生",8);
            Student child = new Student("1年级学生",6);
        Student maxAgeStudent = maxAge(parent, child);
        System.out.println(maxAgeStudent);

    }
    private Student maxAge(Student pa,Student ch){
        int result = pa.compareTo(ch);
        if (result>0){
            return pa;
        }
        return ch;
    }
}
