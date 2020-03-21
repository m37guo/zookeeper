package com.hermione.serialize;

import org.junit.Test;

import java.io.*;


/**
 * @author vermouth
 * @date 2020/3/21
 */
public class StudentTest {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        Student student = new Student("leihou", 8, 100);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        oos.writeObject(student);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Student obj = (Student) ois.readObject();
        System.out.println(obj);
    }
}