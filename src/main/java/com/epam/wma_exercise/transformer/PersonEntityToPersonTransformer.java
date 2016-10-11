package com.epam.wma_exercise.transformer;

import org.springframework.stereotype.Component;

import com.epam.wma_exercise.domain.Person;
import com.epam.wma_exercise.domain.PersonEntity;

@Component
public class PersonEntityToPersonTransformer {

    public Person transform(PersonEntity personEntity) {
        Person result = new Person(personEntity.getFirstName(), personEntity.getLastName(), personEntity.getAge(), personEntity.getPlaceOfBirth(),
                personEntity.getProfession());
        return result;
    }

}
