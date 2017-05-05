package com.example.administrator.main;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Student implements Serializable{

    public String name;
    public int age;
    public String sex;

    public Student(String sex, int age, String name) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }
}
