package com.hermione.serialize;

import org.apache.jute.BinaryInputArchive;
import org.apache.jute.BinaryOutputArchive;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author vermouth
 * @date 2020/3/21
 */
public class SerialTest {

    @Test
    public void testJute() throws Exception {
        Student student = new Student("hermione", 18, 100);
        OutputStream os = new FileOutputStream("student.txt");
        BinaryOutputArchive outputArchive = BinaryOutputArchive.getArchive(os);
        outputArchive.writeString(student.getUsername(), "username");
        outputArchive.writeInt(student.getAge(), "age");
        outputArchive.writeLong(student.getGrade(), "grade");
        os.flush();
        os.close();

        InputStream is = new FileInputStream("student.txt");
        BinaryInputArchive inputArchive = BinaryInputArchive.getArchive(is);
        System.out.println("username: " + inputArchive.readString("username"));
        System.out.println("age: " + inputArchive.readInt("age"));
        System.out.println("grade: " + inputArchive.readLong("grade"));
    }
}
