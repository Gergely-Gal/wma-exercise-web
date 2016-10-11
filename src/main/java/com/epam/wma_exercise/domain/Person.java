package com.epam.wma_exercise.domain;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String placeOfBirth;
    private String profession;

    public Person() {
    }

    public Person(String firstName, String lastName, Integer age, String placeOfBirth, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
