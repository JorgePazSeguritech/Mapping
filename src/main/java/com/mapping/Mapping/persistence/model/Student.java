package com.mapping.Mapping.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student extends DatabaseObject {
    @Column(name="first_name")
    private String fistName;
    private String lastName;
    private String curso;
    private Integer age;

    private String value;

    public Student(String fistName, String lastName, String curso, Integer age, String value) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.curso = curso;
        this.age = age;
        this.value = value;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Student() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
