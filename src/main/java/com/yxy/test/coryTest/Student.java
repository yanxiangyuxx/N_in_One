package com.yxy.test.coryTest;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class Student implements Cloneable {

    private String name;

    private Integer age;

    private Teacher teacher;


    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    protected Student deepClone() throws CloneNotSupportedException {
        Student s = new Student();
        s =  (Student)super.clone();
        s.setTeacher(teacher.clone());

        return s;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
