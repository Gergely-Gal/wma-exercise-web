package com.epam.wma_exercise.repository;

import org.springframework.data.repository.CrudRepository;

import com.epam.wma_exercise.domain.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

}
