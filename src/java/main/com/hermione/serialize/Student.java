package com.hermione.serialize;

import java.io.Serializable;

/**
 * @author vermouth
 * @date 2020/3/21
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private int age;
    private long grade;

    public Student(String username, int age, long grade) {
        this.username = username;
        this.age = age;
        this.grade = grade;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
