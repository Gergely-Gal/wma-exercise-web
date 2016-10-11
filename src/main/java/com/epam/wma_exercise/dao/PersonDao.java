package com.epam.wma_exercise.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.wma_exercise.domain.Person;
import com.epam.wma_exercise.domain.PersonEntity;
import com.epam.wma_exercise.repository.PersonRepository;
import com.epam.wma_exercise.transformer.PersonEntityToPersonTransformer;

@Component
public class PersonDao {

    private PersonRepository personRepository;

    private PersonEntityToPersonTransformer transformer;

    @Autowired
    public PersonDao(PersonRepository personRepository, PersonEntityToPersonTransformer transformer) {
        this.personRepository = personRepository;
        this.transformer = transformer;
    }

    public List<Person> findAll() {
        List<Person> result = new ArrayList<Person>();
        for (PersonEntity personEntity : personRepository.findAll()) {

            result.add(transformer.transform(personEntity));
        }
        return result;
    }

}
