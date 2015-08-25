package com.yxy.test.coryTest;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class Main {


    public static void main(String arg[]){

        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.setName("老师");
        teacher.setAge(99);

        student.setName("学生");
        student.setAge(12);
        student.setTeacher(teacher);

        try {
            Student student2 = student.deepClone();
            student2.setName("学生2");
            student2.setAge(13);
            student2.getTeacher().setName("老师2");
            student2.getTeacher().setAge(100);
            System.out.println(teacher.getName()+","+teacher.getAge());
            System.out.println(student.getName()+","+student.getAge()+","+student.getTeacher().getName()+student.getTeacher().getAge());
            System.out.println(student2.getName()+","+student2.getAge()+","+student2.getTeacher().getName()+student2.getTeacher().getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}
