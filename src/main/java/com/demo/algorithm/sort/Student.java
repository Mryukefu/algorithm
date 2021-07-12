package com.demo.algorithm.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student implements Comparable<Student>{

    private String name;

    private Integer age;

    @Override
    public int compareTo(Student last) {
        if (last==null){
            return 0;
        }
        return this.age-last.age;
    }
}
