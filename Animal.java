/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercyproject251;

import cpit380practice.Picture;
import java.io.File;

public class Animal {

    String name;
    int age;
    String type;
    String sex;
    File medicalState;
    Picture picture;
    Animal next;

    public Animal(String name, int age, String type, File medicalState, Picture picture, Animal next) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.medicalState = medicalState;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMedicalState(File medicalState) {
        this.medicalState = medicalState;
    }

    public void setNext(Animal next) {
        this.next = next;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getSex() {
        return sex;
    }

    public File getMedicalState() {
        return medicalState;
    }

    public Animal getNext() {
        return next;
    }

}
