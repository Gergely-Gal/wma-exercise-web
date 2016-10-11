package com.epam.wma_exercise.homepage.model;

import java.util.List;

import com.epam.wma_exercise.domain.Person;

public class HomepageModel {

    private String applicationName;
    private List<Person> people;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

}
