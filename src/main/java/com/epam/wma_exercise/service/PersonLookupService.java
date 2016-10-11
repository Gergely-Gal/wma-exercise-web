package com.epam.wma_exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.wma_exercise.dao.PersonDao;
import com.epam.wma_exercise.domain.Person;

@Service
public class PersonLookupService {

    private PersonDao personDao;

    @Autowired
    public PersonLookupService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<Person> findAll() {
        return personDao.findAll();
    }

}
