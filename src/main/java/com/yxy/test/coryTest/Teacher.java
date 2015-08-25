package com.yxy.test.coryTest;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class Teacher implements Cloneable {

    private String name;

    private Integer age;

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        return (Teacher)super.clone();
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
}
