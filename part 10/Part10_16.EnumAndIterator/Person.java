/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author belal
 */
public class Person {

    private String name;
    private Education EduLevel;

    public Person(String name, Education e) {
        this.name = name;
        this.EduLevel = e;

    }

    public Education getEducation() {
        return this.EduLevel;
    }

    @Override
    public String toString() {
        return name + ", " + this.EduLevel;
    }

}
